package com.vaibhavmojidra.puredependencyinjectionusingfieldkotlin

class SimCard {
    public lateinit var serviceProvider:ServiceProvider

    fun getConnected(){
        serviceProvider.getServiceProvider()
    }
}
