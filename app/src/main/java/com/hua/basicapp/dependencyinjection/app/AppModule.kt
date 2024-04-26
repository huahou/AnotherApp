package com.hua.basicapp.dependencyinjection.app
import android.app.Application
import com.hua.basicapp.common.Constants
import com.hua.basicapp.networking.WeatherApi
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class AppModule(val app: Application) {

    @Provides
    fun okHttpClient(): OkHttpClient = OkHttpClient().newBuilder()
//        .addNetworkInterceptor(interceptor)
//        .authenticator(authenticator)
        .build()

    @Provides
    @AppScope
    fun retrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(Constants.WEATHER_API_BASE_URL)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun application() = app

    @Provides
    @AppScope
    fun weatherApi(retrofit: Retrofit): WeatherApi  = retrofit.create(WeatherApi::class.java)
}