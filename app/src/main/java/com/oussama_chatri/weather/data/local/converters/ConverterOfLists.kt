package com.oussama_chatri.weather.data.local.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.oussama_chatri.weather.data.local.entities.ForecastDay
import com.oussama_chatri.weather.data.local.entities.Hour

class ConverterOfLists {

    @TypeConverter
    fun fromForecastDayList(value: List<ForecastDay>): String {
        val gson = Gson()
        val type = object : TypeToken<List<ForecastDay>>() {}.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toForecastDayList(value: String): List<ForecastDay> {
        val gson = Gson()
        val type = object : TypeToken<List<ForecastDay>>() {}.type
        return gson.fromJson(value, type)
    }

    @TypeConverter
    fun fromHourList(value: List<Hour>): String {
        val gson = Gson()
        val type = object : TypeToken<List<Hour>>() {}.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toHourList(value: String): List<Hour> {
        val gson = Gson()
        val type = object : TypeToken<List<Hour>>() {}.type
        return gson.fromJson(value, type)
    }
}
