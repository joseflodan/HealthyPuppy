package com.example.healthypuppy.Data.User

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")

data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val email: String = "",
    val name: String = "",
    val password: String = "",
)