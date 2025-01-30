package com.example.healthypuppy.Data

import android.content.Context
import com.example.healthypuppy.Data.User.OffLineUserRepository
import com.example.healthypuppy.Data.User.UserRepository

interface AppContainer {
    val userRepository: UserRepository
}

class AppDataContainer (private val context: Context) : AppContainer {
    override val userRepository: UserRepository by lazy {
        OffLineUserRepository(UserDataBase.getDataBase(context).UserDao())
    }
}