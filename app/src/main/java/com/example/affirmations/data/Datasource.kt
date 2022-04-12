package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.motto1),
            Affirmation(R.string.motto2),
            Affirmation(R.string.motto3),
            Affirmation(R.string.motto4),
            Affirmation(R.string.motto5),
            Affirmation(R.string.motto6),
            Affirmation(R.string.motto7),
            Affirmation(R.string.motto8),
            Affirmation(R.string.motto9),
            Affirmation(R.string.motto10)
        )
    }
}