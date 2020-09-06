package com.bobbyprabowo.todosolid.datasource.impl

import com.bobbyprabowo.todosolid.datasource.TodoRepository
import com.bobbyprabowo.todosolid.model.Todo
import io.reactivex.rxjava3.core.Single

class TodoRepositoryImpl : TodoRepository {
    override fun getAllTodo(): Single<List<Todo>> {
        return Single.defer {
            Single.just(
                listOf(
                    Todo(
                        title = "Hello 1",
                        isCompleted = false
                    ),
                    Todo(
                        title = "Hello 2",
                        isCompleted = false
                    ),
                    Todo(
                        title = "Hello 3",
                        isCompleted = false
                    )
                )
            )
        }
    }
}
