package com.example.mocomanga.ui.hari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mocomanga.R

class JumatFragment : Fragment() {

    companion object {

        fun newInstance(): JumatFragment {
            return JumatFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_hari_jumat, container, false)
        val textView: TextView = view.findViewById(R.id.textHariJumat)
        textView.text = "hari jumat"
        return view
    }

}