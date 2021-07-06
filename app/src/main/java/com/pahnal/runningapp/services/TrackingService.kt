package com.pahnal.runningapp.services

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.pahnal.runningapp.utils.Constants.ACTION_PAUSE_SERVICE
import com.pahnal.runningapp.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.pahnal.runningapp.utils.Constants.ACTION_STOP_SERVICE
import timber.log.Timber

class TrackingService : LifecycleService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action) {
                ACTION_START_OR_RESUME_SERVICE -> {
                    Timber.d("Started or resumed service")
                }
                ACTION_PAUSE_SERVICE -> {
                    Timber.d("Pause service")
                }
                ACTION_STOP_SERVICE -> {
                    Timber.d("Stop service")
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

}