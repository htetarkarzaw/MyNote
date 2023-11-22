package com.htetarkarzaw.mynote.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isVisibleHint: Boolean = true
)