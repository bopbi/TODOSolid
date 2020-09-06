package com.bobbyprabowo.todosolid.home.viewholder.factory

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bobbyprabowo.todosolid.R
import com.bobbyprabowo.todosolid.home.TodoListAdapter
import com.bobbyprabowo.todosolid.home.TodoViewHolderFactory
import com.bobbyprabowo.todosolid.home.viewholder.SimpleTodoItemViewHolder
import com.bobbyprabowo.todosolid.home.viewholder.ViewHolderType
import com.bobbyprabowo.todosolid.model.SimpleItem
import com.bobbyprabowo.todosolid.model.TodoItem

open class SimpleTodoViewHolderFactory : TodoViewHolderFactory {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoListAdapter.TodoItemViewHolder {
        return if (viewType == ViewHolderType.SIMPLE.ordinal) {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo_list, parent, false
            )
            SimpleTodoItemViewHolder(view)
        } else {
            throw Throwable("Wrong Item Type")
        }
    }

    override fun getItemViewType(todoItem: TodoItem): Int {
        if (todoItem is SimpleItem) {
            return ViewHolderType.SIMPLE.ordinal
        } else {
            throw Throwable("Wrong Item Type")
        }
    }
}
