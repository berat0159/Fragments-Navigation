package com.example.navigation_fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.navigation_fragments.databinding.LandRowBinding
import com.example.navigation_fragments.modul.Land
import com.example.navigation_fragments.view.RecyclerViewFragment
import com.example.navigation_fragments.view.RecyclerViewFragmentDirections

class LandAdapter(var arrayList: ArrayList<Land>): RecyclerView.Adapter<LandAdapter.LandHolder>() {

    class LandHolder(var landRowBinding: LandRowBinding) : RecyclerView.ViewHolder(landRowBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandHolder {
        val landRowBinding=LandRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandHolder(landRowBinding)
    }

    override fun onBindViewHolder(holder: LandHolder, position: Int) {
        holder.landRowBinding.textRow.text=arrayList.get(position).name
        val name=arrayList.get(position).name
        val country=arrayList.get(position).country
        val image=arrayList.get(position).image

        holder.itemView.setOnClickListener(View.OnClickListener {



            val action=RecyclerViewFragmentDirections.actionRecyclerViewFragmentToDetailsFragment(image, name, country)


            Navigation.findNavController(it).navigate(action)
        })
    }

    override fun getItemCount(): Int {


        return arrayList.size


    }
}