package com.hua.basicapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.hua.basicapp.domain.usecases.LoadCurrentWeatherUseCase
import javax.inject.Inject

class WeatherViewModel @Inject constructor(val currentConditionUseCase: LoadCurrentWeatherUseCase): ViewModel() {
}