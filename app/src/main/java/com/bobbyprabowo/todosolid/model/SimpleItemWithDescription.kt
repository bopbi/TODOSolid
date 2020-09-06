package com.bobbyprabowo.todosolid.model

sealed class SimpleItemWithDescription : TodoItem {

    sealed class ItemView : SimpleItemWithDescription() {

        data class Data(val title: String, val isCompleted: Boolean): ItemView()

    }
}
