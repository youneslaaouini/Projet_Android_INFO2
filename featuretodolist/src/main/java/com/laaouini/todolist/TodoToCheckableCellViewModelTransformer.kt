package com.laaouini.todolist

import com.laaouini.core.models.Todo
import com.laaouini.core.transformers.Transformer
import com.laaouini.ui.recycler.cells.checkablecell.CheckableCellCallback
import com.laaouini.ui.recycler.cells.checkablecell.CheckableCellViewModel

/**
 * Created by laaouini on 28/09/2018.
 */
class TodoToCheckableCellViewModelTransformer : Transformer<Todo, CheckableCellViewModel<Todo>> {

    lateinit var checkableCellCallback: CheckableCellCallback<Todo>

    var backgroundColorRes: Int = R.color.theme_background_1

    override fun transform(source: Todo): CheckableCellViewModel<Todo>
        = CheckableCellViewModel(
            id = source.id,
            name = source.name,
            completed = source.completed,
            creationDate = source.creationDate,
            completionDate = source.completionDate,
            archived = source.archived,
            backgroundColorRes = backgroundColorRes,
            callback = checkableCellCallback,
            data = source
        )

}