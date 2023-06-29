package com.example.personalnotes

import android.app.Application
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.personalnotes.di.AppModule
import com.example.personalnotes.domain.model.Note
import com.example.personalnotes.ui.theme.PersonalNotesTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        val note1 = Note("title1", "some texttttttttt", Color.CYAN, 12312123)
//        val note2 = Note("title2", "some 2 texttttttttt", Color.CYAN, 123452123)
//
//        val app = application
//
//        println(app.applicationInfo.name)
//        lifecycleScope.launch {
//
//            val db = AppModule.provideNoteDatabase(app)
//            val repo = AppModule.provideNoteRepository(db)
//            repo.insertNote(note1)
//            repo.insertNote(note2)
//
////            repo.deleteNote(note1)
//            val result = repo.getNotes()
//
//
//            println("result:")
//
//           result.collect{
//               println(it)
//           }
//        }


        setContent {
            PersonalNotesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PersonalNotesTheme {
        Greeting("Android")
    }
}