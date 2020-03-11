package ir.cena.dagger.di.module

import dagger.Module
import dagger.Provides
import ir.cena.dagger.Zcript
import ir.cena.dagger.Zsecure
import javax.inject.Named
import javax.inject.Singleton

@Module
class ZcryptModule {
    @Singleton
    @Named("Zcrypt for Sina")
    @Provides
    fun getZcryptSina(@Named("Zsecure for Sina") zsecure: Zsecure): Zcript {
        val zcript = Zcript()
        zcript.injectZsecureSina(zsecure)
        return zcript
    }

    @Singleton
    @Named("Zcrypt for Dina")
    @Provides
    fun getZcryptDina(@Named("Zsecure for Dina") zsecure: Zsecure): Zcript {
        val zcript = Zcript()
        zcript.injectZsecureDina(zsecure)
        return zcript
    }
}