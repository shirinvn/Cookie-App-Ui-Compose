package com.example.cookies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cookies.ui.theme.CookiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CookiesTheme {
                // A surface container using the 'background' color from the theme

                    Cookies()

            }
        }
    }
}

@Composable
fun Cookies() {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF353334))) {
        Spacer(modifier = Modifier.padding(top = 10.dp))
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
                Text(text = "Cookies", fontSize = 28.sp, color = Color.White)
                Text(text = "Premium", fontSize = 20.sp, color = Color.White)

            }
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "See more", fontSize = 16.sp, color = Color.White
            , modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 20.dp))
        }

        MainItem()
    }
}

@Composable
fun Toolbar(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(90.dp)
        .padding(start = 20.dp, end = 20.dp, top = 10.dp)
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
                )) {

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
        .height(200.dp)
        .width(200.dp)
        .padding(20.dp))
    {
        Box(modifier = Modifier
            .height(270.dp)
            .width(200.dp)) {
            Card(modifier = Modifier
                .width(120.dp)
                .height(180.dp)
                .align(Alignment.BottomCenter)
                .clip(
                    RoundedCornerShape(15.dp)
                )) {

            }

            Image(painter = painterResource(id = R.drawable.cookie2),
                contentDescription = "",
            modifier =Modifier.size(180.dp))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CookiesTheme {
        Cookies()
    }
}