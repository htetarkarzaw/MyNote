package com.htetarkarzaw.mynote.feature_note.presentation.notes

import com.htetarkarzaw.mynote.feature_note.domain.model.Note
import com.htetarkarzaw.mynote.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNotes : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}
