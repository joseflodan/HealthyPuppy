package com.example.healthypuppy.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.healthypuppy.Data.User.User
import com.example.healthypuppy.Data.User.UserDao

@Database(entities = [User::class], version = 1, exportSchema = true)
abstract class UserDataBase : RoomDatabase() {
    abstract fun UserDao(): UserDao

    companion object{
        @Volatile
        private var Instance: UserDataBase? = null

        fun getDataBase(context: Context): UserDataBase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, UserDataBase::class.java, "database")
                    .allowMainThreadQueries()
                    .build()
                    .also{ Instance = it }
            }
        }
    }
}