package ir.cena.dagger.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ir.cena.dagger.SafePref
import ir.cena.dagger.Zcript
import ir.cena.dagger.di.module.SafePrefModule
import ir.cena.dagger.di.module.ZcryptModule
import ir.cena.dagger.di.module.ZsecureModule
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [ZcryptModule::class, ZsecureModule::class])
interface LearningComponent {

    fun getActivityComponent(): ActivityComponent.Builder
//    @Named("Zcrypt for Sina")
//    fun getZcyptSina(): Zcript
//
//    @Named("Zcrypt for Dina")
//    fun getZcyptDina(): Zcript
//
//    fun getContext(): Context

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun setContext(context: Context): Builder

        fun build(): LearningComponent
    }
}