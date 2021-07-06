package com.pahnal.runningapp.utils

import android.Manifest
import android.Manifest.permission.*
import android.content.Context
import android.os.Build
import pub.devrel.easypermissions.EasyPermissions

object TrackingUtility {

    fun hasLocationPermission(context: Context) =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            EasyPermissions.hasPermissions(
                context,
                ACCESS_FINE_LOCATION,
                ACCESS_COARSE_LOCATION
            )
        } else {
            EasyPermissions.hasPermissions(
                context,
                ACCESS_FINE_LOCATION,
                ACCESS_COARSE_LOCATION,
                ACCESS_BACKGROUND_LOCATION
            )
        }
}