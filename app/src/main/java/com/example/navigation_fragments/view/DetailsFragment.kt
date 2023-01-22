package com.example.navigation_fragments.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation_fragments.R
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val name=DetailsFragmentArgs.fromBundle(it).name
            val country=DetailsFragmentArgs.fromBundle(it).country
            val image=DetailsFragmentArgs.fromBundle(it).image

            landImage.setImageResource(image)
            landNameTxt.text=name
            countryNameTxt.text=country

        }

    }
}