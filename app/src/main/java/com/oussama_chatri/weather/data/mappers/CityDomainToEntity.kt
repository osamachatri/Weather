package com.oussama_chatri.weather.data.mappers

import com.oussama_chatri.weather.data.local.entities.City

fun com.oussama_chatri.weather.domain.models.City.toEntity() : City {
    return City(
        id = this.id,
        name = this.name,
        country = this.country
    )
}