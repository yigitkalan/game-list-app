package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

//Item adapter class is an adapter which holds ItemViewHolder as viewholder type
class ItemAdapter(private val context : Context,
                  private val dataList : List<Affirmation>,
                  ): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){


    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

     /*
     * a method to create new viewHolder when we can't reuse existing ones
     * parent being the view that we're putting new viewHolder into in this case RecyclerView*
     * create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    /**
     * update an existing ViewHolder created by onCreateViewHolder and views in it
     * replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataList[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.ImageResourceId)
    }

    //return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int {
        return dataList.size
    }
}