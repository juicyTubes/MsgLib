package com.example.mylibrary

import android.content.Context
import android.widget.Toast

object MsgUtils {
    fun showToast(context: Context, content: String) {
        Toast.makeText(context, content, Toast.LENGTH_LONG).show()
    }
}