package com.tromeel.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.tromeel.swaggy.R
import com.tromeel.swaggy.ui.theme.LGreen


@Composable
fun DashboardScreen2(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp),
            colors = CardDefaults.cardColors(LGreen)



        ) {
            Column (
                modifier = Modifier.padding(20.dp)
            ){
                IconButton(
                    onClick = {}
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back", tint = Color.White)

                }



                Text(
                    text = "Cryptocurrency Landing page",
                    fontSize = 30.sp,
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )


                Spacer(modifier = Modifier.height(10.dp))


                  Row (
                      modifier = Modifier.padding(20.dp)


                  ){
                      Image(
                          painter = painterResource(R.drawable.woman1),
                          contentDescription = "graph",
                          modifier = Modifier
                              .size(30.dp)
                      )



                      Text(
                          text = "Samantha",
                          fontSize = 20.sp,
                          modifier = Modifier.padding(start = 20.dp)
                              .width(170.dp),
                          fontWeight = FontWeight.Bold,
                          color = Color.White

                      )








                  }
                  Row(

                  ) {
                      Text(
                          text = "Lorem ipsum dolor sit amet, consectotut adipsicing elist, sed do eemistut tempor incudiunt ut fabore et eltore magnus.",
                          fontSize = 15.sp,
                          modifier = Modifier
                              .padding(start = 20.dp)
                              .width(200.dp),
                          color = Color.White

                      )








                  }











            }


        }


        Spacer(modifier = Modifier.height(40.dp))


        /// ROW

        Row (
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp),

            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically


            



        ){
            //COLUMN
            Column (
                modifier = Modifier
                    .padding(end = 10.dp)


            ){
                Image(
                    painter = painterResource(R.drawable.adobe),
                    contentDescription = "graph",
                    modifier = Modifier
                        .size(110.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Layout Docs",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(100.dp),
                    fontWeight = FontWeight.Bold,


                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "PDF * 10MB",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(100.dp),
                    )



            }
            //END OF COLUMN




            //COLUMN
            Column (
                modifier = Modifier
                    .padding(end = 10.dp)

            ){
                Image(
                    painter = painterResource(R.drawable.video),
                    contentDescription = "graph",
                    modifier = Modifier
                        .size(110.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Presentation",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                    fontWeight = FontWeight.Bold,


                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "MDV * 10MB",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                )



            }
            //END OF COLUMN

            //COLUMN
            Column {
                Image(
                    painter = painterResource(R.drawable.doc),
                    contentDescription = "graph",
                    modifier = Modifier
                        .size(110.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "All Assets",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                    fontWeight = FontWeight.Bold,


                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "ZIP * 10MB",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                )



            }
            //END OF COLUMN
        }
        //END OF ROW

        Spacer(modifier = Modifier.height(10.dp))

        /// ROW

        Row (
            modifier = Modifier.padding(start = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically




        ){
            //COLUMN
            Column (
                modifier = Modifier
                    .padding(end = 10.dp)

            ){
                Image(
                    painter = painterResource(R.drawable.audio),
                    contentDescription = "graph",
                    modifier = Modifier
                        .size(110.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Layout Docs",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(100.dp),
                    fontWeight = FontWeight.Bold,


                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "PDF * 10MB",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .width(100.dp),
                )



            }
            //END OF COLUMN




            //COLUMN
            Column (
                modifier = Modifier
                    .padding(end = 10.dp)

            ){
                Image(
                    painter = painterResource(R.drawable.excel),
                    contentDescription = "graph",
                    modifier = Modifier
                        .size(110.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Layout Docs",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                    fontWeight = FontWeight.Bold,


                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "MDV * 10MB",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                )



            }
            //END OF COLUMN

            //COLUMN
            Column {
                Image(
                    painter = painterResource(R.drawable.word),
                    contentDescription = "graph",
                    modifier = Modifier
                        .size(110.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Layout Docs",
                    fontSize = 17.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                    fontWeight = FontWeight.Bold,


                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "ZIP * 10MB",
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 10.dp,)
                        .width(100.dp),
                )



            }
            //END OF COLUMN
        }
        //END OF ROW


        Spacer(modifier = Modifier.height(20.dp))

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp),
            verticalAlignment = Alignment.CenterVertically



        ){
            Text(
                text = "Discussions",
                fontSize = 15.sp,
                modifier = Modifier
                

            )

            Text(
                text = "Files",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 170.dp),
                fontWeight = FontWeight.Bold


            )



        }





    }



    }



@Preview(showBackground = true)
@Composable
fun DashboardScreen2Preview(){
    DashboardScreen2(rememberNavController())
}