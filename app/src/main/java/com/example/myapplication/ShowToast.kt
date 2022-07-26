package com.example.myapplication

import android.content.Context
import android.widget.Toast

class ShowToast {
    fun showToast(context: Context, text: String = "Hilt DI Toast") {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}