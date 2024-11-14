package com.oussama_chatri.weather

import android.app.Application
import android.util.Log
import androidx.work.Configuration
import com.oussama_chatri.weather.data.offline.repositories.WeatherRepository
import com.oussama_chatri.weather.workers.WorkFactory
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class MainApp : Application(), Configuration.Provider {

    @Inject
    lateinit var workFactoryFactory: WorkFactory.Factory

    @Inject
    lateinit var weatherRepository: WeatherRepository

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setMinimumLoggingLevel(Log.DEBUG)
            .setWorkerFactory(workFactoryFactory.create(weatherRepository))
            .build()
}
