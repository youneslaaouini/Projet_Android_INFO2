package com.laaouini.ui.recycler.cells.checkablecell

import android.view.View

/**
 * Created by laaouini on 15/10/2018.
 */
interface CheckableCellCallback<T> {

    fun onCheckChanged(data: T)

    fun onLongClick(data: T, view: View): Boolean

}