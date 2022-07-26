package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.App.Companion.SampleText
import com.example.mylibrary.LibraryMainActivity
import com.example.mylibrary.ShowSnakebar
import com.example.mylibrary.showToast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class ApplicationMainActivity : AppCompatActivity() {
    @Inject
    lateinit var showToast: ShowToast

    @Inject
//    @ApiModule.AppShowSnakebar
    lateinit var snakebar: ShowSnakebar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        snakebar.showSnakebar(this, "Its Snakebar")
        showToast(this)
        showToast(this, SampleText)
        tvHelo.setOnClickListener {
            startActivity(Intent(this, LibraryMainActivity::class.java))
        }
        showToast.showToast(this, "Its Hilt App")
    }
}