package com.narro.practica2.platos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.narro.practica2.R
import kotlinx.android.synthetic.main.fragment_platos.*

class PlatosFragment: Fragment() {

    private val listPlatos = listOf(
        Platos("Pizza DMarco", "Pizzas", "S/ 25.00",
        "La mejor pizza con la combinacion perfecta de queso, espinaca y carnes del norte trujillano",
            R.drawable.imagen1),
        Platos("Duo DMarco","Bebidas","S/ 15.00",
            "La combinacion perfecta para compartir entre amigos",R.drawable.imagen2),
        Platos("Cafe","Bebidas","S/ 10.00",
            "Los mejores granos del norte peruano solo en DMarco",R.drawable.imagen3),
        Platos("Pan con Pollo", "Sanguches","S/ 15.00",
            "El tradicional pan con pollo trujillano solo en DMarco",R.drawable.imagen4),
        Platos("Ceviche", "Ceviche", "S/ 20.00",
        "Los mejores pescados e ingrediente para su paladar",R.drawable.imagen5)
    )

    companion object{
        fun newInstance(): PlatosFragment = PlatosFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_platos,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerPlatos.apply{
            layoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
            adapter = PlatosAdapter(listPlatos)
        }
    }

}