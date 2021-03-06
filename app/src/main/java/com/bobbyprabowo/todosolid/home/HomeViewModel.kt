package com.bobbyprabowo.todosolid.home

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.bobbyprabowo.todosolid.domain.GetAllTodo
import com.bobbyprabowo.todosolid.model.Divider
import com.bobbyprabowo.todosolid.model.SimpleItem
import com.bobbyprabowo.todosolid.model.SimpleItemWithDescription
import com.bobbyprabowo.todosolid.model.TodoItem
import io.reactivex.rxjava3.core.Single

class HomeViewModel @ViewModelInject constructor(
    private val getAllTodo: GetAllTodo
) : ViewModel() {

    fun getItems(): Single<List<TodoItem>> {
        return getAllTodo.execute().map { todoList ->
            val list: List<TodoItem> = todoList.map { todo ->
                SimpleItem(title = todo.title, isCompleted = todo.isCompleted)
            }

            val addedList = list.toMutableList()
            addedList.addAll(
                listOf(
                    Divider(),
                    SimpleItemWithDescription(title = "xxxxx", isCompleted = false),
                    SimpleItem(title = "yyy", isCompleted = false)
                )
            )

            addedList
        }
    }
}
