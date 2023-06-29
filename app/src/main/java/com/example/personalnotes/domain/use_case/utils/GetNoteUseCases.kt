package com.example.personalnotes.domain.use_case.utils

import com.example.personalnotes.domain.use_case.DeleteNote
import com.example.personalnotes.domain.use_case.GetNotes
import com.example.personalnotes.domain.use_case.InsertNote

data class GetNoteUseCases(
    val deleteNote: DeleteNote,
    val getNotes: GetNotes,
    val insertNote: InsertNote
)