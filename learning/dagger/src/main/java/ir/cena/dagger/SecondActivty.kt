package ir.cena.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.cena.dagger.di.DaggerActivityComponent
import javax.inject.Inject
import javax.inject.Named

class SecondActivty : AppCompatActivity() {
    @Inject
    @field:Named("SafePref for Sina")
    lateinit var safePrefSina: SafePref

    @Inject
    @field:Named("SafePref for Dina")
    lateinit var safePrefDina: SafePref

    @Inject
    @field:Named("Zcrypt for Sina")
    lateinit var zcriptSina: Zcript

    @Inject
    @field:Named("Zcrypt for Dina")
    lateinit var zcriptDina: Zcript

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        DaggerActivityComponent.builder()
            .getLearningComponent((applicationContext as DaggerApplication).daggerComponent).build()
            .secondACtivityInject(this)

        safePrefSina.put("keys", "Sina")
        safePrefDina.put("keys", "Dina")

        Log.d("Second Activity", "Safepref-----> Sina is $safePrefSina ?? Dina is $safePrefDina")
        Log.d("Second Activity", "Zcrypt ------> Sina is  $zcriptSina ?? Dina is $zcriptDina")
    }
}
