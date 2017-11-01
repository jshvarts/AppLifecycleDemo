package com.example.applifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context
import android.widget.Toast
import javax.inject.Inject

/**
 * Displays a message when app comes to foreground and goes to background.
 */
class AppLifecycleObserver @Inject constructor(context: Context) : LifecycleObserver {

    private val enterForegroundToast =
            Toast.makeText(context, context.getString(R.string.foreground_message), Toast.LENGTH_SHORT)

    private val enterBackgroundToast =
            Toast.makeText(context, context.getString(R.string.background_message), Toast.LENGTH_SHORT)

    /**
     * Shows foreground {@link android.widget.Toast} after attempting to cancel the background one.
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onEnterForeground() {
        enterForegroundToast.showAfterCanceling(enterBackgroundToast)
    }

    /**
     * Shows background {@link android.widget.Toast} after attempting to cancel the foreground one.
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onEnterBackground() {
        enterBackgroundToast.showAfterCanceling(enterForegroundToast)
    }

    private fun Toast.showAfterCanceling(toastToCancel: Toast) {
        toastToCancel.cancel()
        this.show()
    }
}
