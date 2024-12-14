package com.oussama_chatri.weather.data.mappers

import com.oussama_chatri.weather.data.local.entities.City

fun City.toDomain() : com.oussama_chatri.weather.domain.models.City{
    return com.oussama_chatri.weather.domain.models.City(
        name = this.name,
        country = this.country
    )
}