package com.example.random_image

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import com.example.random_image.ui.theme.Random_ImageTheme

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
                    val navController = rememberNavController()
                    NavHost(
                        navController,
                        startDestination = com.example.random_image.Screen.Home.name
                    ) {
                        composable(com.example.random_image.Screen.Home.name) {
                            HomeScreen(navController = navController)
                        }
                        composable("Show Picture") {
                            ShowPic(name = "Show Picture", navController = navController)
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun HomeScreen(navController: NavController, modifier: Modifier = Modifier) {
    var width by remember { mutableStateOf("") }
    var height by remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        
        EditNumberField1(
            value = width,
            onValueChange = { width = it },

            )

        EditNumberField2(
            value = height,
            onValueChange = { height = it },

            )

        Button(onClick = { /*TODO*/ }) {
            Text(
                text = "Submit",
                fontSize = 20.sp,
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNumberField1(
    value: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
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
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNumberField2(
    value: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
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
}

@Composable
fun ShowPic(name: String, navController: NavController, modifier: Modifier = Modifier){
    Column() {

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Random_ImageTheme {
        val navController = rememberNavController()
        HomeScreen(navController, modifier = Modifier)
    }
}