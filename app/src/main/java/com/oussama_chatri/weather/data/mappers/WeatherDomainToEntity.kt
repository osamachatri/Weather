package com.oussama_chatri.weather.data.mappers

import com.oussama_chatri.weather.data.local.entities.WeatherData
import com.oussama_chatri.weather.domain.models.Astronomy
import com.oussama_chatri.weather.domain.models.Condition
import com.oussama_chatri.weather.domain.models.Current
import com.oussama_chatri.weather.domain.models.Day
import com.oussama_chatri.weather.domain.models.Forecast
import com.oussama_chatri.weather.domain.models.ForecastDay
import com.oussama_chatri.weather.domain.models.Hour
import com.oussama_chatri.weather.domain.models.Location
import com.oussama_chatri.weather.domain.models.Weather

fun Weather.toEntity(): WeatherData {
    return WeatherData(
        id = this.id,
        location = this.location?.toEntity(),
        current = this.current?.toEntity(),
        forecast = this.forecast?.toEntity()
    )
}

fun Location.toEntity(): com.oussama_chatri.weather.data.local.entities.Location {
    return com.oussama_chatri.weather.data.local.entities.Location(
        name = this.name,
        region = null,
        country = null,
        lat = null,
        lon = null,
        tz_id = this.tz_id,
        localtime_epoch = this.localtime_epoch,
        localtime = null
    )
}

fun Current.toEntity(): com.oussama_chatri.weather.data.local.entities.Current {
    return com.oussama_chatri.weather.data.local.entities.Current(
        last_updated_epoch = this.last_updated_epoch,
        last_updated = null,
        temp_c = this.temp_c,
        temp_f = this.temp_f,
        is_day = this.is_day,
        condition = this.condition.toEntity(),
        wind_mph = this.wind_mph,
        wind_kph = this.wind_kph,
        wind_degree = null,
        wind_dir = null,
        pressure_mb = this.pressure_mb,
        pressure_in = this.pressure_in,
        precip_mm = null,
        precip_in = null,
        humidity = this.humidity,
        cloud = null,
        feelslike_c = null,
        feelslike_f = null,
        windchill_c = null,
        windchill_f = null,
        heatindex_c = null,
        heatindex_f = null,
        dewpoint_c = this.dewpoint_c,
        dewpoint_f = this.dewpoint_f,
        vis_km = null,
        vis_miles = null,
        uv = this.uv,
        gust_mph = null,
        gust_kph = null
    )
}

fun Condition.toEntity(): com.oussama_chatri.weather.data.local.entities.Condition {
    return com.oussama_chatri.weather.data.local.entities.Condition(
        text = this.text,
        icon = null,
        code = this.code
    )
}

fun Forecast.toEntity(): com.oussama_chatri.weather.data.local.entities.Forecast {
    return com.oussama_chatri.weather.data.local.entities.Forecast(
        forecastday = this.forecastday.map { it.toEntity() }
    )
}

fun ForecastDay.toEntity(): com.oussama_chatri.weather.data.local.entities.ForecastDay {
    return com.oussama_chatri.weather.data.local.entities.ForecastDay(
        date = null,
        date_epoch = this.date_epoch,
        day = this.day.toEntity(),
        astro = this.astronomy.toEntity(),
        hour = this.hour.map { it.toEntity() }
    )
}

fun Day.toEntity(): com.oussama_chatri.weather.data.local.entities.Day {
    return com.oussama_chatri.weather.data.local.entities.Day(
        maxtemp_c = this.maxtemp_c,
        maxtemp_f = this.maxtemp_f,
        mintemp_c = this.mintemp_c,
        mintemp_f = this.mintemp_f,
        avgtemp_c = this.avgtemp_c,
        avgtemp_f = this.avgtemp_f,
        maxwind_mph = this.maxwind_mph,
        maxwind_kph = this.maxwind_kph,
        totalprecip_mm = null,
        totalprecip_in = null,
        totalsnow_cm = this.totalsnow_cm,
        avgvis_km = null,
        avgvis_miles = null,
        avghumidity = this.avghumidity,
        daily_will_it_rain = this.daily_will_it_rain,
        daily_chance_of_rain = this.daily_chance_of_rain,
        daily_will_it_snow = this.daily_will_it_snow,
        daily_chance_of_snow = this.daily_chance_of_snow,
        condition = this.condition.toEntity(),
        uv = this.uv
    )
}

fun Astronomy.toEntity(): com.oussama_chatri.weather.data.local.entities.Astro {
    return com.oussama_chatri.weather.data.local.entities.Astro(
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

fun Hour.toEntity(): com.oussama_chatri.weather.data.local.entities.Hour {
    return com.oussama_chatri.weather.data.local.entities.Hour(
        time_epoch = this.time_epoch,
        time = this.time,
        temp_c = this.temp_c,
        temp_f = this.temp_f,
        is_day = this.is_day,
        condition = this.condition.toEntity(),
        wind_mph = this.wind_mph,
        wind_kph = this.wind_kph,
        wind_degree = null,
        wind_dir = this.wind_dir,
        pressure_mb = this.pressure_mb,
        pressure_in = this.pressure_in,
        precip_mm = null,
        precip_in = null,
        snow_cm = this.snow_cm,
        humidity = this.humidity,
        cloud = this.cloud,
        feelslike_c = this.feelslike_c,
        feelslike_f = this.feelslike_f,
        windchill_c = null,
        windchill_f = null,
        heatindex_c = this.heatindex_c,
        heatindex_f = this.heatindex_f,
        dewpoint_c = this.dewpoint_c,
        dewpoint_f = this.dewpoint_f,
        will_it_rain = this.will_it_rain,
        chance_of_rain = this.chance_of_rain,
        will_it_snow = this.will_it_snow,
        chance_of_snow = this.chance_of_snow,
        vis_km = null,
        vis_miles = null,
        gust_mph = null,
        gust_kph = null,
        uv = this.uv
    )
}
