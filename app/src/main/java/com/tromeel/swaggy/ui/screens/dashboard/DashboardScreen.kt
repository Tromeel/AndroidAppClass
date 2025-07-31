package com.tromeel.swaggy.ui.screens.dashboard

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tromeel.swaggy.R
import com.tromeel.swaggy.navigation.ROUT_CATEGORY
import com.tromeel.swaggy.navigation.ROUT_DETAIL
import com.tromeel.swaggy.navigation.ROUT_HOME
import com.tromeel.swaggy.ui.theme.Orange
import com.tromeel.swaggy.ui.theme.Parple


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Parple
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray,
                modifier = Modifier.offset(y = 40.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,


        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())


            ) {
                Row(

                ) {

                    Column(

                    ) {
                        Spacer(modifier = Modifier.height(50.dp))

                        Text(
                            text = "Hi Samantha",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(start = 20.dp),



                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Here are your projects",
                            fontSize = 15.sp,
                            modifier = Modifier.padding(start = 20.dp),

                        )

                    }

                    Image(
                        painter = painterResource(R.drawable.woman),
                        contentDescription = "swaggy",
                        modifier = Modifier
                            .size(200.dp),
                        alignment = Alignment.TopEnd


                    )

                }

                Spacer(modifier = Modifier.height(10.dp))

                Row (
                    Modifier.horizontalScroll(rememberScrollState())

                ){
                    //CARD
                    Card(onClick = {},
                        Modifier
                            .height(300.dp)
                            .width(180.dp)
                            .padding(start = 20.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),




                        colors = CardDefaults.cardColors(Color.Blue),








                    ) {
                        Column() {
                            Spacer(modifier = Modifier.height(50.dp))

                            Image(
                                painter = painterResource(R.drawable.graph),
                                contentDescription = "graph",
                                modifier = Modifier
                                    .size(width =1500.dp, height = 150.dp)
                                    .padding(start = 20.dp, end = 20.dp),
                                alignment = Alignment.TopEnd


                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Cryptocurrency Leading page",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                                ,
                                color = Color.White

                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 tasks",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp),
                                color = Color.White


                            )
                        }
                    }
                    //END OF CARD

                    //CARD
                    Card(onClick = {},
                        Modifier
                            .height(300.dp)
                            .width(180.dp)
                            .padding(start = 20.dp),


                        colors = CardDefaults.cardColors(Orange),
                        elevation = CardDefaults.elevatedCardElevation(5.dp)








                        ) {
                        Column() {
                            Spacer(modifier = Modifier.height(50.dp))

                            Image(
                                painter = painterResource(R.drawable.pie),
                                contentDescription = "pie_chart",
                                modifier = Modifier
                                    .size(width =1500.dp, height = 150.dp)
                                    .padding(start = 20.dp, end = 20.dp),
                                alignment = Alignment.TopEnd


                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Statistics Dashboard",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                                ,
                                color = Color.White

                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "7 tasks",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp),
                                color = Color.White


                            )
                        }
                    }
                    //END OF CARD

                    //CARD
                    Card(onClick = {},
                        Modifier
                            .height(300.dp)
                            .width(180.dp)
                            .padding(start = 20.dp),


                        colors = CardDefaults.cardColors(Color.Green),
                        elevation = CardDefaults.elevatedCardElevation(5.dp)








                        ) {
                        Column() {
                            Spacer(modifier = Modifier.height(50.dp))

                            Image(
                                painter = painterResource(R.drawable.graph),
                                contentDescription = "graph",
                                modifier = Modifier
                                    .size(width =1500.dp, height = 150.dp)
                                    .padding(start = 20.dp, end = 20.dp),
                                alignment = Alignment.TopEnd


                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Cryptocurrency Leading page",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                                ,
                                color = Color.White

                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 tasks",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp),
                                color = Color.White


                            )
                        }
                    }
                    //END OF CARD

                }

                Spacer(modifier = Modifier.height(30.dp))


                   Column(
                       modifier = Modifier
                           .background(Color.LightGray)
                           .fillMaxHeight()


                   ) {
                       Spacer(modifier = Modifier.height(10.dp))
                       Text(
                           text = "Personal Tasks",
                           fontSize = 20.sp,
                           modifier = Modifier.padding(start = 20.dp),
                           fontWeight = FontWeight.Bold

                       )

                       Spacer(modifier = Modifier.height(10.dp))

                       Card(
                           onClick = {},
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(70.dp)
                               .padding(start = 20.dp, end = 20.dp)

                           ) {




                           
                           Row (
                               modifier = Modifier
                                   .padding(top = 10.dp, bottom = 10.dp, )
                                   .fillMaxWidth()

                           ){





                               Image(
                                   painter = painterResource(R.drawable.camera),
                                   contentDescription = "camera",
                                   modifier = Modifier
                                       .size(50.dp)
                                       .padding(start = 10.dp, bottom = 10.dp)

                               )
                               Column(

                               ) {

                                   Box(modifier = Modifier
                                       .size(10.dp)
                                       .background(color = Color.Gray, shape = CircleShape)
                                       .align(alignment = Alignment.End)




                                   )



                                   Text(
                                       text = "NDA Review for website project",
                                       fontSize = 15.sp,
                                       modifier = Modifier
                                           .padding(start = 20.dp),
                                       fontWeight = FontWeight.Bold


                                   )

                                   Text(
                                       text = "Today -10pm",
                                       fontSize = 15.sp,
                                       modifier = Modifier.padding(start = 20.dp),


                                       )










                               }









                           }
                       }

                       Spacer(modifier = Modifier.height(20.dp))


                       Card(
                           onClick = {},
                           modifier = Modifier
                               .fillMaxWidth()
                               .height(70.dp)
                               .padding(start = 20.dp, end = 20.dp)
                       ) {
                           Row (
                               modifier = Modifier.padding(top = 10.dp, bottom = 10.dp )
                           ){


                               Image(
                                   painter = painterResource(R.drawable.envelope),
                                   contentDescription = "envelope",
                                   modifier = Modifier.size(50.dp)
                                       .padding(start = 10.dp, bottom = 10.dp)

                               )
                               Column() {


                                   Text(
                                       text = "Email Reply for Green Project",
                                       fontSize = 15.sp,
                                       modifier = Modifier.padding(start = 20.dp),
                                       fontWeight = FontWeight.Bold

                                   )

                                   Text(
                                       text = "Today -10pm",
                                       fontSize = 15.sp,
                                       modifier = Modifier.padding(start = 20.dp),


                                       )


                               }





                           }
                       }


                   }













            }











            }

    )

    //End of scaffold



}

@Preview
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}