package com.example.sellapy.ui.theme.screens.details

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appy.R
import com.example.appy.ui.theme.Bluee
import com.example.appy.ui.theme.cccc
import com.example.appy.ui.theme.ssss
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {


        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "SellApy", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Bluee),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu" , tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "notifications" , tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shopping cart" , tint = Color.White)
                }
            }

            )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(10.dp))


        //Search bar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search ,
            onValueChange = { search=it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder = { Text(text = "Browse your product...")}
        )
        //End of search bar

        Spacer(modifier = Modifier.height(10.dp))


       //Image
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
            ){
            Image(
                painter = painterResource(id = R.drawable.image2),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "favorite",
                modifier = Modifier
                    .align(alignment = Alignment.TopEnd)
                    .padding(10.dp),
                tint = Color.Red
            )
            Text(
                text = "GET YOURS TODAY",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp
            )

        }
        //End of Image


        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "more products",
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            fontSize = 30.sp

            )
        Spacer(modifier = Modifier.height(10.dp))




        // card





        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {

            Spacer(modifier = Modifier.width(10.dp))
            
            Card (modifier = Modifier
                .height(160.dp)
                .width(120.dp)){

                Box(modifier = Modifier.fillMaxSize(), contentAlignment =Alignment.Center ){
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                    }

            }
            // end of card 1

            Spacer(modifier = Modifier.width(10.dp))

            Card (modifier = Modifier
                .height(160.dp)
                .width(120.dp)){

                Box(modifier = Modifier.fillMaxSize(), contentAlignment =Alignment.Center ){
                    Image(
                        painter = painterResource(id = R.drawable.img_4),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            // end of card 2

            Spacer(modifier = Modifier.width(10.dp))
            Card (modifier = Modifier
                .height(160.dp)
                .width(120.dp)){

                Box(modifier = Modifier.fillMaxSize(), contentAlignment =Alignment.Center ){
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            // end of card 3

            Spacer(modifier = Modifier.width(10.dp))

            Card (modifier = Modifier
                .height(160.dp)
                .width(120.dp)){

                Box(modifier = Modifier.fillMaxSize(), contentAlignment =Alignment.Center ){
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            // end of card 4
        }

        // end of row1

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "additional information",
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            fontSize = 30.sp

        )
        // row2

        Row {
            // card
            Card (modifier = Modifier
                .height(160.dp)
                .width(200.dp)){

                Box(modifier = Modifier.fillMaxSize(), contentAlignment =Alignment.Center ){
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )


                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            // end of card

                // column
            Column(

            ) {
                Text(text = "Shop : SellAppy", fontSize = 20.sp)
                Text(text = "Brand : Alison",fontSize = 20.sp)
                Text(text = "location : Westlands",fontSize = 20.sp)
                Button(onClick = {

                    val callIntent= Intent(Intent.ACTION_DIAL)
                    callIntent.data="tel:0720245837".toUri()
                    mContext.startActivity(callIntent)
                },
                    colors = ButtonDefaults.buttonColors(cccc),
                    shape = RoundedCornerShape(10.dp)

                    ) {
                    Text(text = "call")
                }

            }


        }








    }



}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}