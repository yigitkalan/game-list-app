package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class gameCardModel(
    @StringRes val stringResourceId : Int,
    @DrawableRes val ImageResourceId : Int) {
}