package com.example.mocomanga.ui.hari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mocomanga.R

class SemuaFragment : Fragment() {

    companion object {

        fun newInstance(): SemuaFragment {
            return SemuaFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hari_semua, container, false)
    }
}