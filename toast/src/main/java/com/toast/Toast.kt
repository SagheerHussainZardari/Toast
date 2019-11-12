package com.toast

import android.content.Context
import android.widget.Toast

class Toast {
    fun shortToast(context: Context , message: String){
        Toast.makeText(context , message , Toast.LENGTH_SHORT).show()
    }
    fun longToast(context: Context , message: String){
        Toast.makeText(context , message , Toast.LENGTH_LONG).show()
    }
}