package com.example.mocomanga.ui.beranda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.mocomanga.R
import com.example.mocomanga.ui.hari.HariAdapter
import com.google.android.material.tabs.TabLayout



class BerandaFragment : Fragment() {

    private lateinit var viewPagerHari: ViewPager
    private lateinit var tabsHari: TabLayout

    companion object {
        fun newInstance(): BerandaFragment {
            return BerandaFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //set title
        (activity as AppCompatActivity).supportActionBar?.title = "Beranda"

        val view: View = inflater.inflate(R.layout.fragment_beranda, container, false)
        tabsHari = view.findViewById(R.id.tabs_hari)
        viewPagerHari = view.findViewById(R.id.viewpager_hari)

        val hariAdapter = HariAdapter(childFragmentManager)
        viewPagerHari.adapter = hariAdapter
        tabsHari.setupWithViewPager(viewPagerHari)

        return view
    }
}