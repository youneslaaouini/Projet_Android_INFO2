package com.laaouini.todolist

import com.laaouini.navigation.TodoListNavigationHandler
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by laaouini on 03/10/2018.
 */
val featureTodoListModule = module {

    viewModel { TodoListArchViewModel(
        todoRepository = get(),
        todoListRepository = get(),
        todoToCheckableCellViewModelTransformer = get()
    ) }

    factory { TodoToCheckableCellViewModelTransformer() }

    factory { TodoListNavigationHandlerImpl() as TodoListNavigationHandler }

}