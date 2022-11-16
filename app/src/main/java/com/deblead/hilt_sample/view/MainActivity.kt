package com.deblead.hilt_sample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.deblead.hilt_sample.R
import com.deblead.hilt_sample.common.NormalToastClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class MainActivity : AppCompatActivity() {


    @Inject
    protected lateinit var normalToastClass: NormalToastClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.mBtnToast).setOnClickListener { normalToastClass.printToast("Sample Text") }
    }
}