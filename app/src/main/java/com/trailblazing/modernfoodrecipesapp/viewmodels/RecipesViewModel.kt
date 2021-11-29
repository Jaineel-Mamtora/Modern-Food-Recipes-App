package com.trailblazing.modernfoodrecipesapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.trailblazing.modernfoodrecipesapp.util.Constants
import com.trailblazing.modernfoodrecipesapp.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import com.trailblazing.modernfoodrecipesapp.util.Constants.Companion.QUERY_API_KEY
import com.trailblazing.modernfoodrecipesapp.util.Constants.Companion.QUERY_DIET
import com.trailblazing.modernfoodrecipesapp.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import com.trailblazing.modernfoodrecipesapp.util.Constants.Companion.QUERY_NUMBER
import com.trailblazing.modernfoodrecipesapp.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = Constants.API_KEY
        queries[QUERY_TYPE] = "main course"
        queries[QUERY_DIET] = "gluten free"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }

}