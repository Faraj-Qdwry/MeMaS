package com.memas.social.memas

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.zxing.Result
import kotlinx.android.synthetic.main.activity_main.*
import me.dm7.barcodescanner.zxing.ZXingScannerView


class MainActivity : AppCompatActivity(), ZXingScannerView.ResultHandler {

    lateinit var scanner: ZXingScannerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scanner = ZXingScannerView(this)
        scanner.setResultHandler(this)
        setContentView(R.layout.activity_main)
        scanButton.setOnClickListener{
            scanner.startCamera()
        }

    }

    override fun handleResult(result: Result?) {
        scanner.stopCamera()
        Toast.makeText(this, result?.text, Toast.LENGTH_SHORT).show()
    }
//
//    override fun onResume() {
//        super.onResume()
//        mScannerView.startCamera()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        mScannerView.stopCamera()
//    }

}
