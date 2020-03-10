package ir.cena.dagger.di.module

import dagger.Module
import dagger.Provides
import ir.cena.dagger.Zsecure

@Module
class ApplicationModule {

    @Provides
    fun getZsecure(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is changed"
        return zsecure
    }
}