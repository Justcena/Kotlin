package ir.cena.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.cena.dagger.di.DaggerLearningComponent

class DaggerMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger_main)
        Log.d("Dagger", "Dagger Main Activity")
        val zcript = DaggerLearningComponent.create().getZcript()
        zcript.decrypt("")
    }
}
