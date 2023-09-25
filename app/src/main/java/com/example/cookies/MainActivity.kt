package com.example.cookies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cookies.ui.theme.CookiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CookiesTheme {
                    Cookies()

            }
        }
    }
}

@Composable
fun Cookies() {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF262627))) {
        Spacer(modifier = Modifier.padding(top = 10.dp,
            end = 20.dp,
            start = 20.dp))
        Toolbar()
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)) {

            Spacer(modifier = Modifier.padding(start = 20.dp))

            Column(modifier = Modifier
                .width(120.dp)
                .align(Alignment.CenterVertically)
            ) {

                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Cookies", fontSize = 28.sp,
                    color = Color.White)
                Text(text = "Premium", fontSize = 20.sp,
                    color = Color(0xFFFF8113))

            }
            Spacer(modifier = Modifier.weight(1f))

            Column(Modifier.size(110.dp)) {
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "See more", fontSize = 16.sp,
                    color = Color(0xFFFF8113)
                    , modifier = Modifier
                        .padding(end = 20.dp))
            }

        }


        Spacer(modifier = Modifier.padding(top = 20.dp))
        Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround) {

            MainItem()

            MainItem()

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(end = 10.dp, start = 10.dp)) {

            Spacer(modifier = Modifier.padding(start = 20.dp))

            Column(modifier = Modifier
                .width(120.dp)
                .align(Alignment.CenterVertically)
            ) {

                Spacer(modifier = Modifier.weight(1f))
                Text(text = "Offers", fontSize = 32.sp, color = Color.White)

            }
            Spacer(modifier = Modifier.weight(1f))

            Column(Modifier.size(110.dp)) {
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "See more", fontSize = 16.sp,
                    color = Color(0xFFFF8113)
                    , modifier = Modifier
                        .padding(end = 20.dp, bottom = 2.dp))
            }

        }

        Offers()
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigation()
    }
}



@Composable
fun Toolbar(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(90.dp)
        .padding(start = 25.dp, end = 25.dp, top = 10.dp)
    ) {

        Image(painter = painterResource(id = R.drawable.person),
            contentDescription ="profile picture",
        modifier = Modifier
            .clip(CircleShape)
            .align(Alignment.CenterVertically)
            .border(
                border =
                BorderStroke
                    (width = 1.dp, color = Color.White), shape = CircleShape
            )
            .height(50.dp)
            .width(50.dp)
            , contentScale = ContentScale.FillBounds)
        Spacer(modifier = Modifier.padding(start = 10.dp))

        Column(modifier = Modifier
            .width(90.dp)
            .align(Alignment.CenterVertically)
            ) {

            Text(text = "James", fontSize = 18.sp, color = Color.White)
            Text(text = "Fugueraa", fontSize = 14.sp, color = Color.White)

        }
        Spacer(modifier = Modifier.weight(1f))

        Box(modifier = Modifier
            .height(90.dp)
            .width(65.dp)){



            Card(modifier = Modifier
                .width(65.dp)
                .height(70.dp)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(15.dp)
                ),
            colors = CardDefaults.cardColors(containerColor = Color.White)
            )
            {
                Column( modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {

                    Text(text = "6", fontSize = 18.sp, modifier = Modifier
                        .padding(top = 10.dp))

                    Text(text = "products", fontSize = 12.sp)
                }

            }

            Icon(painter = painterResource(id = R.drawable.cart1),
                tint = Color.White,
                contentDescription ="",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Black)
                    .align(Alignment.TopCenter)
                    .size(30.dp)
                    .scale(0.7f))
        }
    }
}


