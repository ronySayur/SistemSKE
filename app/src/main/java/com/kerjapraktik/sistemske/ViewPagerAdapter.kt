package com.kerjapraktik.sistemske

import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

/**
 * Dibuat oleh RizkyPratama pada 5/16/2021.
 */
class ViewPagerAdapter (
    val activity: List<Int>
    ):RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

        inner class ViewPagerViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(com.kerjapraktik.sistemske.R.layout.activity06_pembayaran_operator, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return activity.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}