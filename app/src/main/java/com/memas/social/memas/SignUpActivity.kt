package com.memas.social.memas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.signup.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signupButton.setOnClickListener {
            startActivity(Intent(this@SignUpActivity,
                    StoreActivity::class.java).putExtra("check",false)) }

        loginTextView.setOnClickListener { startActivity(Intent(this@SignUpActivity,LoginActivity::class.java)) }

    }
}
