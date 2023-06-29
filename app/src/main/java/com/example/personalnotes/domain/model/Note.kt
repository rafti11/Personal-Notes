package com.example.personalnotes.domain.model

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    val title: String,
    val message: String,
    val color: Int,
    val timestamp: Long,
    @PrimaryKey
    val id: Int? = null
) {
    companion object {
        val colors = listOf(Color.CYAN, Color.GREEN, Color.BLUE)
    }
}