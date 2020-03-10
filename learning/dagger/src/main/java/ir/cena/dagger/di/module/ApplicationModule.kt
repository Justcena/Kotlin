package ir.cena.dagger.di.module

import dagger.Module
import dagger.Provides
import ir.cena.dagger.Zsecure
import ir.cena.dagger.di.qualifire.CustomQaulifireName
import javax.inject.Named

@Module
class ApplicationModule {

    @Named("Named for Dina")
    @Provides
    fun getZsecureDina(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is changed to Dina"
        return zsecure
    }

    @Named("Named for Sina")
    @Provides
    fun getZsecureSina(): Zsecure {
        val zsecure = Zsecure()
        zsecure.Z_KEY = "Z_KEY is changed to Sina"
        return zsecure
    }
}