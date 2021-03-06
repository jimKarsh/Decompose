package com.arkivanov.todo.list.integration

import com.arkivanov.todo.list.TodoList.Input
import com.arkivanov.todo.list.store.ListStore.Intent

internal val inputToIntent: Input.() -> Intent? =
    {
        when (this) {
            is Input.Put -> Intent.Put(id = id, order = order, text = text)
            is Input.Update -> Intent.Update(id = id, text = text, isDone = isDone)
        }
    }