@Composable
fun MainItem(){
    Column(modifier = Modifier
        .height(260.dp)
        .width(160.dp)
    )
    {
        Box(modifier = Modifier
            .height(260.dp)
            .width(160.dp)) {
            Card(modifier = Modifier
                .width(160.dp)
                .height(155.dp)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp,
                        bottomEnd = 85.dp,
                        bottomStart = 15.dp
                    )
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF414141),
                contentColor = Color(0xFFFF8113))
            ) {

                Column(modifier = Modifier.fillMaxSize()
                 ) {
                    Spacer(modifier = Modifier.padding(20.dp))

                    Text(text = "Chocolate                    chips"
                        , fontSize = 20.sp,
                    modifier = Modifier.padding(start = 20.dp),
                        color = Color.White
                    )

                    Row {

                  Icon(painter = painterResource(id =  R.drawable.pre)
                   , contentDescription = "",
                      modifier = Modifier
                          .padding(start = 20.dp, end = 5.dp)
                          .size(18.dp),)

                         Text(text = "PREMIUM" , fontSize = 13.sp,
                       color = Color(0xFFFF8113))
                      }


                    Text(text = "20 USD" , fontSize = 13.sp,
                        modifier = Modifier.padding(start = 20.dp,
                            top = 8.dp),
                        style = TextStyle(fontWeight = FontWeight.Bold),
                        color = Color.White
                    )

                    
                }
            }



            Image(painter = painterResource(id = R.drawable.cookie2),
                contentDescription = "", contentScale = ContentScale.FillBounds
            , modifier = Modifier
                    .size(140.dp)
                    .align(Alignment.TopCenter))

            Icon(painter = painterResource(id = R.drawable.arrow),
                tint = Color.White,
                contentDescription ="",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Black)
                    .size(55.dp)
                    .scale(0.5f)
                    .align(Alignment.BottomEnd))
        }

    }
}

@Composable
fun Offers(){

    Box(modifier = Modifier
        .height(145.dp)
        .fillMaxWidth()
        .padding(start = 25.dp, end = 25.dp, top = 5.dp))
    {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(145.dp)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(
                        topStart = 15.dp,
                        topEnd = 15.dp,
                        bottomEnd = 85.dp,
                        bottomStart = 15.dp
                    )
                ),
            colors = CardDefaults.cardColors
                (containerColor = Color(0xFF414141)
            , contentColor = Color(0xFFFF8113)
            )
        ) {

            Row(modifier = Modifier.fillMaxWidth()) {

                Image(painter = painterResource(id = R.drawable.cookie3),
                    contentDescription = "",
                    modifier = Modifier.padding(15.dp))

                Column(modifier = Modifier.fillMaxHeight().width(120.dp))
                {
                    Spacer(modifier = Modifier.padding(15.dp))

                    Text(
                        text = "Double " +"                            "+
                                "chocolate", fontSize = 22.sp,
                        modifier = Modifier.padding(start = 5.dp),
                        color = Color.White
                    )





                    Row {

                        Icon(painter = painterResource(id =  R.drawable.pre)
                            , contentDescription = "",
                            modifier = Modifier
                                .padding(start = 5.dp, end = 5.dp)
                                .size(20.dp),)

                        Text(text = "PREMIUM" , fontSize = 15.sp,
                            color = Color(0xFFFF8113))
                    }





                }

            }


        }
        Icon(painter = painterResource(id = R.drawable.arrow),
            tint = Color.White,
            contentDescription ="",
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Black)
                .size(55.dp)
                .scale(0.5f)
                .align(Alignment.BottomEnd))

    }
}

@Composable
fun BottomNavigation(){

    Box(modifier = Modifier
        .fillMaxWidth().height(110.dp)
    ){
        Box(modifier = Modifier.fillMaxWidth()
            .height(70.dp)
            .align(Alignment.BottomCenter)
            .background(
                shape = RoundedCornerShape
                    (topEnd = 40.dp, topStart = 40.dp),
                color = Color(0xFF1B1A1A)
            ))

        Row(
            Modifier
                .fillMaxWidth()
                .height(130.dp)
                .padding(end = 50.dp, start = 45.dp)
            , horizontalArrangement = Arrangement.SpaceBetween) {

            NavItem(icon = R.drawable.home, name = "Home" )
            NavItem(icon = R.drawable.search, name = "Search" )
            NavItem(icon = R.drawable.premiuom, name = "Premium" )
        } } }


@Composable
fun NavItem(icon:Int, name:String){

    Column(modifier = Modifier
        .height(110.dp)
        .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        Icon(painter = painterResource(icon),
            tint = Color.White,
            contentDescription ="",
            modifier = Modifier
                .clip(CircleShape)
                .background(Color(0xFF414141))
                .size(45.dp)
                .scale(0.5f)
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Text(
            text = name, fontSize = 12.sp,
            color = Color.White
        )

    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CookiesTheme {
        Cookies()
    }
}