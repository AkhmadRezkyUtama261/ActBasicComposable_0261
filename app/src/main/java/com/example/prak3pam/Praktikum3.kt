package com.example.prak3pam

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun contohcolumn(modifier: Modifier){
    column(
        modifier = Modifier
            .padding(top = 20.dp, start = 20.dp)
    ){
        Text("Hello")
        Text("World")
    }
}

@Composable
fun contohRow(modifier: Modifier){
    val kota = stringResource(id = R.string.kota)
    Row(
        modifier = Modifier
            .padding(top = 60.dp, start = 60.dp)
            .fillMaxWidth()
    ){
        Text(text = "Hello")
        Text(text = kota)
    }
}

@Composable
fun TataletakColumn(modifier: Modifier){

}