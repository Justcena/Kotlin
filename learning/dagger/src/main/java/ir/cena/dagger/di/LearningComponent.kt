package ir.cena.dagger.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.cena.dagger.SafePref
import ir.cena.dagger.Zcript
import ir.cena.dagger.di.module.ApplicationModule
import javax.inject.Named

@Component(modules = [ApplicationModule::class])
interface LearningComponent {

//    @Named("Zcrypt for Sina")
    fun getZcript(): Zcript

    @Named("SafePref for Sina")
    fun getSafePrefSina(): SafePref

    @Named("SafePref for Dina")
    fun getSafePrefDina(): SafePref

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): LearningComponent
    }
}