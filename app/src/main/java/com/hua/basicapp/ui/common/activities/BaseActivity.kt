package com.hua.basicapp.ui.common.activities

import androidx.activity.ComponentActivity
import com.hua.basicapp.app.BasicApp
import com.hua.basicapp.dependencyinjection.activity.ActivityComponent
import com.hua.basicapp.dependencyinjection.activity.ActivityModule
import com.hua.basicapp.dependencyinjection.presentation.PresentationComponent
import com.hua.basicapp.dependencyinjection.presentation.PresentationModule
import com.hua.basicapp.dependencyinjection.presentation.UseCasesModule

open class BaseActivity: ComponentActivity() {
    val activityComponent: ActivityComponent by lazy {
        (application as BasicApp).appComponent.newActivityComponent(ActivityModule(this))
    }

    private val presentationComponent: PresentationComponent by lazy {
        activityComponent.newPresentationComponent(PresentationModule(), UseCasesModule())
    }

    protected val injector by lazy { presentationComponent }
}