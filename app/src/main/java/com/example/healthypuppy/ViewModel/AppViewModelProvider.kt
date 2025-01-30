package com.example.healthypuppy.ViewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.healthypuppy.MyApp

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer{
            OffLineUserViewModel(myApp().container.userRepository)
        }
    }
}

fun CreationExtras.myApp() : MyApp = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MyApp)