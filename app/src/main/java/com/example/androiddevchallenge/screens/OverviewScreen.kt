package com.example.androiddevchallenge.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.androiddevchallenge.composables.PuppyList
import com.example.androiddevchallenge.model.puppies

@Composable
fun OverviewScreen(navController: NavController) {
    PuppyList(puppies = puppies, navController)
}