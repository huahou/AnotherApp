package com.hua.basicapp.dependencyinjection.activity
import com.hua.basicapp.dependencyinjection.presentation.PresentationComponent
import com.hua.basicapp.dependencyinjection.presentation.PresentationModule
import com.hua.basicapp.dependencyinjection.presentation.UseCasesModule
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun newPresentationComponent(pModule: PresentationModule, uModule: UseCasesModule): PresentationComponent
}