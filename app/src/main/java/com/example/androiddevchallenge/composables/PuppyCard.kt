package com.example.androiddevchallenge.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.shapes


@Composable
fun PuppyCard(puppy: Puppy, navController: NavController) {
    Card(
        shape = shapes.large,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            modifier = Modifier
                .clickable(onClick = {
                    navController.navigate("details/${puppy.id}")
                })
                .fillMaxWidth()
                .height(150.dp)
        ) {
            Image(
                painter = painterResource(id = puppy.imageId),
                contentDescription = puppy.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.aspectRatio(1f)
            )
            Column(
                modifier = Modifier.padding(
                    top = 8.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 8.dp
                )
            ) {
                Text(
                    text = puppy.name,
                    style = MaterialTheme.typography.h4,
                    color = MaterialTheme.colors.onSurface,
                )
                Text(
                    text = puppy.breed,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onSurface,
                )
            }
        }
    }
}