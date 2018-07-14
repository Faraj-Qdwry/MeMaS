package com.memas.social.memas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_newpay.*

class newpay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newpay)

        createPay.setOnClickListener {
            startActivity(Intent(this@newpay,PaymetAvtivity::class.java))

        }
    }
}
