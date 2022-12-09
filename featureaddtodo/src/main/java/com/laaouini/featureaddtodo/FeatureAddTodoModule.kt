package com.laaouini.featureaddtodo

import com.laaouini.featureaddtodo.addtodo.AddTodoArchViewModel
import com.laaouini.featureaddtodo.addtodo.AddTodoNavigationHandlerImpl
import com.laaouini.featureaddtodo.edittodo.EditTodoArchViewModel
import com.laaouini.featureaddtodo.edittodo.EditTodoNavigationHandlerImpl
import com.laaouini.navigation.AddTodoNavigationHandler
import com.laaouini.navigation.EditTodoNavigationHandler
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by laaouini on 19/09/2018.
 */
val featureAddTodoModule = module {

    viewModel { AddTodoArchViewModel(get()) }

    factory { AddTodoNavigationHandlerImpl() as AddTodoNavigationHandler }

    viewModel { EditTodoArchViewModel(get()) }

    factory { EditTodoNavigationHandlerImpl() as EditTodoNavigationHandler }

}