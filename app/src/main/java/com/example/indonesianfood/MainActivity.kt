package com.example.indonesianfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvfood: RecyclerView
    private var list: ArrayList<food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvfood = findViewById(R.id.rv_food)
        rvfood.setHasFixedSize(true)

        list.addAll(Food_data.listfood)
        showRecyclerList()

    }


    private fun showRecyclerList() {
        rvfood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = listFoodAdapter(list)
        rvfood.adapter = listFoodAdapter
    }

    //    menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        this.setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {

            R.id.about -> {
                val move = Intent(this@MainActivity, About::class.java)
                startActivity(move)
            }

            R.id.share ->{
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/*"
                intent.putExtra("Bagikan ini","www.dicoding.com")

                val chooser = Intent.createChooser(intent, "Membagikan dengan...")
                startActivity(chooser)
            }
        }
    }
//    end menu

}
