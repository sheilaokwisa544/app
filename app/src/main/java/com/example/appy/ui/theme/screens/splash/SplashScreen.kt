package com.example.sellapy.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appy.R
import com.example.appy.ui.theme.cccc
import com.example.sellapy.navigation.ROUT_DASHBOARD
import com.example.sellapy.navigation.ROUT_DETAIL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){


            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                
                // for movement
                val coroutine = rememberCoroutineScope()
                coroutine.launch {
                    delay(3000)
                    navController.navigate(ROUT_DASHBOARD)
                }

                
                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp),
                    shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
                    colors = CardDefaults.cardColors(cccc)

                ){
                    Column(verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()

                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_11),
                            contentDescription = "product",
                            modifier = Modifier.size(100.dp)
                        )

                        Text(
                            text = "welcome to sellappy",
                            fontFamily = FontFamily.Serif,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )



                        Text(
                            text = "home of fashion",
                            fontFamily = FontFamily.Serif,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 10.sp
                        )

                    }

                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "E-commerce allows businesses and consumers to conduct transactions" +
                            " electronically, often using websites or mobile apps, without the need ",
                    fontFamily = FontFamily.Serif,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()

                )

                Spacer(modifier = Modifier.height(15.dp))

                Button(
                    onClick = { navController.navigate(ROUT_DETAIL) },
                    colors = ButtonDefaults.buttonColors(cccc),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp)
                ) {
                    Text(text = "lets begin")
                }
                
                
                
                

                    }

                }








@Composable
@Preview(showBackground = true)
fun SplashScreen(){
    SplashScreen(rememberNavController())
}
