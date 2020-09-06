package com.bobbyprabowo.todosolid.datasource

import com.bobbyprabowo.todosolid.model.Todo
import io.reactivex.rxjava3.core.Single

interface TodoRepository {

    fun getAllTodo(): Single<List<Todo>>
}
