package com.example.additemonrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.additemonrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        var list = mutableListOf<Country>(
            Country("Bangladesh",false),
            Country("India",false),
            Country("Pakistan",false),
            Country("Bhutan",false),
            Country("Maldip",false)
      )
        var adapter = CountryAdapter(list)
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = adapter
        binding.btn.setOnClickListener{
            var editText =  binding.inputEdit.text.toString()
            var listItem = Country(editText,false)
            list.add(listItem)

           adapter.notifyItemInserted(list.size-1)
        }
    }

}