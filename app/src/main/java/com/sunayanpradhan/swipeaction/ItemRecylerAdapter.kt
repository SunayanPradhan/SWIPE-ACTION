package com.sunayanpradhan.swipeaction

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemRecyclerAdapter(private val list: List<String>,
                          private val context: Context):RecyclerView.Adapter<ItemRecyclerAdapter.VIewHolder>() {
    class VIewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val itemText:TextView=itemView.findViewById(R.id.item_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VIewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return VIewHolder(view)
    }

    override fun onBindViewHolder(holder: VIewHolder, position: Int) {

        val currentItem=list[position]

        holder.itemText.text=currentItem


    }

    override fun getItemCount(): Int {
        return list.size
    }


}