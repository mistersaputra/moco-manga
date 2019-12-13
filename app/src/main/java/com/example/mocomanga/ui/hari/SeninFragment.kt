package com.example.mocomanga.ui.hari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.example.mocomanga.Komik
import com.example.mocomanga.KomikAdapter
import com.example.mocomanga.R

class SeninFragment : Fragment() {

    var adapter: KomikAdapter? = null
    var komikList = ArrayList<Komik>()

    companion object {
        fun newInstance(): SeninFragment {
            return SeninFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        komikList.add(Komik(1, R.drawable.komik_2, "Shingeki No Kyoujin", "12-12-2011"))
        komikList.add(Komik(2, R.drawable.komik_4, "Weathering with you", "12-12-2011"))
        komikList.add(Komik(3, R.drawable.komik_1, "One Piece", "12-12-2011"))
        komikList.add(Komik(4, R.drawable.komik_3, "Naruto", "12-12-2011"))
        komikList.add(Komik(5, R.drawable.komik_2, "Shingeki No Kyoujin", "12-12-2011"))
        komikList.add(Komik(6, R.drawable.komik_4, "Nanatsu No Taizei", "12-12-2011"))
        komikList.add(Komik(7, R.drawable.komik_1, "No Game No Life", "12-12-2011"))
        komikList.add(Komik(8, R.drawable.komik_2, "Boku No Hero Akademia", "12-12-2011"))
        komikList.add(Komik(9, R.drawable.komik_3, "Naruto", "12-12-2011"))

        val view = inflater.inflate(R.layout.fragment_hari_senin, container, false)
        val daftarKomik: GridView = view.findViewById(R.id.daftarKomik)

        adapter = KomikAdapter(getActivity()!!.getApplicationContext(), komikList)
        daftarKomik.adapter = adapter
        return view
    }
}