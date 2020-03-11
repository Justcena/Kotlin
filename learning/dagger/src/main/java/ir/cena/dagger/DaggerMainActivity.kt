package ir.cena.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.cena.dagger.di.DaggerLearningComponent
import ir.cena.dagger.di.LearningComponent
import javax.inject.Inject
import javax.inject.Named

class DaggerMainActivity : AppCompatActivity() {

    @Inject
    @field:Named("SafePref for Sina")
    lateinit var safePref1: SafePref

    @Inject
    @field:Named("SafePref for Sina")
    lateinit var safePref2: SafePref

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as DagerApplication).daggerComponent.mainACtivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_main)
        Log.d("Dagger", "Dagger Main Activity")
//        val component: LearningComponent =
//            DaggerLearningComponent.builder().setContext(this).build()
//        component.mainACtivityInject(this)
        safePref1.put("keys", "Sina")

        Log.d("DaggerMainActivity", "$safePref1 ?? $safePref2")

//        val sinaSafePref = component.getSafePrefSina()
//        val dinaSafePref = component.getSafePrefDina()
//
//        sinaSafePref.put("keyS", "Sina")
//        dinaSafePref.put("keyD", "Dina")
//        val sinaValue = sinaSafePref.get("keyS", "")
//        val dinaValue = dinaSafePref.get("keyD", "")
//        Log.d("DaggerMainActivity", "Value is $sinaValue")
//        Log.d("DaggerMainActivity", "Value is $dinaValue")
    }
}
