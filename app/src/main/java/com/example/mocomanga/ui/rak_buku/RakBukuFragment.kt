package com.example.mocomanga.ui.rak_buku

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mocomanga.R

class RakBukuFragment : Fragment() {

    companion object {

        fun newInstance(): RakBukuFragment {
            return RakBukuFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //set title
        (activity as AppCompatActivity).supportActionBar?.title = "Rak Buku"
        return inflater.inflate(R.layout.fragment_rak_buku, container, false)
    }
}