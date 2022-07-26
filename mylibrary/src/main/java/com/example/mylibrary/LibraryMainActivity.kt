package com.example.mylibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.di.ApiModule
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LibraryMainActivity : AppCompatActivity() {
    @Inject
    @ApiModule.LibraryShowSnakebar
    lateinit var snakebar: ShowSnakebar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.libraryactivity_main)
        snakebar.showSnakebar(this, "Its Hilt Library")
    }
}