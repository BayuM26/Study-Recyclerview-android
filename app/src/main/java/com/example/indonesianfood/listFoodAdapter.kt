package com.example.indonesianfood

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listFoodAdapter(private val listfood: ArrayList<food>): RecyclerView.Adapter<listFoodAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_food, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val Lfood = listfood[position]

//        list food
        Glide.with(holder.itemView.context)
            .load(Lfood.imge_food)
            .apply(RequestOptions().override(55,55))
            .into(holder.Fimg)

        holder.Fname.text = Lfood.food_name
        holder.Fingredient.text = Lfood.daerah_asal
//        end list food

       holder.itemView.setOnClickListener {
           Toast.makeText(holder.itemView.context,listfood[position].food_name, Toast.LENGTH_SHORT).show()
       }

//        detail food gizi
        val fcontext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val Detailfood = Intent(fcontext, detailgizifoodActivity::class.java)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_fimg, Lfood.imge_food)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_name, Lfood.food_name)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_daerah, Lfood.daerah_asal)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_energi, Lfood.FGenergi)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_protein, Lfood.FGprotein)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_besi, Lfood.FGbesi)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_lemak, Lfood.FGlemak)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_serat, Lfood.FGlemak)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_kalsium, Lfood.FGkalsium)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_vit_c, Lfood.FGvit_c)
            Detailfood.putExtra(detailgizifoodActivity.EXTRA_deskrip, Lfood.bahandasar)
            fcontext.startActivity(Detailfood)
        }
//        end detail food gizi

    }

    override fun getItemCount(): Int {
        return listfood.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Fname : TextView = itemView.findViewById(R.id.name_food)
        var Fingredient : TextView = itemView.findViewById(R.id.daerah_asal)
        var Fimg : ImageView = itemView.findViewById(R.id.image_item_photo)


    }
}

