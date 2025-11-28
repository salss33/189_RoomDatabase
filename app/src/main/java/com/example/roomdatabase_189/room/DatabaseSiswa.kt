package com.example.roomdatabase_189.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.selects.SelectInstance

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa{

}
