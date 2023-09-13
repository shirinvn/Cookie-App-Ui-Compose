package com.example.cookies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cookies.ui.theme.CookiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CookiesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cookies()
                }
            }
        }
    }
}

@Composable
fun Cookies() {

    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Toolbar()
    }
}

@Composable
fun Toolbar(){

    Row(modifier = Modifier
        .fillMaxWidth()
        .height(70.dp)
       .padding(start = 10.dp, end = 10.dp)
    ) {

        Image(painter = painterResource(id = R.drawable.person),
            contentDescription ="profile picture",
        modifier = Modifier
            .clip(CircleShape)
            .border(
                border =
                BorderStroke
                    (width = 1.dp, color = Color.Red), shape = CircleShape
            )
            .height(50.dp)
            .width(50.dp)
            , contentScale = ContentScale.FillBounds)

        
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CookiesTheme {
        Cookies()
    }
}