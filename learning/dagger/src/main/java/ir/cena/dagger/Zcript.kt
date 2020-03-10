package ir.cena.dagger

import android.util.Log
import javax.inject.Inject

class Zcript @Inject constructor() {

    var zsecure: Zsecure? = null

    fun encrpt(str: String) = str

    fun decrypt(str: String): String {
        Log.d("Decrypt", zsecure?.Z_IV)
        return str
    }

    @Inject
    fun injectZsecure(zsecure: Zsecure) {
        this.zsecure = zsecure
    }
}