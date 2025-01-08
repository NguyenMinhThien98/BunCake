package com.example.buncake.ui.views.LearningFragmentActivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.buncake.R

class SettingItemAdapter(
    private val itemList: MutableList<SettingItem>,
    private val onItemClickListener: OnItemClickListener // Listener để xử lý click item

) : RecyclerView.Adapter<SettingItemAdapter.ItemViewHolder>() {

    interface OnItemClickListener {
        fun onItemClick(position: Int, item: SettingItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.setting_item_layout, parent, false)
        return ItemViewHolder(view)
    }

    // ViewHolder giúp tái sử dụng các view
    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.textViewSettingItem)
        val imageViewLeft: ImageView = itemView.findViewById(R.id.imageViewItemLeft)
        val imageViewRight: ImageView = itemView.findViewById(R.id.imageViewItemRight)
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val item = itemList[position]
                    onItemClickListener.onItemClick(position, item) // Gọi listener khi nhấp vào item
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.textView.text = item.title
        holder.imageViewLeft.setImageResource(item.leftIcon)
        holder.imageViewRight.setImageResource(item.rightIcon)
    }
}