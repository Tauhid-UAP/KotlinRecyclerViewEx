package com.example.kotlinrecyclerviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerviewex.models.Note
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var noteAdapter: NoteRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet(){

        // return an immutable list of Note objects
        val noteList = listOf<Note>(
            Note("Title 1", "Content 1"),
            Note("Title 2", "Content 2"),
            Note("Title 3", "Content 3"),
            Note("Title 4", "Content 4"),
            Note("Title 5", "Content 5"),
            Note("Title 6", "Content 6"),
            Note("Title 7", "Content 7"),
            Note("Title 8", "Content 8"),
            Note("Title 9", "Content 9"),
            Note("Title 10", "Content 10"),
            Note("Title 11", "Content 11"),
            Note("Title 12", "Content 12"),
            Note("Title 13", "Content 13"),
            Note("Title 14", "Content 14"),
            Note("Title 15", "Content 15"),
            Note("Title 16", "Content 16"),
            Note("Title 17", "Content 17"),
            Note("Title 18", "Content 18"),
            Note("Title 19", "Content 19"),
            Note("Title 20", "Content 20"),
            Note("Title 21", "Content 21")
        )

        noteAdapter.submitList(noteList)

    }

    private fun initRecyclerView() {
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingItemDecoration = TopSpacingItemDecoration(30)
            addItemDecoration(topSpacingItemDecoration)
            noteAdapter = NoteRecyclerAdapter()
            adapter = noteAdapter
        }
    }

}
