package ir.cena.dagger

import android.util.Base64
import android.util.Log
import ir.cena.dagger.di.qualifire.CustomQaulifireName
import javax.inject.Inject
import javax.inject.Named

class Zcript @Inject constructor() {

    var zsecure: Zsecure? = null

    fun encrpt(str: String): String {
        Log.d("Zcript", "Zsecure Named is ${zsecure?.Z_KEY}")
        return Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
    }

    fun decrypt(str: String) = String(Base64.decode(str, Base64.DEFAULT))

    @Inject
    fun injectZsecureSina(@Named("Zsecure for Sina") zsecure: Zsecure) {
        this.zsecure = zsecure
    }
    @Inject
    fun injectZsecureDina(@Named("Zsecure for Dina") zsecure: Zsecure) {
        this.zsecure = zsecure
    }
}