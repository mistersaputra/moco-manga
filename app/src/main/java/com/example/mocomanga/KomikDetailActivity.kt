package com.example.mocomanga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_komik_detail.*
import kotlinx.android.synthetic.main.content_komik_detail.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class KomikDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_komik_detail)
        setSupportActionBar(toolbar)

        val data = intent.extras
        detailKomikImg.setImageResource(data!!.getInt("image"))
        detailKomikJudul.text = data!!.getString("judul")

        //set title
        getSupportActionBar()?.setTitle("Detail Komik")

        //set back button
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
        getSupportActionBar()?.setDisplayShowHomeEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
