package com.oussama_chatri.weather.tools

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.drawable.Icon
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import com.oussama_chatri.weather.R


fun createNotification(
    context: Context,
    channelId: String,
    channelName: String,
    notificationId: Int,
    title: String,
    message: String,
    largeIcon : Icon
) {
    Log.d("NotificationDebug", "createNotification called $notificationId")
    val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    // For API 26+, create a notification channel
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        if (notificationManager.getNotificationChannel(channelId) == null) {
            val channel = NotificationChannel(
                channelId,
                channelName,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Channel description"
            }
            notificationManager.createNotificationChannel(channel)
        }
    }
    // Create the notification using NotificationCompat for backward compatibility
    val notificationBuilder = NotificationCompat.Builder(context, channelId)
        .setSmallIcon(R.drawable.ic_launcher_background)
        .setContentTitle(title)
        .setLargeIcon(if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) largeIcon else null)
        .setContentText(message)
        .setPriority(NotificationCompat.PRIORITY_DEFAULT) // For devices below API level 26
        .setAutoCancel(true)

    // Build and display the notification
    val notification: Notification = notificationBuilder.build()
    notificationManager.notify(notificationId, notification)
    notificationManager.notify(notificationId, notification)
}