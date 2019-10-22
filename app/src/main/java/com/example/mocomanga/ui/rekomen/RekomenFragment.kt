package com.example.mocomanga.ui.rekomen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

import com.example.mocomanga.R

class RekomenFragment : Fragment() {

    companion object {
        fun newInstance(): RekomenFragment {
            return RekomenFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //set title
        (activity as AppCompatActivity).supportActionBar?.title = "Rekomendasi"
        return inflater.inflate(R.layout.fragment_rekomen, container, false)
    }

}
