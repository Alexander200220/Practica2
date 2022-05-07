package com.narro.practica2.platos

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.narro.practica2.R

class PlatosViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(
    R.layout.item_platos, parent, false)) {

    private var imgplato: ImageView? = null
    private var plato_text1: TextView? = null
    private var plato_text2: TextView? = null
    private var plato_text3: TextView? = null
    private var plato_text4: TextView? = null

    init {
        imgplato = itemView.findViewById(R.id.imgplato)
        plato_text1 = itemView.findViewById(R.id.plato_text1)
        plato_text2 = itemView.findViewById(R.id.plato_text2)
        plato_text3 = itemView.findViewById(R.id.plato_text3)
        plato_text4 = itemView.findViewById(R.id.plato_text4)
    }
    fun bind(platos: Platos) {
        plato_text1?.text = platos.tittle
        plato_text2?.text = platos.description1
        plato_text3?.text = platos.description2
        plato_text4?.text = platos.description3
        imgplato?.setImageResource(platos.image)
    }

}