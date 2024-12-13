package com.oussama_chatri.weather.presentation.ui.theme

import androidx.compose.ui.graphics.Color

fun getGradientForWeather(conditionCode: Int, isDay: Boolean): Pair<Color, Color> {
    return when (conditionCode) {
        1000 -> if (isDay) Pair(Color(0xFFf7bc1c), Color(0xFFfe9c2f)) else Pair(Color(0xFF001f4d), Color(0xFF003366))
        1003 -> if (isDay) Pair(Color(0xFF83c9ff), Color(0xFFcce7ff)) else Pair(Color(0xFF2f4b6e), Color(0xFF3e5a7d))
        1006 -> if (isDay) Pair(Color(0xFFa0a0a0), Color(0xFF8c8c8c)) else Pair(Color(0xFF4f4f4f), Color(0xFF3e3e3e))
        1009 -> if (isDay) Pair(Color(0xFF7a7a7a), Color(0xFF595959)) else Pair(Color(0xFF3d3d3d), Color(0xFF2c2c2c))
        1030 -> if (isDay) Pair(Color(0xFF5c6e72), Color(0xFF4b5a61)) else Pair(Color(0xFF2a353c), Color(0xFF3a4a56))
        1063 -> if (isDay) Pair(Color(0xFFf3c1a2), Color(0xFFdb8a62)) else Pair(Color(0xFF2f3c4b), Color(0xFF3d4e5c))
        1066 -> if (isDay) Pair(Color(0xFFc2c2c2), Color(0xFFb1b1b1)) else Pair(Color(0xFF707070), Color(0xFF595959))
        1069 -> if (isDay) Pair(Color(0xFF9e9e9e), Color(0xFF7c7c7c)) else Pair(Color(0xFF4d4d4d), Color(0xFF363636))
        1072 -> if (isDay) Pair(Color(0xFFe5d7b9), Color(0xFFc1b7a0)) else Pair(Color(0xFF3b4b56), Color(0xFF4c5b69))
        1087 -> if (isDay) Pair(Color(0xFF5d7a9d), Color(0xFF4b5f72)) else Pair(Color(0xFF2f3e4b), Color(0xFF3c4e5d))
        1114 -> if (isDay) Pair(Color(0xFFd6e4ff), Color(0xFFbbc6d5)) else Pair(Color(0xFF3a4a60), Color(0xFF4e5c6e))
        1117 -> if (isDay) Pair(Color(0xFF9bb0cd), Color(0xFF7b8fa5)) else Pair(Color(0xFF3b4e6e), Color(0xFF4b5f7d))
        1135 -> if (isDay) Pair(Color(0xFF808080), Color(0xFF6d6d6d)) else Pair(Color(0xFF2d3d42), Color(0xFF3e4e55))
        1147 -> if (isDay) Pair(Color(0xFFb0d4e1), Color(0xFF9ca8a9)) else Pair(Color(0xFF2f3e44), Color(0xFF3c4c5a))
        1150 -> if (isDay) Pair(Color(0xFFf1e1b7), Color(0xFFd6b991)) else Pair(Color(0xFF3e4c3e), Color(0xFF4b5f47))
        1153 -> if (isDay) Pair(Color(0xFFb2a994), Color(0xFF9e8c75)) else Pair(Color(0xFF444030), Color(0xFF565144))
        1168 -> if (isDay) Pair(Color(0xFFdbd2c8), Color(0xFFb4b0a0)) else Pair(Color(0xFF3e3d2e), Color(0xFF4a4936))
        1171 -> if (isDay) Pair(Color(0xFF9c9b8f), Color(0xFF7f7e6e)) else Pair(Color(0xFF3c3b2d), Color(0xFF484633))
        1180 -> if (isDay) Pair(Color(0xFF9fbbdf), Color(0xFF8ea0b7)) else Pair(Color(0xFF3b4a59), Color(0xFF4d5e71))
        1183 -> if (isDay) Pair(Color(0xFF91b2d2), Color(0xFF7a8f9c)) else Pair(Color(0xFF2e3f55), Color(0xFF3f4c6a))
        1186 -> if (isDay) Pair(Color(0xFF7f8c9d), Color(0xFF607387)) else Pair(Color(0xFF3b4f6a), Color(0xFF4b5e6e))
        1189 -> if (isDay) Pair(Color(0xFF4c6b8f), Color(0xFF3e5c72)) else Pair(Color(0xFF2c3e4f), Color(0xFF3b4e64))
        1192 -> if (isDay) Pair(Color(0xFF3f5f80), Color(0xFF314a66)) else Pair(Color(0xFF2c3f57), Color(0xFF3e4f67))
        1195 -> if (isDay) Pair(Color(0xFF2f4d6a), Color(0xFF263c51)) else Pair(Color(0xFF1f2c3d), Color(0xFF2d3c4e))
        1198 -> if (isDay) Pair(Color(0xFF4c6e9a), Color(0xFF3e5878)) else Pair(Color(0xFF2d3d4e), Color(0xFF3f4d65))
        1201 -> if (isDay) Pair(Color(0xFF3c4f71), Color(0xFF2c3e58)) else Pair(Color(0xFF1f2f3f), Color(0xFF2b3c4e))
        1204 -> if (isDay) Pair(Color(0xFF8b9cbe), Color(0xFF6b7d96)) else Pair(Color(0xFF3a4b62), Color(0xFF4c5e73))
        1207 -> if (isDay) Pair(Color(0xFF4b5a6d), Color(0xFF3e4a5b)) else Pair(Color(0xFF2f3d4f), Color(0xFF3b4e61))
        1210 -> if (isDay) Pair(Color(0xFFb3d1f5), Color(0xFF99c3e0)) else Pair(Color(0xFF2f3e55), Color(0xFF3b4c65))
        1213 -> if (isDay) Pair(Color(0xFF7b9bb2), Color(0xFF6b7e8a)) else Pair(Color(0xFF2d3f4d), Color(0xFF3c4f63))
        1216 -> if (isDay) Pair(Color(0xFFa0b3bf), Color(0xFF8a97a4)) else Pair(Color(0xFF3b4d62), Color(0xFF4a5d73))
        1219 -> if (isDay) Pair(Color(0xFF6c8a94), Color(0xFF5d6e7a)) else Pair(
            Color(0xFF2f3e50),
            Color(0xFF3e4f68)
        )
        1222 -> if (isDay) Pair(Color(0xFFb7d0e6), Color(0xFFa1b9cc)) else Pair(
            Color(0xFF2e3f5d),
            Color(0xFF3e4f6d)
        )
        1225 -> if (isDay) Pair(Color(0xFF92b6cc), Color(0xFF7d9fae)) else Pair(
            Color(0xFF2f3f56),
            Color(0xFF3e4f67)
        )
        1237 -> if (isDay) Pair(Color(0xFF4b646d), Color(0xFF3b4f5c)) else Pair(
            Color(0xFF2c3d4e),
            Color(0xFF3c4e5f)
        )
        1240 -> if (isDay) Pair(Color(0xFF84b8c5), Color(0xFF68848d)) else Pair(
            Color(0xFF2f3e4f),
            Color(0xFF3e4f62)
        )
        1243 -> if (isDay) Pair(Color(0xFF5d7f8d), Color(0xFF4a6070)) else Pair(
            Color(0xFF2e3e4d),
            Color(0xFF3f4f60)
        )
        1246 -> if (isDay) Pair(Color(0xFF3e5f76), Color(0xFF2c3f55)) else Pair(
            Color(0xFF2d3e4d),
            Color(0xFF3e4f63)
        )
        1249 -> if (isDay) Pair(Color(0xFF4f6c7d), Color(0xFF3e5562)) else Pair(
            Color(0xFF2d3e4f),
            Color(0xFF3e4f67)
        )
        1252 -> if (isDay) Pair(Color(0xFF7b9cbd), Color(0xFF66818e)) else Pair(
            Color(0xFF2f3e50),
            Color(0xFF3e4f6c)
        )
        1255 -> if (isDay) Pair(Color(0xFFb3d1f5), Color(0xFF99c3e0)) else Pair(
            Color(0xFF2f3e55),
            Color(0xFF3b4c65)
        )
        1258 -> if (isDay) Pair(Color(0xFF7b9bb2), Color(0xFF6b7e8a)) else Pair(
            Color(0xFF2d3f4d),
            Color(0xFF3c4f63)
        )
        1261 -> if (isDay) Pair(Color(0xFF4b646d), Color(0xFF3b4f5c)) else Pair(
            Color(0xFF2c3d4e),
            Color(0xFF3c4e5f)
        )
        1264 -> if (isDay) Pair(Color(0xFF4b5a6d), Color(0xFF3e4a5b)) else Pair(
            Color(0xFF2f3d4f),
            Color(0xFF3b4e61)
        )
        1273 -> if (isDay) Pair(Color(0xFF9cdbf5), Color(0xFF6cc3e0)) else Pair(
            Color(0xFF2f4c5d),
            Color(0xFF3b5c67)
        )
        1276 -> if (isDay) Pair(Color(0xFF709bdf), Color(0xFF587bb7)) else Pair(
            Color(0xFF2f4a6a),
            Color(0xFF3b5f7d)
        )
        1279 -> if (isDay) Pair(Color(0xFFb1c9f5), Color(0xFF9bb1d5)) else Pair(
            Color(0xFF2f3e5d),
            Color(0xFF3b4e6c)
        )
        1282 -> if (isDay) Pair(Color(0xFFa0b3bf), Color(0xFF8a97a4)) else Pair(
            Color(0xFF3b4d62),
            Color(0xFF4a5d73)
        )
        else -> Pair(Color(0xFF808080), Color(0xFF606060))
    }
}
