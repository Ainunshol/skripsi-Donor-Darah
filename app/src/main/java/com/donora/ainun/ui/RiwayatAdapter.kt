package com.donora.ainun.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bagusrizki.ainun.R

class RiwayatAdapter(
    private val riwayatList: MutableList<ItemRiwayatActivity.RiwayatItem>,
    private val onDeleteClickListener: (Int) -> Unit
) : RecyclerView.Adapter<RiwayatAdapter.RiwayatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RiwayatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_riwayat, parent, false)
        return RiwayatViewHolder(view)
    }

    override fun onBindViewHolder(holder: RiwayatViewHolder, position: Int) {
        val riwayat = riwayatList[position]
        holder.bind(riwayat)

        holder.trashIcon.setOnClickListener {
            onDeleteClickListener.invoke(holder.adapterPosition)
        }
    }

    override fun getItemCount(): Int {
        return riwayatList.size
    }

    class RiwayatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val namaTempatTextView: TextView = itemView.findViewById(R.id.namaTempatTextView)
        private val alamatTextView: TextView = itemView.findViewById(R.id.alamatTextView)
        private val tanggalTextView: TextView = itemView.findViewById(R.id.tanggalTextView)
        val trashIcon: ImageView = itemView.findViewById(R.id.trash_icon)

        fun bind(riwayat: ItemRiwayatActivity.RiwayatItem) {
            namaTempatTextView.text = riwayat.namaTempat
            alamatTextView.text = riwayat.alamat
            tanggalTextView.text = riwayat.tanggal
        }
    }
}
