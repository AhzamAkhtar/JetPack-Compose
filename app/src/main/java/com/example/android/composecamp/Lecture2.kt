package com.example.android.composecamp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.composecamp.ui.theme.ComposeCampTheme

class Lecture2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row (
                modifier = Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(1f)
                    .background(Color.Gray)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp , Color.Blue)
                    .padding(5.dp)
                    .border(10.dp , Color.Red)
                    .padding(10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
                    ) {
                Text(text = "Hello" , modifier = Modifier
                    .offset(50.dp , 50.dp))
                Spacer(modifier = Modifier.height(500.dp))
                Text(text = "World" , modifier = Modifier
                    .border(5.dp , Color.Yellow)
                    .padding(5.dp)
                    .offset(20.dp , 20.dp)
                    .border(10.dp , Color.Black)
                    .padding(10.dp)
                    .clickable {
                        Toast.makeText(this@Lecture2,"Hello",Toast.LENGTH_SHORT).show()
                    }
                )
            }
            // if you write text and text again it will overlap , so use Column
//            Column (
//                modifier = Modifier
//                    .fillMaxSize()
//             pass 0.5f inside fillMaxSize , then it will occupies 50% of the
//             height and 50% percent of the width

            // you also use width(200.dp) and height(300.dp)
            // you can also use fillMaxHeight(0.5f) and fillMaxWidth(0.5f)
            //then it will occupies 50% of the height and 50% percent of the width
//
//
//                    .background(Color.Gray),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//                    ) {
//                Text(text = "heelooo")
//                Text(text = "second time")
//            }
//

        }
    }
}

