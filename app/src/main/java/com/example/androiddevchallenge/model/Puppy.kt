package com.example.androiddevchallenge.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Puppy(
    val id: Int,
    val name: String,
    val breed: String,
    @DrawableRes
    val imageId: Int,
) : Parcelable
