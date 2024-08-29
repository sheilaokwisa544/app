package com.example.sellapy.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appy.R
import com.example.appy.ui.theme.cccc
import com.example.appy.ui.theme.ssss
import com.example.sellapy.navigation.ROUT_DETAIL
import com.example.sellapy.navigation.ROUT_INTENT
import com.example.sellapy.navigation.ROUT_LOGIN
import com.example.sellapy.navigation.ROUT_SIGNUP
import com.example.sellapy.navigation.ROUT_SPLASH


@Composable
fun DashboardScreen(navController: NavController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ssss)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter = painterResource(id = R.drawable.img_6),
            contentDescription = "product",
            modifier = Modifier.size(100.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Your best online shop",
            color = Color.White,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp,


            )
        Spacer(modifier = Modifier.height(30.dp))


        // main card

        Column {


            // main card

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(cccc)
            ) {

                // row

                Row(modifier = Modifier.padding(20.dp)) {

                    // card 1
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .padding(10.dp)
                    )


                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_7),
                                contentDescription = "",
                                modifier = Modifier.size(130.dp)
                            )
                        }
                        Text(
                            text = "home",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    navController.navigate(ROUT_DETAIL)
                                },

                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )


                    }
                    // end of card 1


                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .padding(10.dp)
                    )


                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_7),
                                contentDescription = "",
                                modifier = Modifier.size(130.dp)
                            )
                        }
                        Text(
                            text = "home",
                            modifier = Modifier.fillMaxWidth().clickable {
                                navController.navigate(
                                    ROUT_LOGIN
                                )},
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,

                        )


                    }

                }


                // end of row


                // row2
                Row(modifier = Modifier.padding(20.dp)) {

                    // card 1
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .padding(10.dp)
                    )


                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_10),
                                contentDescription = "",
                                modifier = Modifier.size(130.dp)
                            )
                        }
                        Text(
                            text = "settings",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    navController.navigate(
                                        ROUT_DETAIL
                                    )
                                },
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )


                    }
                    // end of card 1


                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .padding(10.dp)
                    )


                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_8),
                                contentDescription = "",
                                modifier = Modifier.size(130.dp)
                            )
                        }
                        Text(
                            text = "message",
                            modifier = Modifier.fillMaxWidth().clickable {
                                navController.navigate(
                                    ROUT_SIGNUP
                                )},
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )


                    }

                }


                // end of row



                // row 3
                Row(modifier = Modifier.padding(20.dp)) {

                    // card 1
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .padding(10.dp)
                    )


                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_9),
                                contentDescription = "",
                                modifier = Modifier.size(130.dp)
                            )
                        }
                        Text(
                            text = "intent",
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    navController.navigate(
                                        ROUT_INTENT
                                    )
                                },
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )


                    }
                    // end of card 1


                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .padding(10.dp)
                    )


                    {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_8),
                                contentDescription = "",
                                modifier = Modifier.size(130.dp)
                            )
                        }
                        Text(
                            text = "message",
                            modifier = Modifier.fillMaxWidth().clickable {
                                navController.navigate(
                                    ROUT_SPLASH
                                )},
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )


                    }

                }


                // end of row


            }


        }


    }
}


















@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}