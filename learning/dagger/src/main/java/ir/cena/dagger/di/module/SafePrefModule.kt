package ir.cena.dagger.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ir.cena.dagger.SafePref
import ir.cena.dagger.Zcript
import ir.cena.dagger.Zsecure
import ir.cena.dagger.di.qualifire.CustomQaulifireName
import ir.cena.dagger.di.scope.ActivityScope
import javax.inject.Named
import javax.inject.Singleton

@Module
class SafePrefModule {
    @ActivityScope
    @Named("SafePref for Sina")
    @Provides
    fun getSafePrefSina(context: Context, @Named("Zcrypt for Sina") zcript: Zcript): SafePref =
        SafePref(context, zcript)

    @ActivityScope
    @Named("SafePref for Dina")
    @Provides
    fun getSafePrefDina(context: Context, @Named("Zcrypt for Dina") zcript: Zcript): SafePref =
        SafePref(context, zcript)

}