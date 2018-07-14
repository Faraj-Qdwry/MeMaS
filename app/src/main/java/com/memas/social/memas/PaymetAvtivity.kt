package com.memas.social.memas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paymet_avtivity.*

class PaymetAvtivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymet_avtivity)

        supportActionBar?.title = "Payment"

        maybanklog.setOnClickListener { startActivity(Intent(this@PaymetAvtivity,confirmpay::class.java)) }

        newlog.setOnClickListener { startActivity(Intent(this@PaymetAvtivity,newpay::class.java)) }

    }
}
