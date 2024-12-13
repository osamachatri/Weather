package com.oussama_chatri.weather.presentation.ui.theme

import com.oussama_chatri.weather.R

fun getWeatherIconResource(conditionCode: Int, isDay: Boolean): Int {
    return when (conditionCode) {
        1000 -> if (isDay) R.drawable.sunny else R.drawable.clearn
        1003 -> if (isDay) R.drawable.pcloudyt else R.drawable.pcloudyn
        1006 -> R.drawable.cloudy
        1009 -> R.drawable.mcloudy
        1030 -> R.drawable.mist
        1063 -> if (isDay) R.drawable.rain else R.drawable.rainn
        1066 -> if (isDay) R.drawable.snow else R.drawable.snown
        1069 -> if (isDay) R.drawable.sleet else R.drawable.sleetn
        1072 -> if (isDay) R.drawable.fdrizzle else R.drawable.fdrizzlen
        1087 -> if (isDay) R.drawable.tstorm else R.drawable.tstormn
        1114 -> R.drawable.blowingsnow
        1117 -> R.drawable.blizzard
        1135 -> R.drawable.fog
        1147 -> R.drawable.freezingrain
        1150 -> if (isDay) R.drawable.drizzle else R.drawable.drizzlen
        1153 -> if (isDay) R.drawable.fdrizzle else R.drawable.fdrizzlen
        1168 -> R.drawable.freezingrain
        1171 -> R.drawable.freezingrain
        1180 -> if (isDay) R.drawable.rain else R.drawable.rainn
        1183 -> if (isDay) R.drawable.rain else R.drawable.rainn
        1186 -> R.drawable.rain
        1189 -> R.drawable.rain
        1192 -> if (isDay) R.drawable.rain else R.drawable.rainn
        1195 -> R.drawable.rain
        1198 -> R.drawable.freezingrain
        1201 -> R.drawable.freezingrain
        1204 -> if (isDay) R.drawable.sleet else R.drawable.sleetn
        1207 -> R.drawable.sleet // Moderate or heavy sleet
        1210 -> if (isDay) R.drawable.snow else R.drawable.snown
        1213 -> if (isDay) R.drawable.snow else R.drawable.snown
        1216 -> R.drawable.snow
        1219 -> R.drawable.snow
        1222 -> R.drawable.snow
        1225 -> R.drawable.snow
        1237 -> if (isDay) R.drawable.snow else R.drawable.snown
        1240 -> if (isDay) R.drawable.showers else R.drawable.showersn
        1243 -> if (isDay) R.drawable.showers else R.drawable.showersn
        1246 -> R.drawable.showers
        1249 -> R.drawable.sleet
        1252 -> R.drawable.sleet
        1255 -> R.drawable.snow
        1258 -> R.drawable.snow
        1261 -> R.drawable.snowshowers
        1264 -> R.drawable.snowshowers
        1273 -> R.drawable.tstorm
        1276 -> R.drawable.tstorm
        1279 -> R.drawable.tstorm
        1282 -> R.drawable.tstorm
        else -> R.drawable.na
    }
}
