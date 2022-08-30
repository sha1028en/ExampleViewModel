package com.sha1028en.exampleviewmodel.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import java.lang.Exception

class MainViewModel : ViewModel() {
    private var cnt = 0

    fun getCnt() = this.cnt
    fun addCnt() = ++this.cnt
    fun setCnt( cnt: Int) { this.cnt = cnt }


    // cnt 자릿수 계산식
    fun getCarry(): Int {
        var carry = 0
        try { carry = this.cnt.toString().length -1

        } catch ( e: Exception ) { Log.e("SHA1028EN", "$e")
        } finally { return carry +1 }
    }
}