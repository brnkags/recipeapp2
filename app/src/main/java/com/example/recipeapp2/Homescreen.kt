package com.example.recipeapp2

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.recipeapp2.models.Recipe

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    recipes: List<Recipe>,
    onDetailsClick: (id: Long) -> Unit
) {
    Scaffold {
        RecipeList(recipes = recipes, onDetailsClick = onDetailsClick)
    }
}

@Composable
fun RecipeList(
    recipes: List<Recipe>,
    onDetailsClick: (id: Long) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 10.dp)
    ) {
        item {
            RecipeAppBar(title = "Latest Recipes")
        }
        LazyColumnFor(recipes) { recipe ->
            RecipeCard(recipe, onClick = { onDetailsClick(recipe.id) })
        }
    }
}

@Composable
private fun RecipeAppBar(title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
    ) {
        Text(title, style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.weight(1f))
    }
}
