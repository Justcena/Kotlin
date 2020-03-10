package ir.cena.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.cena.dagger.di.DaggerLearningComponent
import ir.cena.dagger.di.LearningComponent

class DaggerMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_main)
        Log.d("Dagger", "Dagger Main Activity")
        val component: LearningComponent =
            DaggerLearningComponent.builder().setContext(this).build()
        val safePref = component.getSafePref()
        safePref.put("key", "arcademy")
        val value = safePref.get("key", "")
        Log.d("DaggerMainActivity", "Value is $value")
    }
}
