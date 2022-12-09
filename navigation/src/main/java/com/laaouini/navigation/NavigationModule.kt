package com.laaouini.navigation

import org.koin.dsl.module

/**
 * Created by laaouini on 09/10/2018.
 */

val navigationModule = module {

    factory { NavigationHandlerImpl(
        addTodoListNavigationHandler = get(),
        todoListNavigationHandler = get(),
        editTodoListNavigationHandler = get(),
        addTodoNavigationHandler = get(),
        editTodoNavigationHandler = get()
    ) as NavigationHandler }

}