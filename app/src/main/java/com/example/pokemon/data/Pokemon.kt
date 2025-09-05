package com.example.pokemon.data

import androidx.annotation.DrawableRes
import com.example.pokemon.R

data class Pokemon(
    val name: String,
    val type: Type,
    val attackPoints: Int,
    val defensePoints: Int,
    @DrawableRes val image: Int,
) {
    companion object {
        val pokemonList = listOf(
            Pokemon("Bulbasaur", Type.GRASS, 65, 65, R.drawable.bulbasaur),
            Pokemon("Ivysaur", Type.GRASS, 80, 80, R.drawable.ivysaur),
            Pokemon("Venusaur", Type.GRASS, 122, 120, R.drawable.venusaur),
            Pokemon("Charmander", Type.FIRE, 60, 50, R.drawable.charmander),
            Pokemon("Charmeleon", Type.FIRE, 80, 65, R.drawable.charmeleon),
            Pokemon("Charizard", Type.FIRE, 159, 115, R.drawable.charizard),
            Pokemon("Squirtle", Type.WATER, 50, 64, R.drawable.squirtle),
            Pokemon("Wartortle", Type.WATER, 65, 80, R.drawable.wartortle),
            Pokemon("Blastoise", Type.WATER, 135, 115, R.drawable.blastoise)
        )
    }
}
