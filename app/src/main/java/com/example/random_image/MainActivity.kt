package com.example.random_image

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import com.example.random_image.ui.theme.Random_ImageTheme
import coil.compose.rememberImagePainter

enum class Screen {
    Home, Show
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Random_ImageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RandomImageScreen()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RandomImageScreen(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var width by remember { mutableStateOf("") }
        var height by remember { mutableStateOf("") }
        var url: String = ""
        var status: Int = 0
        TextField(
            value = width,
            onValueChange = { width = it },
            label = {
                Text(
                    text = "Width",
                    fontSize = 20.sp,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(60.dp),
            singleLine = true
        )

        TextField(
            value = height,
            onValueChange = { height = it },
            label = {
                Text(
                    text = "Height",
                    fontSize = 20.sp,
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(60.dp),
            singleLine = true
        )
        Text(
            text = "Select your picture type.",
            fontSize = 20.sp,
            )
        Spacer(modifier = Modifier.height(30.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/movie"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }}) {
                Text(
                    text = "movie",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/game"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }}) {
                Text(
                    text = "game",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/album"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "album",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/book"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "book",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/face"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }}) {
                Text(
                    text = "face",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/fashion"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "fashion",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/shoes"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "shoes",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/watch"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "watch",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/furniture"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "furniture",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/dog"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "dog",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/paris"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }
            }) {
                Text(
                    text = "paris",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null || h != null){
                    if(w in 8..2000 && h in 8..2000){
                        url = "https://loremflickr.com/$w/$h/brazil"
                        status = 1
                    }else{
                        status = 2
                    }
                }else{
                    status = 3
                }}) {
                Text(
                    text = "brazil",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        if (status != 0) {
            if(status == 1) {
                Image(
                    painter = rememberImagePainter(url),
                    contentDescription = "Random Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .clip(shape = MaterialTheme.shapes.medium)
                )
            } else if(status == 2) {
                Text(text = "Please enter width and height again.")
            } else if (status == 3) {
                Text(text = "Please enter width and height.")
        } else {
            Spacer(modifier = Modifier.width(15.dp))
        }


        }

        Button(onClick = {
            status = 0
            url = ""
            width = ""
            height = ""
        }) {
            Text(
                text = "Reset",
                fontSize = 20.sp,
            )
        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Random_ImageTheme {}
}