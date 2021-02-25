package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Puppy

@Composable
fun DetailsScreen(puppy: Puppy?) {
    Column {
        if (puppy == null) {
            Text(text = "No puppy found :(")
        } else {
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = puppy.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = puppy.name, fontSize = 24.sp, style = MaterialTheme.typography.h2)
                Text(text = puppy.breed, fontSize = 16.sp, style = MaterialTheme.typography.h5)
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp)
                )
                Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(text = "ADOPT ME" )
                }
            }
        }
    }
}