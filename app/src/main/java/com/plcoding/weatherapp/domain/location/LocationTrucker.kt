package com.plcoding.weatherapp.domain.location

import android.location.Location

interface LocationTrucker {
    suspend fun getCurrentLocation(): Location?
}