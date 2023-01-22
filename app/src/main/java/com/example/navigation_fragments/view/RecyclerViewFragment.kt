package com.example.navigation_fragments.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.navigation_fragments.R
import com.example.navigation_fragments.adapter.LandAdapter

import com.example.navigation_fragments.modul.Land
import kotlinx.android.synthetic.main.fragment_details.*


class RecyclerViewFragment : Fragment() {

    private lateinit var rArrayList: ArrayList<Land>
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=view.findViewById(R.id.recyclerView) //Initialize
        rArrayList=ArrayList() //Initialize

        arrayInitialize()
        recyclerView.layoutManager=LinearLayoutManager(context)
        val adapter=LandAdapter(rArrayList)
        recyclerView.adapter=adapter




    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view,container,false)


    }

    fun arrayInitialize(){

        val eiffel=Land(R.drawable.eiffel,"Eiffel","France")
        val galata=Land(R.drawable.galata,"Galata Tower","Turkey")
        val pisa=Land(R.drawable.pisa,"Pisa Tower","Italy")
        val ulu=Land(R.drawable.ulu,"Ulu mosque","Turkey")

        rArrayList.add(eiffel)
        rArrayList.add(galata)
        rArrayList.add(pisa)
        rArrayList.add(ulu)
    }


}