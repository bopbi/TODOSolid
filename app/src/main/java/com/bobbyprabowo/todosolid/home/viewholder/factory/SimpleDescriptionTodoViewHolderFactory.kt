package com.bobbyprabowo.todosolid.home.viewholder.factory

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bobbyprabowo.todosolid.R
import com.bobbyprabowo.todosolid.home.TodoListAdapter
import com.bobbyprabowo.todosolid.home.viewholder.ViewHolderType
import com.bobbyprabowo.todosolid.home.viewholder.SimpleDescriptionTodoItemViewHolder
import com.bobbyprabowo.todosolid.model.SimpleItemWithDescription
import com.bobbyprabowo.todosolid.model.TodoItem

class SimpleDescriptionTodoViewHolderFactory : SimpleTodoViewHolderFactory() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoListAdapter.TodoItemViewHolder {
        return if (viewType == ViewHolderType.SIMPLE_WITH_DESCRIPTION.ordinal) {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo_description_list, parent, false
            )
            SimpleDescriptionTodoItemViewHolder(view)
        } else {
            super.onCreateViewHolder(parent, viewType)
        }
    }

    override fun getItemViewType(todoItem: TodoItem): Int {
        return if (todoItem is SimpleItemWithDescription.ItemView.Data) {
            ViewHolderType.SIMPLE_WITH_DESCRIPTION.ordinal
        } else {
            super.getItemViewType(todoItem)
        }
    }
}
