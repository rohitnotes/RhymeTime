package com.bonnetrouge.rhymetime.ext

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.newFixedThreadPoolContext

/**
 * CommonPool determines its thread pool size by using:
 *   Runtime.getRuntime().availableProcessors() - 1
 * It will then default to at least 1. We default to at least 2
 *   since using only 1 can be problematic
 *
 * The following can be used as such: `launch(bgPool) { /* Some very cool fancy async code */ }`
 */
val bgPool: CoroutineDispatcher by lazy {
    val numProcessors = Runtime.getRuntime().availableProcessors()
    when {
        numProcessors <= 2 -> newFixedThreadPoolContext(2, "background")
        else -> Dispatchers.Default
    }
}

inline fun <T> List<T>.letNonEmpty(action: (List<T>) -> Unit) {
    if (this.isNotEmpty()) action(this)
}
