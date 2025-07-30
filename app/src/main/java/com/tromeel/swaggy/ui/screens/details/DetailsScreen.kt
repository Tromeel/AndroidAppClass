package com.tromeel.swaggy.ui.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.tromeel.swaggy.navigation.ROUT_HOME
import com.tromeel.swaggy.navigation.ROUT_INTENT
import com.tromeel.swaggy.navigation.ROUT_ITEM
import com.tromeel.swaggy.ui.theme.Parple
import com.tromeel.swaggy.ui.theme.Parplelight


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Other Products") },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(ROUT_ITEM) }) {
                        Icon(Icons.Default.Menu, contentDescription = "menu")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Parple,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),

                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "shoppingcart"
                        )

                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "notifications"
                        )

                    }
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "share"
                        )

                    }
                }



            )
        },

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
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        navController.navigate(ROUT_CATEGORY)
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
                onClick = {navController.navigate(ROUT_INTENT) },
                containerColor = Parple
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .paint(painter = painterResource(R.drawable.bg), contentScale = ContentScale.FillBounds)


            ) {


                //Main Contents of the page

                //SearchBar
                Spacer(modifier = Modifier.height(10.dp))

                var search by remember { mutableStateOf( "") }
                OutlinedTextField(
                    value = search,
                    onValueChange = {search = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
                    placeholder = { Text(text = "Search products, categories...") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Parple,
                        focusedBorderColor = Color.Green
                    )
                )
                //SearchBar end

                Spacer(modifier = Modifier.height(10.dp))


                Text(
                    text = "Categories",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                //Row
                Row (
                    modifier = Modifier.padding(start = 20.dp)


                ){

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                        shape = RoundedCornerShape(50.dp),
                    ) {
                        Text(text = "Shoes")
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                        shape = RoundedCornerShape(50.dp),
                    ) {
                        Text(text = "Watches")
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
                        shape = RoundedCornerShape(50.dp),
                    ) {
                        Text(text = "Shirts")
                    }






                }
                //End of Row
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Trending",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp)

                )

                Spacer(modifier = Modifier.height(10.dp))

                Row (
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())  //SCROLL

                ){
                    //Start of card
                    Card(
                        onClick = {},
                        modifier = Modifier
                            .width(200.dp)
                            .height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp)
                        //colors = CardDefaults.
                    ) {
                        Column(

                        ) {
                            Image(
                                painter = painterResource(R.drawable.sneaker),
                                contentDescription = "shirt1",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Stylish Sneakers",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp)

                            )

                            Spacer(modifier = Modifier.height(10.dp))


                            Text(
                                text = "KES 3400",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp)

                            )






                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))

                    //Start of card
                    Card(
                        onClick = {},
                        modifier = Modifier
                            .width(200.dp)
                            .height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp)
                        //colors = CardDefaults.cardcolors(white)
                    ) {
                        Column(

                        ) {
                            Image(
                                painter = painterResource(R.drawable.sneaker),
                                contentDescription = "shirt1",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Stylish Sneakers",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp)

                            )

                            Spacer(modifier = Modifier.height(10.dp))


                            Text(
                                text = "KES 3400",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp)

                            )






                        }

                    }
                    //End of card



                }

            }
        }
    )

    //End of scaffold


}

@Preview
@Composable
fun DetailScreenPreview(){
    DetailScreen(rememberNavController())
}