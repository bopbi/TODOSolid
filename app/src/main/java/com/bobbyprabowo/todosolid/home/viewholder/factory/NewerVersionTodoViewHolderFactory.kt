package com.bobbyprabowo.todosolid.home.viewholder.factory

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bobbyprabowo.todosolid.R
import com.bobbyprabowo.todosolid.home.TodoListAdapter
import com.bobbyprabowo.todosolid.home.viewholder.DividerItemViewHolder
import com.bobbyprabowo.todosolid.home.viewholder.ViewHolderType
import com.bobbyprabowo.todosolid.model.Divider
import com.bobbyprabowo.todosolid.model.TodoItem

class NewerVersionTodoViewHolderFactory : SimpleDescriptionTodoViewHolderFactory() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoListAdapter.TodoItemViewHolder {
        return if (viewType == ViewHolderType.DIVIDER.ordinal) {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo_divider_list, parent, false
            )
            DividerItemViewHolder(view)
        } else {
            super.onCreateViewHolder(parent, viewType)
        }
    }

    override fun getItemViewType(todoItem: TodoItem): Int {
        return if (todoItem is Divider) {
            ViewHolderType.DIVIDER.ordinal
        } else {
            super.getItemViewType(todoItem)
        }
    }
}
