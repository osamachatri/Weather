package com.oussama_chatri.weather.data.offline.tables

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Cities")
data class City(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val name : String,
    val country : String
)