package matteocrippa.it.fragmentcontextivity

import android.content.Context
import android.os.Build
import android.support.v4.app.Fragment

/**
 * Created by matteocrippa on 12/12/2017.
 */

fun Fragment.context(): Context {
    return when (Build.VERSION.SDK_INT > 22) {
        true -> context
        else -> activity
    }
}