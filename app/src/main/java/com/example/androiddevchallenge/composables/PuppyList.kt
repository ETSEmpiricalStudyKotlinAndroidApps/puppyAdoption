package com.example.androiddevchallenge.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.model.Puppy

@Composable
fun PuppyList(puppies: List<Puppy>, navController: NavController) {
    LazyColumn(modifier = Modifier.padding(start = 8.dp, end = 8.dp)) {
        items(puppies) { puppy ->
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(16.dp))
            PuppyCard(puppy = puppy, navController = navController)
        }
    }
}