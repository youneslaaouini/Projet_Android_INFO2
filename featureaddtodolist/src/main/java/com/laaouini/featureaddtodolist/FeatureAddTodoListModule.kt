package com.laaouini.featureaddtodolist

import com.laaouini.featureaddtodolist.add.AddTodoListArchViewModel
import com.laaouini.featureaddtodolist.add.AddTodoListNavigationHandlerImpl
import com.laaouini.featureaddtodolist.edit.EditTodoListArchViewModel
import com.laaouini.featureaddtodolist.edit.EditTodoListNavigationHandlerImpl
import com.laaouini.navigation.AddTodoListNavigationHandler
import com.laaouini.navigation.EditTodoListNavigationHandler
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureAddListTodoModule = module {

    viewModel { AddTodoListArchViewModel(get()) }

    factory { AddTodoListNavigationHandlerImpl() as AddTodoListNavigationHandler }

    viewModel { EditTodoListArchViewModel(get()) }

    factory { EditTodoListNavigationHandlerImpl() as EditTodoListNavigationHandler }
}