package com.deblead.hilt_sample.common

import android.content.Context
import android.widget.Toast

class NormalToastClass(private val context: Context) {
    fun printToast(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}