package com.tromeel.swaggy.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
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
import com.tromeel.swaggy.ui.theme.DarkBlue
import com.tromeel.swaggy.ui.theme.Parple
import com.tromeel.swaggy.ui.theme.Parplelight
import java.util.concurrent.locks.AbstractOwnableSynchronizer


@Composable
fun AboutScreen(navController: NavController){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.bg), contentScale = ContentScale.FillBounds)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement =  Arrangement.Center,



        ){
        Image(
            painter = painterResource(R.drawable.computer),
            contentDescription = "computer",
            modifier = Modifier
                .size(200.dp)

        )
        Spacer(modifier = Modifier.height(10.dp) )

        Text(
            text = "Easy Shopping",
            fontSize = 40.sp,
            color = DarkBlue

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "\"Easy shopping\" typically refers to convenient ways of buying goods or services, often leveraging technology like mobile apps or online platforms. It encompasses features like quick reordering, personalized recommendations, and streamlined checkout processes. One example is Text to Shop, where you can make purchases directly through text messages. \n",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp),




            )
        Spacer(modifier = Modifier.height(10.dp))



    }

    Row (
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 100.dp, start = 20.dp)





    ){

        Box(modifier = Modifier
            .size(10.dp)
            .background(color = Color.Gray, shape = CircleShape)



        )


        Spacer(modifier = Modifier.width(5.dp))

        Box(modifier = Modifier
            .size(10.dp)
            .background(color = Color.Gray, shape = CircleShape)
        )

        Spacer(modifier = Modifier.width(5.dp))


        Box(modifier = Modifier
            .size(10.dp)
            .background(color = Color.Gray, shape = CircleShape),


        )
        Spacer(modifier = Modifier.width(250.dp))


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(DarkBlue),


        ) {
            Text(text = "Next")

        }










    }


}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}