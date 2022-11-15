package com.sample.androinfotech.patientapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sample.androinfotech.patientapp.Models.HeaderCardModel
import com.sample.androinfotech.patientapp.R

class HeaderCardAdapter(titlesArrayList: ArrayList<HeaderCardModel>) :
    RecyclerView.Adapter<HeaderCardAdapter.ViewHolder>() {

    private val courseModelArrayList: ArrayList<HeaderCardModel> = titlesArrayList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // to inflate the layout for each item of recycler view.
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.header_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // to set data to textview and imageview of each card layout
        val model: HeaderCardModel = courseModelArrayList[position]
        holder.headerTitle.text = model.getTitle()
        holder.headerImage.setImageResource(model.getImage())
    }

    override fun getItemCount(): Int {
        // this method is used for showing number of card items in recycler view.
        return courseModelArrayList.size
    }

    // View holder class for initializing of your views such as TextView and Imageview.
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val headerImage: ImageView = itemView.findViewById(R.id.header_image)
        val headerTitle: TextView = itemView.findViewById(R.id.header_title)

    }

}
