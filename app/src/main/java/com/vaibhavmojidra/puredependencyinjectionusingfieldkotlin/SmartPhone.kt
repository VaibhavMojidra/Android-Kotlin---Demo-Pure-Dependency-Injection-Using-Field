package com.vaibhavmojidra.puredependencyinjectionusingfieldkotlin

import android.util.Log

class SmartPhone {
    public lateinit var battery:Battery
    public lateinit var memoryCard:MemoryCard
    public lateinit var simCard:SimCard

    fun startCallRecording(){
        battery.getPower()
        simCard.getConnected()
        memoryCard.getSpaceAvailability()
        Log.i("MyInfo","Recording Call....")
    }
}