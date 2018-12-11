package com.example.arkaim.endterm

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.contact_detail.view.*
import kotlinx.android.synthetic.main.contact_group_item.view.*


class ContactGroupAdapter (var context: Context, var dataset: ArrayList<ContactGroup>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return ContactsGroupViewHolder(LayoutInflater.from(context).inflate(R.layout.contact_group_item,p0, false ))
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        var contactGroup = dataset[p1]

        p0.itemView.contact_group_name.text = contactGroup.name
    }
    inner  class  ContactsGroupViewHolder(view: View): RecyclerView.ViewHolder(view)
}