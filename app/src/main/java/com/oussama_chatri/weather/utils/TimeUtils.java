package com.oussama_chatri.weather.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeUtils {

    public static int getCurrentHourIndex(String timeZone) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public static int getDayIndexFromRequest(long requestTimestamp, String timeZone) {
        Calendar requestCalendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        requestCalendar.setTimeInMillis(requestTimestamp * 1000);

        Calendar currentCalendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        currentCalendar.set(Calendar.HOUR_OF_DAY, 0);
        currentCalendar.set(Calendar.MINUTE, 0);
        currentCalendar.set(Calendar.SECOND, 0);
        currentCalendar.set(Calendar.MILLISECOND, 0);

        long diffInMillis = currentCalendar.getTimeInMillis() - requestCalendar.getTimeInMillis();
        int diffInDays = (int) (diffInMillis / (1000 * 60 * 60 * 24));

        return diffInDays < 0 ? -diffInDays : diffInDays;
    }

    public static String getCurrentDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.getDefault());
        Date currentDate = new Date();
        return sdf.format(currentDate);
    }

    public static String getFormattedDateInTimeZone(String timeZone, String language) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timeZone));
        Locale locale = new Locale(language);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy", locale);
        dateFormat.setTimeZone(calendar.getTimeZone());
        return dateFormat.format(calendar.getTime());
    }

    public static String getDayOfWeekFromTimestamp(long timestamp) {
        Date date = new Date(timestamp * 1000);
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.getDefault());
        return dayFormat.format(date);
    }
}

