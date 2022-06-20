package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.gameCardModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize data
        val myDataset = mutableListOf<gameCardModel>(
            gameCardModel(R.string.disco, R.drawable.disco_elysium),
            gameCardModel(R.string.hollow, R.drawable.hollow_knight),
            gameCardModel(R.string.dark, R.drawable.dark_souls_3),
            gameCardModel(R.string.dead, R.drawable.dead_cells),
            gameCardModel(R.string.divinity, R.drawable.divinity),
            gameCardModel(R.string.elden, R.drawable.elden_ring),
            gameCardModel(R.string.hades, R.drawable.hades),
            gameCardModel(R.string.isaac, R.drawable.isaac),
            gameCardModel(R.string.skyrim, R.drawable.skyrim),
            gameCardModel(R.string.remnant, R.drawable.remnant)
        )

        //set adapter of recyclerView to a new custom ItemAdapter
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        /*
        * this is to improve performance, use if changes in content do not change the layout size
        * of the RecyclerView
        */
        recyclerView.setHasFixedSize(true)
    }
}