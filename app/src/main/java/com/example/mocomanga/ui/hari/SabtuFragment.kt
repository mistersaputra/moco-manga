package com.example.mocomanga.ui.hari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mocomanga.R

class SabtuFragment : Fragment() {

    companion object {

        fun newInstance(): SabtuFragment {
            return SabtuFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hari_sabtu, container, false)
    }
}