package com.example.pokemon.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokemon.data.Pokemon

@Composable
fun PokemonList(pokemonList: List<Pokemon>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp)
    ) {
        items(pokemonList) { pokemon ->
            PokemonCard(
                pokemon = pokemon,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonListPreview() {
    val pokemonList = Pokemon.pokemonList
    PokemonList(pokemonList = pokemonList)
}
