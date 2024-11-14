package com.oussama_chatri.weather.tools


import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun getCurrentHourIndex(timeZone: String): Int {
    val calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone))

    return calendar.get(Calendar.HOUR_OF_DAY)
}

fun getDayIndexFromRequest(requestTimestamp: Long, timeZone: String): Int {
    val requestCalendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone))
    requestCalendar.timeInMillis = requestTimestamp * 1000

    val currentCalendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone)).apply {
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
    }

    // Calculate the difference in days between the current date and the request date
    val diffInMillis = currentCalendar.timeInMillis - requestCalendar.timeInMillis
    val diffInDays = (diffInMillis / (1000 * 60 * 60 * 24)).toInt()

    return if (diffInDays < 0) -diffInDays else diffInDays
}

fun getCurrentDay(): String {
    val sdf = SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.getDefault())

    val currentDate = Date()

    return sdf.format(currentDate)
}

fun getFormattedDateInTimeZone(timeZone: String, language: String = Locale.getDefault().language): String {
    val calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone))
    val dateFormat = SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale(language))
    dateFormat.timeZone = calendar.timeZone
    return dateFormat.format(calendar.time)
}
