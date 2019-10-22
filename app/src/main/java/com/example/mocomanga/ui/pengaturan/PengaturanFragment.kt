package com.example.mocomanga.ui.pengaturan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

import com.example.mocomanga.R

class PengaturanFragment : Fragment() {

    companion object {
        fun newInstance(): PengaturanFragment {
            return PengaturanFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //set title
        (activity as AppCompatActivity).supportActionBar?.title = "Pengaturan"

        return inflater.inflate(R.layout.fragment_pengaturan, container, false)
    }

}
