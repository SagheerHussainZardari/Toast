package com.toast

import android.util.Patterns
import java.util.regex.Pattern

class Form {

    fun isEmailValid(email: String): Boolean{
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}