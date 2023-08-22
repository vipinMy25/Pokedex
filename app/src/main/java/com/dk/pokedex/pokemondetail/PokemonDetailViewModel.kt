package com.dk.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.dk.pokedex.data.remote.responses.Pokemon
import com.dk.pokedex.repository.PokemonRepository
import com.dk.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }

}