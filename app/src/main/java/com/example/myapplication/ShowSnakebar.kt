package com.example.myapplication

import android.content.Context
import android.widget.Toast

class ShowSnakebar {
    fun showSnakebar(context: Context, text: String = "Hilt DI") {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}