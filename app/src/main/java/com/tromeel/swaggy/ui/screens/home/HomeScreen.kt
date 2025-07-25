package com.tromeel.swaggy.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tromeel.swaggy.R
import com.tromeel.swaggy.navigation.ROUT_ITEM
import com.tromeel.swaggy.ui.theme.Parple
import com.tromeel.swaggy.ui.theme.Parplelight

@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Parplelight),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement =  Arrangement.Center,


    ){
        Image(
            painter = painterResource(R.drawable.swaggy),
            contentDescription = "swaggy",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Swaggy",
            fontSize = 40.sp,
            color = Parple,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Find more products",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Swaggy clothes generally refers to fashionable, trendy, and stylish clothing, often with a confident or cool aesthetic. It's a slang term that implies a sense of swagger or a confident, stylish way of presenting oneself through clothing. \n",
            fontSize = 15.sp,
            textAlign = TextAlign.Center

            )


        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
            colors = ButtonDefaults.buttonColors(Parple),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)



        ) {
            Text(text = "Get Started")

        }





    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}



































