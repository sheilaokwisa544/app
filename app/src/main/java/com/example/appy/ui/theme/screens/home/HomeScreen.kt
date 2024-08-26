package com.example.sellapy.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appy.R
import com.example.appy.ui.theme.cccc
import com.example.appy.ui.theme.Bluee
import com.example.appy.ui.theme.Brown


import com.example.sellapy.navigation.ROUT_DETAIL


@Composable
fun HomeScreen(navController:NavController){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Brown),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.img_6) ,
            contentDescription = "product",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "SellApy",
            fontSize = 70.sp,
            fontFamily = FontFamily.Cursive,
            color = Yellow
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(
            onClick = { navController.navigate(ROUT_DETAIL) },
            colors = ButtonDefaults.buttonColors(Yellow)
        ) {
            Text(
                text = "Get Started",

            )
        }




    }

}




@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

    HomeScreen(navController = rememberNavController())

}