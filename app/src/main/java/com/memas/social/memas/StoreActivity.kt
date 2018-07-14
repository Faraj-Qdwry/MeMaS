package com.memas.social.memas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_store.*

class StoreActivity : AppCompatActivity() {

    var check = false
    var somethingAdded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        check = intent.getBooleanExtra("check",false)
        somethingAdded = intent.getBooleanExtra("added",false)

        if (check){
            //TODO set up for ITems
            items.visibility = View.VISIBLE

            Log.d("here","good to go @@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ")

            if (somethingAdded){
                itemsgroup.visibility = View.VISIBLE
            }else
                itemsgroup.visibility = View.GONE

            addButon.setOnClickListener {
                startActivity(
                Intent(this@StoreActivity,ScannerActivity::class.java)
                    .putExtra("type",2)) }

            setUpCheckout()
        }else{
            checkInGroup.visibility = View.VISIBLE
            checkInStore.setOnClickListener{
                startActivity(
                        Intent(this@StoreActivity,ScannerActivity::class.java)
                                .putExtra("type",1)
                )
            }
        }



    }

    private fun setUpCheckout() {
        checkoutBt.setOnClickListener {
            startActivity(Intent(this@StoreActivity,PaymetAvtivity::class.java))
        }
    }
}
