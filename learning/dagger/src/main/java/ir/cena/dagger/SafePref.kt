package ir.cena.dagger

import android.content.Context
import android.util.Log
import javax.inject.Inject

class SafePref @Inject constructor(private val context: Context, private val zcript: Zcript) {
    private val pref = context.getSharedPreferences("dagger_pref", Context.MODE_PRIVATE)
    private val editor = pref.edit()

    fun put(key: String, value: String) {
        val encrpt = zcript.encrpt(value)
        Log.d("SafePref", "$encrpt")
        editor.putString(key, encrpt)
        editor.commit()
    }

    fun get(key: String, default: String): String =
        zcript.decrypt(pref.getString(key, default) ?: default)

}