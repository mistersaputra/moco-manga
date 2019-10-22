package com.example.mocomanga

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

import com.example.mocomanga.ui.beranda.BerandaFragment
import com.example.mocomanga.ui.cari.CariFragment
import com.example.mocomanga.ui.pengaturan.PengaturanFragment
import com.example.mocomanga.ui.rak_buku.RakBukuFragment
import com.example.mocomanga.ui.rekomen.RekomenFragment

class MainActivity : AppCompatActivity() {

    // navigation listener
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_beranda -> {
                addFragment(BerandaFragment(), "beranda")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_rak_buku -> {
                addFragment(RakBukuFragment(), "rak_buku")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_cari-> {
                addFragment(CariFragment(), "cari")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_rekomen -> {
                addFragment(RekomenFragment(), "rekomen")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_pengaturan -> {
                addFragment(PengaturanFragment(), "pengaturan")
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    // to change fragment
    private fun addFragment(fragment: Fragment, name: String) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content_host, fragment, name)
            .commit()
    }

    // initial function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //select listener for button navigation
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        //initial fragment
        addFragment(BerandaFragment(), "beranda")
    }

    // execute when user press back device
    override fun onBackPressed() {
        // get current active fragment
        val currentFragment = supportFragmentManager.findFragmentById(R.id.content_host)?.getTag().toString()

        // if user on fragment beranda then exit app, otherwise navigate to beranda
        if (currentFragment == "beranda") {
            super.onBackPressed()
        } else {
            addFragment(BerandaFragment(), "beranda")

            val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
            bottomNavigation.getMenu().getItem(0).setChecked(true)
        }
    }
}
