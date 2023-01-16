package com.example.cafe.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlin.random.Random

class CafeViewModel : ViewModel() {
    override fun onCleared() {
        super.onCleared()
        Log.d("Ch", "clear")
    }
    private val _cafeName  = MutableLiveData<String>()
    val cafeName : LiveData<String>
        get() = _cafeName
    private val cafeList = arrayListOf<String>("cafe1", "cafe2", "cafe3")
    fun changeCafeName() {
        _cafeName.value = cafeList.random()
        Log.d("Change Cafe_Name", "${cafeName.value}")
    }
}