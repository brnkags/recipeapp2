package com.example.recipeapp2.models;

import androidx.annotation.DrawableRes
import com.example.recipeapp2.R

data class Recipe (
    val id : Long,
    val title : String,
    val ingredients:List<String>,
    @DrawableRes
    val imageResource:Int,
    val method : List<String>
)

val cake = Recipe (
    1,
    "Cake",
    listOf("all-purpose flour\n" +
            "sugar\n" +
            "salt\n" +
            "milk\n" +
            "oil\n" +
            "eggs\n" +
            "baking powder\n" +
            "cocoa powder\n" +
            "vanilla extract\n" +
            "boiling water"),
    R.drawable.cake, listOf("Preheat the oven to 350º F. Prepare two 9-inch cake pans by spraying with baking spray or buttering and lightly flouring.\n" +
            "Add flour, sugar, cocoa, baking powder, baking soda, salt and espresso powder to a large bowl or the bowl of a stand mixer. Whisk through to combine or, using your paddle attachment, stir through flour mixture until combined well.\n" +
            "Add milk, vegetable oil, eggs, and vanilla to flour mixture and mix together on medium speed until well combined. Reduce speed and carefully add boiling water to the cake batter until well combined.\n" +
            "Distribute cake batter evenly between the two prepared cake pans. Bake for 30-35 minutes, until a toothpick or cake tester inserted in the center of the chocolate cake comes out clean.\n" +
            "Remove from the oven and allow to cool for about 10 minutes, remove from the pan and cool completely.")
)
val yummyrecipes = listOf(cake)