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

fun weatherApiToEntity(apiWeatherData: com.oussama_chatri.weather.data.remote.responses.WeatherData): WeatherData {
    return WeatherData(
        location = apiToEntityLocation(apiWeatherData.location),
        current = apiToEntityCurrent(apiWeatherData.current),
        forecast = apiToEntityForecast(apiWeatherData.forecast)
    )
}


fun apiToEntityLocation(apiLocation: com.oussama_chatri.weather.data.remote.responses.Location): Location {
    return Location(
        name = apiLocation.name,
        region = apiLocation.region,
        country = apiLocation.country,
        lat = apiLocation.lat,
        lon = apiLocation.lon,
        tz_id = apiLocation.tz_id,
        localtime_epoch = apiLocation.localtime_epoch,
        localtime = apiLocation.localtime
    )
}

fun apiToEntityCurrent(apiCurrent: com.oussama_chatri.weather.data.remote.responses.Current): Current {
    return Current(
        last_updated_epoch = apiCurrent.last_updated_epoch,
        last_updated = apiCurrent.last_updated,
        temp_c = apiCurrent.temp_c,
        temp_f = apiCurrent.temp_f,
        is_day = apiCurrent.is_day,
        condition = apiToEntityCondition(apiCurrent.condition),
        wind_mph = apiCurrent.wind_mph,
        wind_kph = apiCurrent.wind_kph,
        wind_degree = apiCurrent.wind_degree,
        wind_dir = apiCurrent.wind_dir,
        pressure_mb = apiCurrent.pressure_mb,
        pressure_in = apiCurrent.pressure_in,
        precip_mm = apiCurrent.precip_mm,
        precip_in = apiCurrent.precip_in,
        humidity = apiCurrent.humidity,
        cloud = apiCurrent.cloud,
        feelslike_c = apiCurrent.feelslike_c,
        feelslike_f = apiCurrent.feelslike_f,
        windchill_c = apiCurrent.windchill_c,
        windchill_f = apiCurrent.windchill_f,
        heatindex_c = apiCurrent.heatindex_c,
        heatindex_f = apiCurrent.heatindex_f,
        dewpoint_c = apiCurrent.dewpoint_c,
        dewpoint_f = apiCurrent.dewpoint_f,
        vis_km = apiCurrent.vis_km,
        vis_miles = apiCurrent.vis_miles,
        uv = apiCurrent.uv,
        gust_mph = apiCurrent.gust_mph,
        gust_kph = apiCurrent.gust_kph
    )
}

fun apiToEntityCondition(apiCondition: com.oussama_chatri.weather.data.remote.responses.Condition): Condition {
    return Condition(
        text = apiCondition.text,
        icon = apiCondition.icon,
        code = apiCondition.code
    )
}

fun apiToEntityForecast(apiForecast: com.oussama_chatri.weather.data.remote.responses.Forecast): Forecast {
    return Forecast(
        forecastday = apiToEntityForecastDayList(apiForecast.forecastday)
    )
}

fun apiToEntityForecastDayList(apiForecastDayList: List<com.oussama_chatri.weather.data.remote.responses.ForecastDay>): List<ForecastDay> {
    return apiForecastDayList.map { apiToEntityForecastDay(it) }
}

fun apiToEntityForecastDay(apiForecastDay: com.oussama_chatri.weather.data.remote.responses.ForecastDay): ForecastDay {
    return ForecastDay(
        date = apiForecastDay.date,
        date_epoch = apiForecastDay.date_epoch,
        day = apiToEntityDay(apiForecastDay.day),
        astro = apiToEntityAstro(apiForecastDay.astro),
        hour = apiToEntityHourList(apiForecastDay.hour)
    )
}


fun apiToEntityDay(apiDay: com.oussama_chatri.weather.data.remote.responses.Day): Day {
    return Day(
        maxtemp_c = apiDay.maxtemp_c,
        maxtemp_f = apiDay.maxtemp_f,
        mintemp_c = apiDay.mintemp_c,
        mintemp_f = apiDay.mintemp_f,
        avgtemp_c = apiDay.avgtemp_c,
        avgtemp_f = apiDay.avgtemp_f,
        maxwind_mph = apiDay.maxwind_mph,
        maxwind_kph = apiDay.maxwind_kph,
        totalprecip_mm = apiDay.totalprecip_mm,
        totalprecip_in = apiDay.totalprecip_in,
        totalsnow_cm = apiDay.totalsnow_cm,
        avgvis_km = apiDay.avgvis_km,
        avgvis_miles = apiDay.avgvis_miles,
        avghumidity = apiDay.avghumidity,
        daily_will_it_rain = apiDay.daily_will_it_rain,
        daily_chance_of_rain = apiDay.daily_chance_of_rain,
        daily_will_it_snow = apiDay.daily_will_it_snow,
        daily_chance_of_snow = apiDay.daily_chance_of_snow,
        condition = apiToEntityCondition(apiDay.condition),
        uv = apiDay.uv
    )
}

fun apiToEntityAstro(apiAstro: com.oussama_chatri.weather.data.remote.responses.Astro): Astro {
    return Astro(
        sunrise = apiAstro.sunrise,
        sunset = apiAstro.sunset,
        moonrise = apiAstro.moonrise,
        moonset = apiAstro.moonset,
        moon_phase = apiAstro.moon_phase,
        moon_illumination = apiAstro.moon_illumination,
        is_moon_up = apiAstro.is_moon_up,
        is_sun_up = apiAstro.is_sun_up
    )
}

fun apiToEntityHourList(apiHourList: List<com.oussama_chatri.weather.data.remote.responses.Hour>): List<Hour> {
    return apiHourList.map { apiToEntityHour(it) }
}

fun apiToEntityHour(apiHour: com.oussama_chatri.weather.data.remote.responses.Hour): Hour {
    return Hour(
        time_epoch = apiHour.time_epoch,
        time = apiHour.time,
        temp_c = apiHour.temp_c,
        temp_f = apiHour.temp_f,
        is_day = apiHour.is_day,
        condition = apiToEntityCondition(apiHour.condition),
        wind_mph = apiHour.wind_mph,
        wind_kph = apiHour.wind_kph,
        wind_degree = apiHour.wind_degree,
        wind_dir = apiHour.wind_dir,
        pressure_mb = apiHour.pressure_mb,
        pressure_in = apiHour.pressure_in,
        precip_mm = apiHour.precip_mm,
        precip_in = apiHour.precip_in,
        snow_cm = apiHour.snow_cm,
        humidity = apiHour.humidity,
        cloud = apiHour.cloud,
        feelslike_c = apiHour.feelslike_c,
        feelslike_f = apiHour.feelslike_f,
        windchill_c = apiHour.windchill_c,
        windchill_f = apiHour.windchill_f,
        heatindex_c = apiHour.heatindex_c,
        heatindex_f = apiHour.heatindex_f,
        dewpoint_c = apiHour.dewpoint_c,
        dewpoint_f = apiHour.dewpoint_f,
        will_it_rain = apiHour.will_it_rain,
        chance_of_rain = apiHour.chance_of_rain,
        will_it_snow = apiHour.will_it_snow,
        chance_of_snow = apiHour.chance_of_snow,
        vis_km = apiHour.vis_km,
        vis_miles = apiHour.vis_miles,
        gust_mph = apiHour.gust_mph,
        gust_kph = apiHour.gust_kph,
        uv = apiHour.uv
    )
}

