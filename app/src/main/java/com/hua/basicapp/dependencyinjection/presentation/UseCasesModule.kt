package com.hua.basicapp.dependencyinjection.presentation

import com.hua.basicapp.data.repo.WeatherDataRepo
import com.hua.basicapp.domain.usecases.LoadCurrentWeatherUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCasesModule() {
    @Provides
    fun loadCurrentConditionUserCase(weatherDataRepo: WeatherDataRepo): LoadCurrentWeatherUseCase = LoadCurrentWeatherUseCase(weatherDataRepo)
}