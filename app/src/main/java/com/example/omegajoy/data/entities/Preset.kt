package com.example.omegajoy.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Preset(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    var attachedButton: String?
)