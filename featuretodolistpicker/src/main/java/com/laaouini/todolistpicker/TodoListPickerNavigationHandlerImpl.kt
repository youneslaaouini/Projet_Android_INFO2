package com.laaouini.todolistpicker

import android.content.Context
import com.laaouini.navigation.TodoListPickerNavigationHandler

class TodoListPickerNavigationHandlerImpl: TodoListPickerNavigationHandler {

    override fun buildFeaturePath(context: Context, vararg parameters: Any) =
        context.resources.getString(R.string.feature_path_todolistpicker)
}