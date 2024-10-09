package com.example.whatisyourgender

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PickGender() {
    var radioSate by remember { mutableStateOf(false) }
    var radioSate1 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 400.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Adventure starts here",
            modifier = Modifier,
            color = Color.Black,
            style = TextStyle(
                fontWeight = FontWeight.Bold, fontSize = 30.sp
            )
        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = "Sign up and start learning!", modifier = Modifier.padding(end = 90.dp))
        Spacer(modifier = Modifier.size(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            RadioButton(selected = radioSate, onClick = {
                radioSate = !radioSate
            })
            Text(text = "Female")
            Spacer(modifier = Modifier.size(5.dp))
            RadioButton(selected = radioSate1, onClick = {
                radioSate1 = !radioSate1
            })
            Text(text = "Male")

        }
        Text(
            text = "Gender is required",
            modifier = Modifier.padding(end = 130.dp),
            color = Color.Red
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(50.dp)
                .padding(bottom = 100.dp),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text(text = "Sign up", modifier = Modifier)

        }

    }

}