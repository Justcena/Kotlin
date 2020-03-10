package ir.cena.action

import android.content.Context
import android.content.Intent

object Action {
    fun openDaggerIntent(context: Context) = internalIntent(context, "action.dagger.open")
    private fun internalIntent(context: Context, action: String) =
        Intent(action).setPackage(context.packageName)
}