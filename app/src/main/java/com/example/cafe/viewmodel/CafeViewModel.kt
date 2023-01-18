package com.example.cafe.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.cafe.data.Cafe

class CafeViewModel : ViewModel() {
    override fun onCleared() {
        super.onCleared()
        Log.d("Ch", "clear")
    }
    private val _cafeList  = arrayListOf<Cafe>(Cafe("22"), Cafe("33"))
    val cafeList : ArrayList<Cafe>
        get() = _cafeList

}