package com.example.kotlinrecyclerviewex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerviewex.models.Note
import kotlinx.android.synthetic.main.layout_note_list_item.view.*

class NoteRecyclerAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Note> = ArrayList();

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_note_list_item, parent, false)
        )

    }

    override fun getItemCount(): Int {

        return items.size

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){

            is NoteViewHolder ->{
                holder.bind(items.get(position))
            }

        }

    }

    fun submitList(noteList: List<Note>){

        items = noteList

    }

    class NoteViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        // CardView from layout_note_list_item
        // is passed to itemView
        // titleTextView holds reference to title_text_view
        // contentTextView holds reference to content_text_view
        // findViewById call not required
        val titleTextView = itemView.title_text_view
        val contentTextView = itemView.content_text_view

        fun bind(note: Note){

            titleTextView.setText(note.title)
            contentTextView.setText(note.content)

        }

    }


}