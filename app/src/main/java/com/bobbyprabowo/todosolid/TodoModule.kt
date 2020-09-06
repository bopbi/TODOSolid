package com.bobbyprabowo.todosolid

import com.bobbyprabowo.todosolid.datasource.TodoRepository
import com.bobbyprabowo.todosolid.datasource.impl.TodoRepositoryImpl
import com.bobbyprabowo.todosolid.domain.GetAllTodo
import com.bobbyprabowo.todosolid.domain.impl.GetAllTodoImpl
import com.bobbyprabowo.todosolid.home.viewholder.factory.SimpleDescriptionTodoViewHolderFactory
import com.bobbyprabowo.todosolid.home.TodoViewHolderFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
object TodoModule {

    @Provides
    fun provideTodoRepository(): TodoRepository {
        return TodoRepositoryImpl()
    }

    @Provides
    fun provideGetAllTodo(todoRepository: TodoRepository): GetAllTodo {
        return GetAllTodoImpl(todoRepository)
    }

    @Provides
    fun provideTodoItemViewHolderFactory(): TodoViewHolderFactory {
        return SimpleDescriptionTodoViewHolderFactory()
    }
}
