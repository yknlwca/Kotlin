package com.example.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }

    @Composable
    fun CaptainGame() {
        val treasuresFound by remember { mutableStateOf(0) }
        val direction by remember { mutableStateOf("North") }
        val stormOrTreasure by remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Treasures Found : ${treasuresFound}")
            Text(text = "Current Direction : ${direction}")
            Text(text = "${stormOrTreasure}")
            Button(onClick = {
                direction.value = "East"
                if (Random.nextBoolean()) {
                    treasuresFound.value += 1
                    stormOrTreasure.value = "WE FOUND A TRESURE!!"
                } else {
                    stormOrTreasure.value = "STORM AHEAD!!"
                }
            }) {
                Text("Sail East")
            }
            Button(onClick = {
                direction.value = "West"
                if (Random.nextBoolean()) {
                    treasuresFound.value += 1
                    stormOrTreasure.value = "WE FOUND A TRESURE!!"
                } else {
                    stormOrTreasure.value = "STORM AHEAD!!"
                }
            }) {
                Text("Sail West")
            }
            Button(onClick = {
                direction.value = "North"
                if (Random.nextBoolean()) {
                    treasuresFound.value += 1
                    stormOrTreasure.value = "WE FOUND A TRESURE!!"
                } else {
                    stormOrTreasure.value = "STORM AHEAD!!"
                }
            }) {
                Text("Sail North")
            }
            Button(onClick = {
                direction.value = "South"
                if (Random.nextBoolean()) {
                    treasuresFound.value += 1
                    stormOrTreasure.value = "WE FOUND A TRESURE!!"
                } else {
                    stormOrTreasure.value = "STORM AHEAD!!"
                }
            }) {
                Text("Sail South")
            }
        }
    }
}