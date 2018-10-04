package tech.blur.bookcrossing.features.core.books

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_book.view.*
import tech.blur.bookcrossing.R
import tech.blur.bookcrossing.features.core.books.model.Book

class BookListAdapter(val books : ArrayList<Book>, val context: Context,val listener: SelectBookListener)
    : RecyclerView.Adapter<BookListAdapter.BookHolder>()
{

    override fun getItemCount(): Int {
        return books.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        return BookHolder(LayoutInflater.from(context).inflate(R.layout.item_book,parent,false))
    }

    fun setEvents(booksList: List<Book>?) {
        books.clear()
        if (booksList != null)    books.addAll(booksList)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        holder?.title?.text = books.get(position).label
        holder?.author?.text = books.get(position).author
        holder?.itemView.setOnClickListener { listener.onBookSelected() }
    }

    class BookHolder(view: View) : RecyclerView.ViewHolder(view){
        val title = view.title
        val author = view.author
    }
    interface SelectBookListener{
        fun onBookSelected()
    }
}