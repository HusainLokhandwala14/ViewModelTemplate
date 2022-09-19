package com.example.viewmodeltemplate

import androidx.lifecycle.ViewModel

class MainActivityViewModel(val startInt : Int) : ViewModel() {
    var number = startInt
    fun addone() {
        number++
    }

}