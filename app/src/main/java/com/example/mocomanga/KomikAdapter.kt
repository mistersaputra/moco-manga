package com.example.mocomanga

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_komik.view.*

class KomikAdapter : BaseAdapter {
    var komikList = ArrayList<Komik>()
    var context: Context? = null

    constructor(context: Context, komikList: ArrayList<Komik>) : super() {
        this.context = context
        this.komikList = komikList
    }

    override fun getCount(): Int {
        return komikList.size
    }

    override fun getItem(position: Int): Any {
        return komikList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val komik = this.komikList[position]

        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var komikView = inflator.inflate(R.layout.item_komik, null)
        komikView.itemKomikImg.setImageResource(komik.image)
        komikView.itemKomikTgl.text = komik.tanggal
        komikView.itemKomikJudul.text = komik.judul

        komikView.itemKomikImg.setOnClickListener {

            val intent = Intent(context, KomikDetailActivity::class.java)
            intent.putExtra("id", komik.id!!)
            intent.putExtra("image", komik.image!!)
            intent.putExtra("judul", komik.judul!!)
            context!!.startActivity(intent)
        }
        return komikView
    }
}