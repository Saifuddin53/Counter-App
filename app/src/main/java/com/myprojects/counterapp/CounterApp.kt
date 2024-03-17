package com.myprojects.counterapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CounterApp(
    counterViewModel: CounterViewModel
) {
    Column(
        modifier = Modifier.fillMaxSize(), 
        verticalArrangement = Arrangement.Center, 
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Count: ${counterViewModel.count.value}",
            fontSize = 40.sp,
            color = Color.Blue)
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { counterViewModel.increment() }) {
                Text(text = "Inc")
            }
            Button(onClick = { counterViewModel.decrement() }) {
                Text(text = "Dec")
            }
        }
    }
}

@Preview
@Composable
fun CounterAppPreview() {
    CounterApp(counterViewModel = CounterViewModel())
}