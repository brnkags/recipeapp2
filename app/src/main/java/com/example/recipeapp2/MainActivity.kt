package com.example.recipeapp2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "home") {
                composable("home") {
                    HomeScreen(onDetailsClick = {
                            id -> navController.navigate("details/id=$id?name=hi")
                    })
                }
                composable("details/id={id}?name={name}",
                    arguments = listOf(
                        navArgument("id"){
                            type = NavType.LongType
                        },
                        navArgument("name"){
                            type = NavType.StringType
                            nullable = true
                        }),
                ){

                    val arguments = requireNotNull(it.arguments)
                    val id = arguments.getLong("id")
                    val name = arguments.getString("name")

                    DetailScreen(id, name, onNavigateUp = {
                        navController.popBackStack()
                    })
                }
            }
        }
    }
}