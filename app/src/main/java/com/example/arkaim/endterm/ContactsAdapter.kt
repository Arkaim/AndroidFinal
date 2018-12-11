package com.example.arkaim.endterm

import android.content.Context
import android.service.autofill.Dataset
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.arkaim.endterm.R
import kotlinx.android.synthetic.main.contact_detail.view.*

class ContactsAdapter (var context: Context, var dataset: ArrayList<Contact>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return ContactsViewHolder(LayoutInflater.from(context).inflate(R.layout.contact_detail,p0, false ))
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        var contact = dataset[p1]

        p0.itemView.name.text = contact.name
        p0.itemView.group_name.text = contact.contactGroup
    }
    inner  class  ContactsViewHolder(view: View): RecyclerView.ViewHolder(view)
}