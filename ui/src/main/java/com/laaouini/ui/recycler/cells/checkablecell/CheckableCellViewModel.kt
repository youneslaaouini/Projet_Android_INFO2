package com.laaouini.ui.recycler.cells.checkablecell

import androidx.annotation.ColorRes
import com.laaouini.ui.R
import java.util.*

/**
 * Created by laaouini on 28/09/2018.
 */
data class CheckableCellViewModel<T>(
    val id: Long,
    val name: String,
    val completed: Boolean,
    val creationDate: Date,
    val completionDate: Date?,
    val archived: Boolean,
    @ColorRes val backgroundColorRes: Int = R.color.theme_background_1,
    val callback: CheckableCellCallback<T>,
    val data: T
)