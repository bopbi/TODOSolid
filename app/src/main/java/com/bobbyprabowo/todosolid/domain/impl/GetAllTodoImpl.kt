package com.bobbyprabowo.todosolid.domain.impl

import com.bobbyprabowo.todosolid.datasource.TodoRepository
import com.bobbyprabowo.todosolid.domain.GetAllTodo
import com.bobbyprabowo.todosolid.model.Todo
import io.reactivex.rxjava3.core.Single

class GetAllTodoImpl(private val todoRepository: TodoRepository) : GetAllTodo {
    override fun execute(): Single<List<Todo>> {
        return todoRepository.getAllTodo()
    }
}
