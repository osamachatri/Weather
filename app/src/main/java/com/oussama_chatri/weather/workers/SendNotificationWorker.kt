package com.oussama_chatri.weather.workers

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.ListenableWorker
import androidx.work.WorkerFactory
import androidx.work.WorkerParameters
import com.oussama_chatri.weather.data.offline.repositories.WeatherRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

@HiltWorker
class SendNotificationWorker @AssistedInject constructor(
    @Assisted private val context: Context,
    @Assisted params: WorkerParameters,
    private val weatherRepository: WeatherRepository
) : CoroutineWorker(
    context,
    params
) {
    override suspend fun doWork(): Result {
        return try {
//            createNotification(context, "my_channel_id", "My Channel", (6487..99744).random(), "Title", "Message", context.getDrawable(R.drawable.notification))
            Result.success()
        } catch (e: Exception) {
            Log.d("SendNotificationWorker", "doWork: ${e.message}")
            Result.failure()
        }
    }
}

class WorkFactory @AssistedInject constructor(
    @Assisted private val weatherRepository: WeatherRepository
) : WorkerFactory() {
    override fun createWorker(
        appContext: Context,
        workerClassName: String,
        workerParameters: WorkerParameters
    ): ListenableWorker? {
        return when (workerClassName) {
            SendNotificationWorker::class.java.name ->
                SendNotificationWorker(appContext, workerParameters, weatherRepository)
            else -> null
        }
    }

    // Define a Factory interface to allow Assisted Injection
    @AssistedFactory
    interface Factory {
        fun create(weatherRepository: WeatherRepository): WorkFactory
    }
}


