package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.disco, R.drawable.disco_elysium),
            Affirmation(R.string.hollow, R.drawable.hollow_knight),
            Affirmation(R.string.dark, R.drawable.dark_souls_3),
            Affirmation(R.string.dead, R.drawable.dead_cells),
            Affirmation(R.string.divinity, R.drawable.divinity),
            Affirmation(R.string.elden, R.drawable.elden_ring),
            Affirmation(R.string.hades, R.drawable.hades),
            Affirmation(R.string.isaac, R.drawable.isaac),
            Affirmation(R.string.skyrim, R.drawable.skyrim),
            Affirmation(R.string.remnant, R.drawable.remnant)
        )
    }
}