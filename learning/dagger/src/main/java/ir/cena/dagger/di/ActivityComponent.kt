package ir.cena.dagger.di

import dagger.Component
import ir.cena.dagger.FirstActivity
import ir.cena.dagger.SecondActivty
import ir.cena.dagger.di.module.SafePrefModule
import ir.cena.dagger.di.scope.ActivityScope

@ActivityScope
@Component(dependencies = [LearningComponent::class], modules = [SafePrefModule::class])
interface ActivityComponent {
    fun mainACtivityInject(activity: FirstActivity)
    fun secondACtivityInject(activity: SecondActivty)
}