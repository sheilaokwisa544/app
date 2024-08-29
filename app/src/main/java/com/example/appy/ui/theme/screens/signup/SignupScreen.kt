package com.example.appy.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appy.R
import com.example.appy.ui.theme.Bluee
import com.example.appy.ui.theme.cccc
import com.example.sellapy.data.AuthViewModel
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.navigation.ROUT_LOGIN


@Composable
fun SignupScreen(navController: NavController){

    Column(

        modifier = Modifier
            .paint(painterResource(id = R.drawable.img_20), contentScale = ContentScale.FillBounds)
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {



        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.img_9),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "SellApy",
            fontSize = 70.sp,
            fontFamily = FontFamily.Cursive,
            color = Blue
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Do not have an account? Create account",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = White
        )


        var name by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confpassword by remember { mutableStateOf("") }

        Spacer(modifier = Modifier.height(10.dp))


        // text fields... normal and outlined
        // outlined

        OutlinedTextField(
            value = name,
            onValueChange ={name = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = Blue)}, // icons at the beginning
            // trailing icon at the end
            label = { Text(text = "full name",color = White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

            // email
        OutlinedTextField(
            value = email,
            onValueChange ={email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Blue)}, // icons at the beginning
            // trailing icon at the end
            label = { Text(text = "email address", color = White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(10.dp))


            // password
        OutlinedTextField(
            value = password,
            onValueChange ={password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Blue)}, // icons at the beginning
            // trailing icon at the end
            label = { Text(text = "password", color = White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))


        OutlinedTextField(
            value = confpassword,
            onValueChange ={confpassword = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = Blue)}, // icons at the beginning
            // trailing icon at the end
            label = { Text(text = "confirm password", color = White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))



        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Button(
            onClick = {
                authViewModel.signup(name, email, password,confpassword)
                      },
            colors = ButtonDefaults.buttonColors(Bluee)
        ) {
            Text(
                text = "create an account",

                )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {navController.navigate(ROUT_LOGIN) }) {
            Text(
                text = "Already have an account? Login",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = cccc,

                )
            
        }








    }



}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())
}
