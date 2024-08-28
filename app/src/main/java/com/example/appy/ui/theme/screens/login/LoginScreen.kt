package com.example.appy.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
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
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appy.R
import com.example.appy.ui.theme.Bluee
import com.example.appy.ui.theme.cccc
import com.example.appy.ui.theme.ssss
import com.example.sellapy.navigation.ROUT_SIGNUP


@Composable
fun LoginScreen(navController: NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.img_20), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,

    ){


        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.img_9),
            contentDescription = "product",
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "Welcome Back!",
            fontSize = 70.sp,
            fontFamily = FontFamily.Cursive,
            color = cccc
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Already have an account? Please enter your credentials",
            fontSize = 20.sp,
            fontFamily = FontFamily.Default,
            color = ssss,
            textAlign = TextAlign.Center
        )


        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }




        Spacer(modifier = Modifier.height(10.dp))

        // email
        OutlinedTextField(
            value = email,
            onValueChange ={email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Blue) }, // icons at the beginning
            // trailing icon at the end
            label = { Text(text = "email address",color = White)},
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
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Blue) }, // icons at the beginning
            // trailing icon at the end
            label = { Text(text = "password",color = White)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.height(10.dp))

        // row

        Row {
                    // button user
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(Bluee)
            ) {
                Text(
                    text = "login as a user",

                    )
            }

            Spacer(modifier = Modifier.width(10.dp))


                    // button admin
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(Bluee)
            ) {
                Text(
                    text = "login as an admin",

                    )
            }
        }
        // end of row

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Do not have an account? Create account",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Black,
            modifier = Modifier.clickable { navController.navigate(ROUT_SIGNUP) }
        )






    }

}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}
