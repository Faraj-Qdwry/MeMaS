package com.memas.social.memas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.signup.*

/**
 * A login screen that offers login via email/password.
 */

val emailPref = "email"
val passPref = "password"

class LoginActivity : AppCompatActivity() {
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        loginButton.setOnClickListener { startActivity(Intent(this@LoginActivity,MainActivity::class.java)) }

        signupTextView.setOnClickListener { startActivity(Intent(this@LoginActivity,SignUpActivity::class.java)) }

    }
}