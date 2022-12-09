package com.laaouini.todolistpicker

import com.laaouini.core.models.TodoListWithTodos
import com.laaouini.core.transformers.Transformer
import com.laaouini.ui.recycler.cells.stickynote.StickyNoteCardCallback
import com.laaouini.ui.recycler.cells.stickynote.StickyNoteCardViewModel

class TodoListToStickyNoteCardViewModelTransformer: Transformer<TodoListWithTodos, StickyNoteCardViewModel<TodoListWithTodos>> {

    lateinit var stickyNoteCallback: StickyNoteCardCallback<TodoListWithTodos>

    override fun transform(source: TodoListWithTodos) = StickyNoteCardViewModel(
        id = source.todoList.id,
        name = source.todoList.name,
        notes = source.todos
            .filter { todo -> !todo.completed && !todo.deleted }
            .map { it.name },
        callback = stickyNoteCallback,
        data = source
    )

}