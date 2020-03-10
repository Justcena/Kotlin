package ir.cena.dagger

import android.util.Log
import javax.inject.Inject

class Zcript @Inject constructor(val zsecure: Zsecure) {
    fun encrpt(str: String): String {
        return str
    }


    fun decrypt(str: String): String {
        Log.d("Decrypt", "${zsecure.Z_IV}")
        return str
    }
}