package com.example.mylibrary

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class LibraryApp : Application() {

    companion object {
        var SampleText = "Its a Test"
    }

}