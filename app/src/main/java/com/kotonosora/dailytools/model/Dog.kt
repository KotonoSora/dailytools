package com.kotonosora.dailytools.model

import androidx.annotation.DrawableRes

data class Dog(
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val age: String,
    val hobbies: String
)