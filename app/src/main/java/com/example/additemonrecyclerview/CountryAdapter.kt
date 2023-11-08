package com.example.additemonrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CountryAdapter(val list: List<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){

    class CountryViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {

        var title = itemView.findViewById<TextView>(R.id.countryText)
        var Check = itemView.findViewById<CheckBox>(R.id.check)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.layout_items,parent,false)
        return CountryViewHolder(view)
    }
    override fun getItemCount(): Int {
            return list.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
             var myList = list[position]
        holder.title.text = myList.title

        holder.Check.isChecked = myList.isCheck
    }

}