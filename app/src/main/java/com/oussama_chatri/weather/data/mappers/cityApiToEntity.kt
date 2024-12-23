package com.oussama_chatri.weather.data.mappers

import com.oussama_chatri.weather.data.remote.responses.City

fun cityApiToEntity(city: City) : com.oussama_chatri.weather.data.local.entities.City {
    return com.oussama_chatri.weather.data.local.entities.City(
        id = city.id,
        name = city.name,
        country = city.country,
    )
}