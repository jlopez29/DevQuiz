package jlapps.games.devquiz.menu.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import jlapps.games.devquiz.R

class AdapterTopicSelector(private val dataSet: ArrayList<Topic>) :
    RecyclerView.Adapter<AdapterTopicSelector.ViewHolder>() {
    var selectAll:Boolean = false

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val topicSelector: CheckBox

        init {
            // Define click listener for the ViewHolder's View.
            topicSelector = view.findViewById(R.id.cb_topic_selector)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_topic_selector, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.topicSelector.text = dataSet[position].title
        viewHolder.topicSelector.setOnCheckedChangeListener{_,checked->
            dataSet[position].selected = checked
        }
            viewHolder.topicSelector.isChecked = selectAll
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

    fun getSelectedItems():ArrayList<Topic>{
        return dataSet.filter { it.selected } as ArrayList<Topic>
    }

    fun selectAll(){

    }

}