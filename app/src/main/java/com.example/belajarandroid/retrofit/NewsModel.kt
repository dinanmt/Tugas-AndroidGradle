package com.example.belajarandroid.retrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NewsModel : ViewModel() {

    fun getTopHeadLines() {
        viewModelScope.launch {
            val response = NewsApi.retrofitService.getTopHeadLines()
            Log.d("response", response)

        }
    }
}