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
import androidx.compose.ui.graphics.Color
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
var error: String = ""
var url: String = ""
var width: String = ""
var height: String = ""
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
        var error by remember { mutableStateOf("") }
        var url by remember { mutableStateOf("") }
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
                .padding(20.dp),
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
                .padding(20.dp),
            singleLine = true
        )
        Text(
            text = "Select your picture type.",
            fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/movie"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "movie",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/game"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "game",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/album"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "album",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/book"
                    error = ""
                } else {
                    error = "Please enter width and height again."
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
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/face"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "face",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.width(15.dp))
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/fasion"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "fashion",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/shoes"
                    error = ""
                } else {
                    error = "Please enter width and height again."
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
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/watch"
                    error = ""
                } else {
                    error = "Please enter width and height again."
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
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/furniture"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "furniture",
                    fontSize = 20.sp,
                )
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row() {
            Button(onClick = {
                val w = width.toIntOrNull()
                val h = height.toIntOrNull()
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/dog"
                    error = ""
                } else {
                    error = "Please enter width and height again."
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
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/paris"
                    error = ""
                } else {
                    error = "Please enter width and height again."
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
                if (w != null && h != null && w in 8..2000 && h in 8..2000) {
                    url = "https://loremflickr.com/$w/$h/brazil"
                    error = ""
                } else {
                    error = "Please enter width and height again."
                }
            }) {
                Text(
                    text = "brazil",
                    fontSize = 20.sp,
                )
            }
        }

        Text(
            text = error,
            fontSize = 20.sp,
            color = Color.Red)
        if (url != ""){
            Image(
                painter = rememberImagePainter(url),
                contentDescription = "Random Image",
                modifier = Modifier.width(250.dp).height(250.dp)
                    .fillMaxWidth()
                    .aspectRatio(1f)
            )
        }
        Spacer(modifier = Modifier.width(20.dp))
        Button(onClick = {
            error = ""
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