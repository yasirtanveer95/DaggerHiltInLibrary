package com.example.mylibrary

import android.content.Context
import android.widget.Toast
import com.example.mylibrary.LibraryApp.Companion.SampleText

fun showToast(context: Context, text: String = SampleText) {
    Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
}