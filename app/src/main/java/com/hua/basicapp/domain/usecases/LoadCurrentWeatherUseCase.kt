package com.hua.basicapp.domain.usecases

import com.hua.basicapp.data.model.CurrWeatherCondition
import com.hua.basicapp.data.repo.WeatherDataRepo
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoadCurrentWeatherUseCase constructor(private val weatherDataRepo: WeatherDataRepo) {
    sealed class Result {
        class Success(val currentCondition: CurrWeatherCondition) : Result()
        object Failure: Result()
    }

    suspend fun loadCurrentWeather(cityName: String): Result {
        return withContext(Dispatchers.IO) {
            try {
                val response = weatherDataRepo.loadCurrentWeather(cityName)
                if (response.isSuccessful && response.body() != null) {
                    return@withContext Result.Success(response.body()!!)
                } else {
                    return@withContext Result.Failure
                }
            } catch (t: Throwable) {
                if (t !is CancellationException) {
                    return@withContext Result.Failure
                } else {
                    throw t
                }
            }
        }
    }
}