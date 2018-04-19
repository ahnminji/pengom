package com.married.got.just.we.ingom.penji.pengom.main

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.married.got.just.we.ingom.penji.pengom.R

open class AnniversaryAdapter(val items: ArrayList<Anniversary>, val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_anniversary, parent, false);
        return AnniversaryViewHolder(view)
    }

    class AnniversaryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind() {

        }

    }
}