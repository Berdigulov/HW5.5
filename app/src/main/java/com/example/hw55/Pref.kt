package com.example.hw55

import android.content.Context
import android.content.SharedPreferences

class Pref(private val context: Context) {

    private var preferences :SharedPreferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE)

    fun isBoardingShow():Boolean{
        return preferences.getBoolean(SHOW_BOARDING,false)
    }

    fun saveBoardingShow(isShow: Boolean){
        preferences.edit().putBoolean(SHOW_BOARDING,isShow).apply()

    }



    companion object{
        private const val SHOW_BOARDING = "boarding"
    }
}