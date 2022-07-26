package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class ShowSnakebar(var mainText: String) {
    fun showSnakebar(context: Context, text: String = "Hilt DI") {
        Toast.makeText(context, mainText, Toast.LENGTH_SHORT).show()
    }
}