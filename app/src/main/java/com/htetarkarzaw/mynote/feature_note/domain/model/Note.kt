package com.htetarkarzaw.mynote.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.htetarkarzaw.mynote.ui.theme.BabyBlue
import com.htetarkarzaw.mynote.ui.theme.LightGreen
import com.htetarkarzaw.mynote.ui.theme.RedOrange
import com.htetarkarzaw.mynote.ui.theme.RedPink
import com.htetarkarzaw.mynote.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)