package com.vaibhavmojidra.puredependencyinjectionusingfieldkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val serviceProvider=ServiceProvider()
        val simCard=SimCard()
        simCard.serviceProvider=serviceProvider //Injecting Dependency via field
        val memoryCard=MemoryCard()
        val battery=Battery()
        val smartPhone=SmartPhone()
        smartPhone.battery=battery
        smartPhone.simCard=simCard
        smartPhone.memoryCard=memoryCard
        smartPhone.startCallRecording()
    }
}