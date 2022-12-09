package com.laaouini.todolistpicker

import com.laaouini.navigation.TodoListPickerNavigationHandler
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureTodoListPickerModule = module {

    viewModel { TodoListPickerArchViewModel(
        todoListRepository = get(),
        todoListToStickyNoteCardViewModelTransformer = get()
    ) }

    factory { TodoListToStickyNoteCardViewModelTransformer() }

    factory { TodoListPickerNavigationHandlerImpl() as TodoListPickerNavigationHandler }

}