package ir.cena.dagger.di.module

import dagger.Module
import dagger.Provides
import ir.cena.dagger.Zsecure
import javax.inject.Named

@Module
class ZsecureModule {
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
}