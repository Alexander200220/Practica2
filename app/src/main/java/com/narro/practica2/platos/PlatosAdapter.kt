package com.narro.practica2.platos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlatosAdapter(val list: List<Platos>):RecyclerView.Adapter<PlatosViewHolder>() {

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlatosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PlatosViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PlatosViewHolder, position: Int) {
        val platos = list[position]
        holder.bind(platos)
    }

}