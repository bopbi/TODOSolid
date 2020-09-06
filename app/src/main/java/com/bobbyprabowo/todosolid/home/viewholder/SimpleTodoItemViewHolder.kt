package com.bobbyprabowo.todosolid.home.viewholder

import android.view.View
import android.widget.TextView
import com.bobbyprabowo.todosolid.R
import com.bobbyprabowo.todosolid.home.TodoListAdapter
import com.bobbyprabowo.todosolid.model.SimpleItem
import com.bobbyprabowo.todosolid.model.SimpleItemWithDescription
import com.bobbyprabowo.todosolid.model.TodoItem

class SimpleTodoItemViewHolder(view: View) : TodoListAdapter.TodoItemViewHolder(view) {

    private val title: TextView = view.findViewById(R.id.todoItemTitle)

    override fun bind(todoItem: TodoItem) {
        if (todoItem is SimpleItem.ItemView.Data) {
            title.text = todoItem.title
        }
    }

}
