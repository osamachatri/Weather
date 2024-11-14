package com.oussama_chatri.weather

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oussama_chatri.weather.presentation.ui.theme.WeatherTheme
import com.oussama_chatri.weather.presentation.ui.theme.localCornerSizes
import com.oussama_chatri.weather.presentation.ui.theme.localIconSizes
import com.oussama_chatri.weather.presentation.ui.theme.localPaddingSizes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WeatherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        this
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, context: Context) {
    Column {
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = MaterialTheme.typography.displayMedium
        )
        Icon(painter = painterResource(id = R.drawable.location), contentDescription = null,
            tint = Color.Red,
                    modifier = Modifier.size(20.dp).padding(20.dp),
            )
        Text(
            text = "${MaterialTheme.localIconSizes} +${MaterialTheme.localCornerSizes}  ",
            modifier = modifier.padding(MaterialTheme.localPaddingSizes.large),
            style = MaterialTheme.typography.bodyLarge
        )
        val metrics = context.resources.displayMetrics
        val densityDpi = metrics.densityDpi
        Text(
            text = "densityDpi: $densityDpi",
            modifier = modifier.padding(MaterialTheme.localPaddingSizes.large),
            style = MaterialTheme.typography.bodyLarge
        )

    }

}
