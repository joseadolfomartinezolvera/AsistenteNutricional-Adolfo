package com.eivier.asistentenutricional

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eivier.asistentenutricional.modelos.ModeloReceta
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_view.view.*

class AdaptadorRecyclerView(
    var recetas: ArrayList<ModeloReceta>,
    var clickListener: ClickListener
) :
    RecyclerView.Adapter<AdaptadorRecyclerView.ViewHolder>() {

    lateinit var viewHolder: ViewHolder

    init {
        this.recetas = recetas
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view, parent, false)
        viewHolder = ViewHolder(vista, clickListener)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return this.recetas.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val receta = recetas.get(position)
        holder.nombre.text = receta.nombre
        holder.tiempo.text = receta.tiempo
        Picasso.get().load(receta.imagen).into(holder.imagen)
        //holder.imagen.setImageResource(convinacion.imagen)
    }

    class ViewHolder(vista: View, listener: ClickListener) : RecyclerView.ViewHolder(vista),
        View.OnClickListener {

        var vista = vista
        var nombre: TextView
        var tiempo: TextView
        var imagen: ImageView
        var listener: ClickListener

        init {
            nombre = vista.NombreReceta
            tiempo = vista.Duracion
            imagen = vista.imgReceta
            this.listener = listener
            vista.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            this.listener.onClick(view!!, adapterPosition)
        }
    }
}