package com.example.diotodofinal.extensions

import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.util.*

private val locale = Locale("en", "US")

fun Date.format() : String {
    return SimpleDateFormat("dd/MM/yyyy", locale).format(this)
}

var TextInputLayout.text : String?
get() = editText?.text?.toString() ?: ""
set(value) {
    editText?.setText(value)
}