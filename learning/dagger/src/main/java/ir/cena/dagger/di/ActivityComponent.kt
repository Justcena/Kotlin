package ir.cena.dagger.di

import dagger.Component
import dagger.Subcomponent
import ir.cena.dagger.FirstActivity
import ir.cena.dagger.SecondActivty
import ir.cena.dagger.di.module.SafePrefModule
import ir.cena.dagger.di.scope.ActivityScope

@ActivityScope
@Subcomponent(modules = [SafePrefModule::class])
interface ActivityComponent {
    fun mainACtivityInject(activity: FirstActivity)
    fun secondACtivityInject(activity: SecondActivty)

//    @Component.Builder
//    interface Builder {
//        fun getLearningComponent(learningComponent: LearningComponent): Builder
//        fun build(): ActivityComponent
//    }
}