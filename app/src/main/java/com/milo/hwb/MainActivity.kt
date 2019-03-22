package com.milo.hwb

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.milo.loglib.XLog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        XLog.init("Milo",false)

        XLog.d(this@MainActivity,"Hello")
    }
}
