package com.example.healthypuppy.Data.User

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun insert(user: User)

    suspend fun update(user: User)

    suspend fun delete(user: User)

    fun getUsers(email: String): User

    fun getAllItems(): Flow<List<User>>
}