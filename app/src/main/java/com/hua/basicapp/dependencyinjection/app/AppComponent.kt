package com.hua.basicapp.dependencyinjection.app
import com.hua.basicapp.dependencyinjection.activity.ActivityComponent
import com.hua.basicapp.dependencyinjection.activity.ActivityModule
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun newActivityComponent(module: ActivityModule): ActivityComponent
}