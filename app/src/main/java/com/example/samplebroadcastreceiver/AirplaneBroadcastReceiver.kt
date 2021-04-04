package com.example.samplebroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneBroadcastReceiver : BroadcastReceiver()
{
    override fun onReceive(context: Context, intent: Intent)
    {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        val airPlaneModeEnabled = intent.getBooleanExtra("state", false)

        if (airPlaneModeEnabled)
        {
            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_SHORT).show()
        }

        else
        {
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_SHORT).show()
        }
    }
}