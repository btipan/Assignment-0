package com.example.assignment0

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random.Default.nextInt


@Composable
fun ButtonScreen ()
{
    var clickCounter by remember { mutableIntStateOf(0) }
    Column{
        var response by remember { mutableStateOf("Should we go?") }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(response)
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Button(
                modifier = Modifier.padding(vertical=12.dp),
                onClick = {
                    val yes = nextInt(from = 1, until = 10)
                    if(yes < 6)
                    {
                        response = "Yes"
                    }
                    clickCounter += 1
                }
            ) {
                Text("Yes")
            }

            Button(
                modifier = Modifier.padding(vertical=12.dp),
                onClick = {
                    val maybe = nextInt(from = 1, until = 20)
                    if(maybe < 6)
                    {
                        response = "Maybe"
                    }
                    clickCounter += 1
                }
            ) {
                Text("Maybe")
            }

            Button(
                modifier = Modifier.padding(vertical=12.dp),
                onClick = {
                    val no = nextInt(from = 1, until = 10)
                    if(no == 1)
                    {
                        response = "No"
                    }
                    clickCounter += 1
                }
            ) {
                Text("No")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "clicks: $clickCounter")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {Text("ccid: btipan")}

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {Text("Student ID: 1664003")}

    }
}

@Preview(showBackground = true)
@Composable
fun ButtonScreenPreview() {
    ButtonScreen()
}