package com.bobbyprabowo.todosolid.home

import android.view.ViewGroup
import com.bobbyprabowo.todosolid.model.TodoItem

interface TodoViewHolderFactory {

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListAdapter.TodoItemViewHolder

    fun getItemViewType(todoItem: TodoItem): Int
}
