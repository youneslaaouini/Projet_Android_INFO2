package com.laaouini.core.dependencies

import androidx.room.Room
import com.laaouini.core.database.MyTodoListDb
import com.laaouini.core.repositories.TodoListRepository
import com.laaouini.core.repositories.TodoListRepositoryImpl
import com.laaouini.core.repositories.TodoRepository
import com.laaouini.core.repositories.TodoRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


/**
 * Created by laaouini on 01/10/2018.
 */

val coreModule = module {

    single { TodoRepositoryImpl(get()) as TodoRepository }

    single { TodoListRepositoryImpl(get()) as TodoListRepository }

    single {
        Room.databaseBuilder(androidContext(), com.laaouini.core.database.MyTodoListDb::class.java, "mytodolist.db")
                .fallbackToDestructiveMigration()
                .build()
    }

    single { get<com.laaouini.core.database.MyTodoListDb>().getTodoDao() }

    single { get<com.laaouini.core.database.MyTodoListDb>().getTodoListDao() }

}