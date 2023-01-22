package com.example.navigation_fragments.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigation_fragments.R
import com.example.navigation_fragments.adapter.LandAdapter
import com.example.navigation_fragments.databinding.ActivityMainBinding
import com.example.navigation_fragments.modul.Land


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root

        setContentView(view)

        replaceFragment(RecyclerViewFragment())


    }

    private fun replaceFragment(recyclerViewFragment: RecyclerViewFragment) {
        //show to fragment on the frameLayout

        val fragment=supportFragmentManager
        val fragmentTransaction=fragment.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout,RecyclerViewFragment())
        fragmentTransaction.commit()

    }


}