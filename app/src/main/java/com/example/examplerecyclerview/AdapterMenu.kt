package com.example.examplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class AdapterMenu (private val menuList : ArrayList<DataMenu>) : RecyclerView.Adapter<AdapterMenu.ViewHolder>(){

    class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView) {
        val image : ShapeableImageView = itemView.findViewById(R.id.iv_menu)
        val nama_Menu : TextView = itemView.findViewById(R.id.tvNamaMenu)
        val harga : TextView = itemView.findViewById(R.id.tvHarga)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMenu.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent,false)
        return  ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val currentItem = menuList[position]
        holder.image.setImageResource(currentItem.imageMenu)
        holder.nama_Menu.text =currentItem.namaMenu
        holder.harga.text =currentItem.hargaMenu
    }

    override fun getItemCount(): Int {
       return menuList.size
    }
}