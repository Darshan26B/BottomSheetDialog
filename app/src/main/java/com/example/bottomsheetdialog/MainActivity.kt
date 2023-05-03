package com.example.bottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnClick:Button =findViewById(R.id.btnClick)

        btnClick.setOnClickListener {
            var view:View = layoutInflater.inflate(R.layout.bottom_sheet_dialog,null)
            var dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()
        }


    }
}