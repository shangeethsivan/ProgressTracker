package com.shrappz.progresstracker

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_show_image.*

class ShowImageActivity : AppCompatActivity(R.layout.activity_show_image) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val imageUri = intent.getParcelableExtra<Uri>("image_uri")
        captured_img.setImageURI(imageUri)
    }
}