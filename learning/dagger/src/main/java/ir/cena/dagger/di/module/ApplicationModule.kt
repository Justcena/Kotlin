package ir.cena.dagger.di.module

import dagger.Module
import dagger.Provides
import ir.cena.dagger.Zsecure

@Module
class ApplicationModule {

    @Provides
    fun getsZsecure() = Zsecure()
}