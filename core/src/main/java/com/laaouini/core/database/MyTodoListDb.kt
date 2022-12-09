package com.laaouini.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.laaouini.core.models.TodoList
import com.laaouini.core.models.Todo

/**
 * Created by laaouini on 16/09/2018.
 */
@Database(
        entities = [
            TodoList::class,
            Todo::class
        ],
        version = 2,
        exportSchema = false
)
@TypeConverters(com.laaouini.core.database.MyTodoListTypeConverters::class)
abstract class MyTodoListDb: RoomDatabase() {

    abstract fun getTodoListDao(): com.laaouini.core.database.TodoListDao
    abstract fun getTodoDao(): com.laaouini.core.database.TodoDao

}