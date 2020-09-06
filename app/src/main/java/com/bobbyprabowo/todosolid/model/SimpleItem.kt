package com.bobbyprabowo.todosolid.model

sealed class SimpleItem : TodoItem {

    sealed class ItemView : SimpleItem() {

        data class Data(val title: String, val isCompleted: Boolean): ItemView()

    }
}
