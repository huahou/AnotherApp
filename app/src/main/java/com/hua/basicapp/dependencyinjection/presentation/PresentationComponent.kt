package com.hua.basicapp.dependencyinjection.presentation
import com.hua.basicapp.ui.activities.MainActivity
import dagger.Subcomponent

@PresentationScope
@Subcomponent(modules = [PresentationModule::class, UseCasesModule::class])
interface PresentationComponent {
    fun inject(activity: MainActivity)
}