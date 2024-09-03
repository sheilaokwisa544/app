package com.example.appy.data



import android.app.ProgressDialog
import android.content.Context
import android.net.Uri
import android.widget.Toast
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavController

import com.example.appy.models.Student
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.navigation.ADD_PRODUCTS_URL


import com.example.sellapy.navigation.ROUT_LOGIN
import com.example.sellapy.navigation.VIEW_PRODUCTS_URL

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage

class StudentViewModel(var navController: NavController, var context: Context) {
    var authViewModel: AuthViewModel
    var progress: ProgressDialog
    init {
        authViewModel = AuthViewModel(navController, context)
        if (!authViewModel.isLoggedIn()){
            navController.navigate(ROUT_LOGIN)
        }
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }

    fun uploadStudent(name:String, email:String, age:String, filePath: Uri){
        val StudentId = System.currentTimeMillis().toString()
        val storageRef = FirebaseStorage.getInstance().getReference()
            .child("Students/$StudentId")
        progress.show()
        storageRef.putFile(filePath).addOnCompleteListener{
            progress.dismiss()
            if (it.isSuccessful){
                // Save data to db
                storageRef.downloadUrl.addOnSuccessListener {
                    var imageUrl = it.toString()
                    var student = Student(name,email,age,imageUrl, StudentId)
                    var databaseRef = FirebaseDatabase.getInstance().getReference()
                        .child("Students/$StudentId")
                    databaseRef.setValue(student).addOnCompleteListener {
                        if (it.isSuccessful){
                            navController.navigate(VIEW_PRODUCTS_URL)
                            Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }else{
                Toast.makeText(this.context, "Upload error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun allStudents(
        student: MutableState<Student>,
        students: SnapshotStateList<Student>):SnapshotStateList<Student>{
        progress.show()
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Students")
        ref.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                students.clear()
                for (snap in snapshot.children){
                    var retrievedStudent = snap.getValue(Student::class.java)
                    student.value = retrievedStudent!!
                    students.add(retrievedStudent)
                }
                progress.dismiss()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, "DB locked", Toast.LENGTH_SHORT).show()
            }
        })
        return students
    }

    fun updateStudent(studentId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Students/$studentId")
        ref.removeValue()
        navController.navigate(ADD_PRODUCTS_URL)
    }


    fun deleteStudent(StudentId:String){
        var ref = FirebaseDatabase.getInstance().getReference()
            .child("Products/$StudentId")
        ref.removeValue()
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show()
    }
}


// second step after models