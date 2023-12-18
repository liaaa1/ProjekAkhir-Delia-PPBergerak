package com.example.projekakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SayurAdapter (val dataSayur: List<DataItem?>?) : RecyclerView.Adapter<SayurAdapter.MyViewHolder>(){
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val judul = view.findViewById<TextView>(R.id.judul)
        val deskripsi = view.findViewById<TextView>(R.id.deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_mainv, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        if (dataSayur != null){
            return dataSayur.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.judul.text = dataSayur?.get(position)?.nama
        holder.deskripsi.text = dataSayur?.get(position)?.deskripsi

        /*holder.itemView.setOnClickListener{
            val nama = dataSayur?.get(position)?.nama
            Toast.makeText(holder.itemView.context, "${nama}", Toast.LENGTH_SHORT).show()
            }*/
    }

}