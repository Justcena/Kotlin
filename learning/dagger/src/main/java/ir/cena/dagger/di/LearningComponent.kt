package ir.cena.dagger.di

import dagger.Component
import ir.cena.dagger.SafePref
import ir.cena.dagger.Zcript
import ir.cena.dagger.di.module.ApplicationModule

@Component(modules = [ApplicationModule::class])
interface LearningComponent {

    fun getZcript(): Zcript
//    fun getSafePref(): SafePref
}