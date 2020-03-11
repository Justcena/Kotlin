package ir.cena.dagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.cena.dagger.di.DaggerActivityComponent
import kotlinx.android.synthetic.main.activity_first.*
import javax.inject.Inject
import javax.inject.Named

class FirstActivity : AppCompatActivity() {

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
//        (applicationContext as DagerApplication).daggerComponent.mainACtivityInject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        DaggerActivityComponent.builder()
            .getLearningComponent((applicationContext as ir.cena.dagger.DaggerApplication).daggerComponent)
            .build()
            .mainACtivityInject(this)
//        val component: LearningComponent =
//            DaggerLearningComponent.builder().setContext(this).build()
//        component.mainACtivityInject(this)
        safePrefSina.put("keys", "Sina")
        safePrefDina.put("keys", "Dina")

        Log.d("First Activity", "Safepref-----> Sina is $safePrefSina ?? Dina is $safePrefDina")
        Log.d("FIrst Activity", "Zcrypt ------> Sina is  $zcriptSina ?? Dina is $zcriptDina")
//        val sinaSafePref = component.getSafePrefSina()
//        val dinaSafePref = component.getSafePrefDina()
//
//        sinaSafePref.put("keyS", "Sina")
//        dinaSafePref.put("keyD", "Dina")
//        val sinaValue = sinaSafePref.get("keyS", "")
//        val dinaValue = dinaSafePref.get("keyD", "")
//        Log.d("DaggerMainActivity", "Value is $sinaValue")
//        Log.d("DaggerMainActivity", "Value is $dinaValue")
        btn_first.setOnClickListener {
            startActivity(Intent(this, SecondActivty::class.java))
        }
    }


}
