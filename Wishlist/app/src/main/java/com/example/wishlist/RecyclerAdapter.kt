package com.example.wishlist
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class RecyclerAdapter(private val litems: List<Info>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val NameTextView: TextView
        val LinkTextView: TextView
        val urlTextView: TextView

        // TODO: Store each of the layout's views into
        // the public final member variables created above
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            NameTextView = itemView.findViewById(R.id.item)
            LinkTextView = itemView.findViewById(R.id.price)
            urlTextView = itemView.findViewById(R.id.url)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.wish_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val litem: Info = litems[position]
        holder.NameTextView.text = litem.inputText
        holder.LinkTextView.text = litem.inputText2
        holder.urlTextView.text = litem.inputText3

    }

    override fun getItemCount(): Int {
        return litems.size
    }
}
