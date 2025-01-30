package com.example.healthypuppy

import android.app.Application
import com.example.healthypuppy.Data.AppContainer
import com.example.healthypuppy.Data.AppDataContainer

class MyApp: Application() {
    lateinit var container: AppContainer

    override fun onCreate(){
        super.onCreate()
        container = AppDataContainer(this)
    }
}