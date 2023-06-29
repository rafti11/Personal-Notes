package com.example.personalnotes.domain.use_case

import com.example.personalnotes.domain.model.Note
import com.example.personalnotes.domain.repository.NoteRepository

class DeleteNote(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note)
    }
}