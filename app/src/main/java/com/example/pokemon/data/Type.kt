package com.example.pokemon.data

import androidx.compose.ui.graphics.Color
import com.example.pokemon.ui.theme.BabyBlue
import com.example.pokemon.ui.theme.Blue
import com.example.pokemon.ui.theme.Green
import com.example.pokemon.ui.theme.Orange
import com.example.pokemon.ui.theme.Rose
import com.example.pokemon.ui.theme.Teal

enum class Type(val color: Color, val subColor: Color) {
    GRASS(Teal, Green),
    FIRE(Rose, Orange),
    WATER(BabyBlue, Blue),
}
