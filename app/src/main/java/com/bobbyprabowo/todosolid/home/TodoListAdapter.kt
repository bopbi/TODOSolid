package com.bobbyprabowo.todosolid.home

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bobbyprabowo.todosolid.model.TodoItem

class TodoListAdapter(private val viewHolderFactory: TodoViewHolderFactory) :
    ListAdapter<TodoItem, TodoListAdapter.TodoItemViewHolder>(TodoItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoItemViewHolder {
        return viewHolderFactory.onCreateViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: TodoItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemViewType(position: Int): Int {
        return viewHolderFactory.getItemViewType(getItem(position))
    }

    abstract class TodoItemViewHolder(view: View) : RecyclerView.ViewHolder(view),
        TodoBindViewHolder

    interface TodoBindViewHolder {

        fun bind(todoItem: TodoItem)
    }

    class TodoItemDiffCallback : DiffUtil.ItemCallback<TodoItem>() {
        override fun areItemsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
            return oldItem == newItem
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
            return oldItem == newItem
        }

    }
}

