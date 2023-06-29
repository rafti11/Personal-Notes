package com.example.personalnotes.domain.use_case

import com.example.personalnotes.domain.model.Note
import com.example.personalnotes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val noteRepository: NoteRepository
) {

    operator fun invoke() : Flow<List<Note>> {


        return noteRepository.getNotes()
    }
}