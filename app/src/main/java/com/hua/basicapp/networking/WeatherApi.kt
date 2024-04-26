package com.hua.basicapp.networking

import com.hua.basicapp.common.Constants
import com.hua.basicapp.data.model.CurrWeatherCondition
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("/current.json?key=" + Constants.WEATHER_API_KEY + "&q={city}&aqi=no")
    suspend fun currentCondition(@Query("city") cityName: String): Response<CurrWeatherCondition>
}