package com.hua.basicapp.data.repo

import com.hua.basicapp.data.model.CurrWeatherCondition
import com.hua.basicapp.networking.WeatherApi
import retrofit2.Response
import javax.inject.Inject

class WeatherDataRepo @Inject constructor(private val weatherApi: WeatherApi) {
    suspend fun loadCurrentWeather(cityName: String): Response<CurrWeatherCondition> {
        return weatherApi.currentCondition(cityName)
    }
}