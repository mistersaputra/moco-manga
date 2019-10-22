package com.example.mocomanga.ui.cari

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mocomanga.R

class CariFragment : Fragment() {

    companion object {
        fun newInstance(): CariFragment {
            return CariFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //set title
        (activity as AppCompatActivity).supportActionBar?.title = "Cari"
        return inflater.inflate(R.layout.fragment_cari, container, false)
    }
}