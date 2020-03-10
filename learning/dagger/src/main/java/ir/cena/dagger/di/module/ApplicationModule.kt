package ir.cena.dagger.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import ir.cena.dagger.SafePref
import ir.cena.dagger.Zcript
import ir.cena.dagger.Zsecure
import ir.cena.dagger.di.qualifire.CustomQaulifireName
import javax.inject.Named

@Module
class ApplicationModule {

    @Named("Zsecure for Sina")
    @Provides
    fun getZsecureSina(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is Sina"
        return zsecure
    }

    @Named("Zsecure for Dina")
    @Provides
    fun getZsecureDina(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is Dina"
        return zsecure
    }

    @Named("Zcrypt for Sina")
    @Provides
    fun getZcryptSina(@Named("Zsecure for Sina") zsecure: Zsecure): Zcript {
        val zcript = Zcript()
        zcript.injectZsecure(zsecure)
        return zcript
    }

    @Named("Zcrypt for Dina")
    @Provides
    fun getZcryptDina(@Named("Zsecure for Dina") zsecure: Zsecure): Zcript {
        val zcript = Zcript()
        zcript.injectZsecure(zsecure)
        return zcript
    }

    @Named("SafePref for Sina")
    @Provides
    fun getSafePrefSina(context: Context, @Named("Zcrypt for Sina") zcript: Zcript): SafePref =
        SafePref(context, zcript)

    @Named("SafePref for Dina")
    @Provides
    fun getSafePrefDina(context: Context, @Named("Zcrypt for Dina") zcript: Zcript): SafePref =
        SafePref(context, zcript)

}