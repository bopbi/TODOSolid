package com.bobbyprabowo.todosolid.domain

import com.bobbyprabowo.todosolid.model.Todo
import io.reactivex.rxjava3.core.Single

interface GetAllTodo {

    fun execute(): Single<List<Todo>>
}
