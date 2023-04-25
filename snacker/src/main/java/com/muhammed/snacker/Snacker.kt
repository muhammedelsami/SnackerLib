package com.muhammed.snacker

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.muhammed.snacker.databinding.LayoutAlertSuccessBinding

class Snacker {
    companion object {
        fun showDefaultToast(context: Context) {
            println("this is a default toast")
            Toast.makeText(context, "ddddd", Toast.LENGTH_SHORT).show()
        }

        fun newSnackBar(view: View, msg:String, length:Int, type:Int) : Snackbar{
            val snackBar = Snackbar.make(view, "", length)
            snackBar.view.setBackgroundColor(Color.TRANSPARENT)
            val snackBarLayout = snackBar.view as Snackbar.SnackbarLayout
            snackBarLayout.setPadding(0,0,0,0)

            val binding = LayoutAlertSuccessBinding.inflate(LayoutInflater.from(view.context))
            binding.messageView.text = msg
            binding.closeBtn.setOnClickListener {
                snackBar.dismiss()
            }
            snackBarLayout.addView(binding.root)
            return snackBar
        }
    }
}