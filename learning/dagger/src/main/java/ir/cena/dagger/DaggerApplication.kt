package ir.cena.dagger

import android.app.Application
import ir.cena.dagger.di.DaggerLearningComponent
import ir.cena.dagger.di.LearningComponent

class DaggerApplication : Application() {
    lateinit var daggerComponent: LearningComponent

    override fun onCreate() {
        super.onCreate()
        daggerComponent = DaggerLearningComponent.builder().setContext(this).build()
    }

}