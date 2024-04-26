package com.hua.basicapp.data.model

import com.google.gson.annotations.SerializedName

data class CurrWeatherCondition(
    @SerializedName("temp_f") val temperatureF: Double
)
