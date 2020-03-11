package ir.cena.koltin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.cena.action.Action

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("App", "App Main Activity")
        startActivity(Action.openDaggerIntent(this))
    }
}
