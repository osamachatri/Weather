package com.oussama_chatri.weather.data.mappers

import com.oussama_chatri.weather.data.local.entities.Astro
import com.oussama_chatri.weather.data.local.entities.Condition
import com.oussama_chatri.weather.data.local.entities.Current
import com.oussama_chatri.weather.data.local.entities.Day
import com.oussama_chatri.weather.data.local.entities.Forecast
import com.oussama_chatri.weather.data.local.entities.ForecastDay
import com.oussama_chatri.weather.data.local.entities.Hour
import com.oussama_chatri.weather.data.local.entities.Location
import com.oussama_chatri.weather.data.local.entities.WeatherData
import com.oussama_chatri.weather.domain.models.Weather

fun WeatherData.toDomainModel(): Weather? {
    if (location == null || current == null || forecast == null) return null

    return Weather(
        id = this.id,
        location = location.toDomainModel(),
        current = current.toDomainModel(),
        forecast = forecast.toDomainModel()
    )
}

fun Location.toDomainModel(): com.oussama_chatri.weather.domain.models.Location {
    return com.oussama_chatri.weather.domain.models.Location(
        name = this.name,
        tz_id = this.tz_id,
        localtime_epoch = this.localtime_epoch
    )
}

fun Current.toDomainModel(): com.oussama_chatri.weather.domain.models.Current {
    return com.oussama_chatri.weather.domain.models.Current(
        last_updated_epoch = this.last_updated_epoch,
        temp_c = this.temp_c,
        temp_f = this.temp_f,
        is_day = this.is_day,
        condition = this.condition.toDomainModel(),
        wind_kph = this.wind_kph,
        wind_mph = this.wind_mph,
        pressure_mb = this.pressure_mb,
        pressure_in = this.pressure_in,
        humidity = this.humidity,
        uv = this.uv
    )
}

fun Condition.toDomainModel(): com.oussama_chatri.weather.domain.models.Condition {
    return com.oussama_chatri.weather.domain.models.Condition(
        text = this.text,
        code = this.code
    )
}

fun Forecast.toDomainModel(): com.oussama_chatri.weather.domain.models.Forecast {
    return com.oussama_chatri.weather.domain.models.Forecast(
        forecastday = this.forecastday.map { it.toDomainModel() }
    )
}

fun ForecastDay.toDomainModel(): com.oussama_chatri.weather.domain.models.ForecastDay {
    return com.oussama_chatri.weather.domain.models.ForecastDay(
        date_epoch = this.date_epoch,
        day = this.day.toDomainModel(),
        astronomy = this.astro.toDomainModel(),
        hour = this.hour.map { it.toDomainModel() }
    )
}

fun Day.toDomainModel(): com.oussama_chatri.weather.domain.models.Day {
    return com.oussama_chatri.weather.domain.models.Day(
        maxtemp_c = this.maxtemp_c,
        maxtemp_f = this.maxtemp_f,
        mintemp_c = this.mintemp_c,
        mintemp_f = this.mintemp_f,
        avgtemp_c = this.avgtemp_c,
        avgtemp_f = this.avgtemp_f,
        maxwind_mph = this.maxwind_mph,
        maxwind_kph = this.maxwind_kph,
        totalsnow_cm = this.totalsnow_cm,
        avghumidity = this.avghumidity,
        daily_will_it_rain = this.daily_will_it_rain,
        daily_chance_of_rain = this.daily_chance_of_rain,
        daily_will_it_snow = this.daily_will_it_snow,
        daily_chance_of_snow = this.daily_chance_of_snow,
        condition = this.condition.toDomainModel(),
        uv = this.uv
    )
}

fun Astro.toDomainModel(): com.oussama_chatri.weather.domain.models.Astronomy {
    return com.oussama_chatri.weather.domain.models.Astronomy(
        sunrise = this.sunrise,
        sunset = this.sunset,
        moonrise = this.moonrise,
        moonset = this.moonset,
        moon_phase = this.moon_phase,
        moon_illumination = this.moon_illumination,
        is_moon_up = this.is_moon_up,
        is_sun_up = this.is_sun_up
    )
}

fun Hour.toDomainModel(): com.oussama_chatri.weather.domain.models.Hour {
    return com.oussama_chatri.weather.domain.models.Hour(
        time_epoch = this.time_epoch,
        time = this.time,
        temp_c = this.temp_c,
        temp_f = this.temp_f,
        is_day = this.is_day,
        condition = this.condition.toDomainModel(),
        wind_mph = this.wind_mph,
        wind_kph = this.wind_kph,
        wind_dir = this.wind_dir,
        pressure_mb = this.pressure_mb,
        pressure_in = this.pressure_in,
        snow_cm = this.snow_cm,
        humidity = this.humidity,
        cloud = this.cloud,
        feelslike_c = this.feelslike_c,
        feelslike_f = this.feelslike_f,
        heatindex_c = this.heatindex_c,
        heatindex_f = this.heatindex_f,
        dewpoint_c = this.dewpoint_c,
        dewpoint_f = this.dewpoint_f,
        will_it_rain = this.will_it_rain,
        chance_of_rain = this.chance_of_rain,
        will_it_snow = this.will_it_snow,
        chance_of_snow = this.chance_of_snow,
        uv = this.uv
    )
}
