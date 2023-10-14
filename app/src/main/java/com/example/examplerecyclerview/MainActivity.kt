package com.example.examplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<DataMenu>
    lateinit var imageId : Array<Int>
    lateinit var namaMenu : Array<String>
    lateinit var harga      : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        imageId = arrayOf(
            R.drawable.bakso,
            R.drawable.burger,
            R.drawable.noodle,
            R.drawable.pizza,
            R.drawable.soto,
            R.drawable.salad,
            R.drawable.bakso,
            R.drawable.burger,
            R.drawable.noodle,
            R.drawable.pizza,
        )

        namaMenu = arrayOf(
            "Bakso",
            "Burger",
            "Noodle",
            "Pizza",
            "Soto",
            "Salad",
            "Bakso",
            "Burger",
            "Noodle",
            "Pizza"
        )
        harga = arrayOf(
            "Rp.20.000",
            "Rp.38.000",
            "Rp.25.000",
            "Rp.42.000",
            "Rp.25.000",
            "Rp.25.000",
            "Rp.25.000",
            "Rp.38.000",
            "Rp.25.000",
            "Rp.42.000"
        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager= LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<DataMenu>()

        getUserData()
    }
    private fun getUserData() {
        for (i in imageId.indices){
            val news = DataMenu(imageId[i],namaMenu[i],harga[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = AdapterMenu(newArrayList)
    }

}