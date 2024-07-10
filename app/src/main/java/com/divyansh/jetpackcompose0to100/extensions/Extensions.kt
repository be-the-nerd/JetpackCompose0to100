package com.divyansh.jetpackcompose0to100.extensions

import android.content.Context
import android.widget.Toast


fun showToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}