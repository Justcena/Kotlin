package ir.cena.dagger.di.module

import dagger.Module
import dagger.Provides
import ir.cena.dagger.Zsecure
import ir.cena.dagger.di.qualifire.CustomQaulifireName

@Module
class ApplicationModule {

    @Provides
    fun getZsecureDina(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is changed to Dina"
        return zsecure
    }

    @CustomQaulifireName
    @Provides
    fun getZsecureSina(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is changed to Sina"
        return zsecure
    }
}