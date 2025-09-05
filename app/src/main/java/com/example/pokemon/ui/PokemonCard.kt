package com.example.pokemon.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokemon.data.Pokemon
import java.util.Locale

@Composable
fun PokemonCard(pokemon: Pokemon, modifier: Modifier = Modifier) {
    ElevatedCard(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = pokemon.type.color,
            contentColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(
                    text = pokemon.name,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold
                )

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = pokemon.type.name.lowercase(Locale.getDefault()),
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(pokemon.type.subColor)
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                    Column {
                        Text(text = buildAnnotatedString {
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                append("Attack:		")
                            }
                            withStyle(style = SpanStyle(color = Color.Black)) {
                                append(pokemon.attackPoints.toString())
                            }
                        })
                        Text(text = buildAnnotatedString {
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                append("Defense:		")
                            }
                            withStyle(style = SpanStyle(color = Color.Black)) {
                                append(pokemon.defensePoints.toString())
                            }
                        })
                    }
                }
            }
            Image(
                painter = painterResource(pokemon.image),
                contentDescription = pokemon.name,
                modifier = Modifier
                    .drawBehind {
                        drawCircle(
                            color = Color.White.copy(alpha = .5f),
                            radius = this.size.maxDimension / 2f
                        )
                    }
                    .size(100.dp)
            )
        }
    }
}

@Preview
@Composable
fun PokemonCardPreview() {
    PokemonCard(pokemon = Pokemon.pokemonList[0])
}
