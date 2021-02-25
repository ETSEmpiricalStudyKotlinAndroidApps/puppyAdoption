package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
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
            Box {
                Image(
                    painter = painterResource(id = puppy.imageId),
                    contentDescription = puppy.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                )
                Button(
                    onClick = {},
                    modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp)
                ) {
                    Text(text = "ADOPT ME")
                    Icon(Icons.Rounded.Favorite, "Heart", modifier = Modifier.padding(start = 8.dp))
                }
            }
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = puppy.name, fontSize = 24.sp, style = MaterialTheme.typography.h2)
                Text(text = puppy.breed, fontSize = 16.sp, style = MaterialTheme.typography.h5)
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(32.dp)
                )
            }
        }
    }
}