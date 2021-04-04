package com.example.samplebroadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    //
    private lateinit var receiver: AirplaneBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        receiver = AirplaneBroadcastReceiver()

        //
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(receiver, it)
        }

        //  for API 26 Bellow must declare in manifest
//        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
//            registerReceiver(AirplaneBroadcastReceiver(), it)
//        }
    }

    override fun onStop()
    {
        super.onStop()

        unregisterReceiver(receiver)
    }
}