package com.oussama_chatri.weather.domain.models

data class Weather(
    val id : Int,
    val location: Location?,
    val current: Current?,
    val forecast: Forecast?
)

data class Location(
    val name: String,
    val tz_id: String,
    val localtime_epoch: Long,
)

data class Current(
    val last_updated_epoch: Long,
    val temp_c: Double,
    val temp_f: Double,
    val is_day: Int,
    val condition: Condition,
    val wind_kph: Double,
    val wind_mph: Double,
    val pressure_mb: Double,
    val pressure_in: Double,
    val humidity: Int,
    val dewpoint_c : Double,
    val dewpoint_f : Double,
    val uv: Double
)

data class Condition(
    val text: String,
    val code: Int
)

data class Forecast(
    val forecastday: List<ForecastDay>
)

data class ForecastDay(
    val date_epoch: Long,
    val day: Day,
    val astronomy: Astronomy,
    val hour: List<Hour>
)

data class Day(
    val maxtemp_c: Double,
    val maxtemp_f: Double,
    val mintemp_c: Double,
    val mintemp_f: Double,
    val avgtemp_c: Double,
    val avgtemp_f: Double,
    val maxwind_mph: Double,
    val maxwind_kph: Double,
    val totalsnow_cm: Double,
    val avghumidity: Int,
    val daily_will_it_rain: Int,
    val daily_chance_of_rain: Int,
    val daily_will_it_snow: Int,
    val daily_chance_of_snow: Int,
    val condition: Condition,
    val uv: Double
)

data class Hour(
    val time_epoch: Long,
    val time: String,
    val temp_c: Double,
    val temp_f: Double,
    val is_day: Int,
    val condition: Condition,
    val wind_mph: Double,
    val wind_kph: Double,
    val wind_dir: String,
    val pressure_mb: Double,
    val pressure_in: Double,
    val snow_cm: Double,
    val humidity: Int,
    val cloud: Int,
    val feelslike_c: Double,
    val feelslike_f: Double,
    val heatindex_c: Double?,
    val heatindex_f: Double?,
    val dewpoint_c: Double,
    val dewpoint_f: Double,
    val will_it_rain: Int,
    val chance_of_rain: Int,
    val will_it_snow: Int,
    val chance_of_snow: Int,
    val uv: Double
)

data class Astronomy(
    val sunrise: String,
    val sunset: String,
    val moonrise: String,
    val moonset: String,
    val moon_phase: String,
    val moon_illumination: String,
    val is_moon_up: Int,
    val is_sun_up: Int
)

