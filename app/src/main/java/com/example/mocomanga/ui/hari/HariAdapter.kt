package com.example.mocomanga.ui.hari

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class HariAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                SemuaFragment()
            }
            1 -> {
                SeninFragment()
            }
            2 -> {
                SelasaFragment()
            }
            3 -> {
                RabuFragment()
            }
            4 -> {
                KamisFragment()
            }
            5 -> {
                JumatFragment()
            }
            6 -> {
                SabtuFragment()
            }
            else -> {
                return MingguFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 8
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Semua"
            1 -> "Senin"
            2 -> "Selasa"
            3 -> "Rabu"
            4 -> "Kamis"
            5 -> "Jumat"
            6 -> "Sabtu"
            else -> {
                return "Minggu"
            }
        }
    }

}