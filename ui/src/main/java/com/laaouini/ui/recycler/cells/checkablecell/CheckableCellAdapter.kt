package com.laaouini.ui.recycler.cells.checkablecell

import android.content.Context
import androidx.recyclerview.widget.DiffUtil
import com.laaouini.ui.R
import com.laaouini.ui.databinding.ViewCheckableCellBinding
import com.laaouini.ui.recycler.cells.AbstractCellView
import com.laaouini.ui.recycler.cells.DataBindingListAdapter

/**
 * Created by laaouini on 22/09/2018.
 */
class CheckableCellAdapter<T>: DataBindingListAdapter<CheckableCellViewModel<T>, ViewCheckableCellBinding>(DiffCallback()) {

    class DiffCallback<T>: DiffUtil.ItemCallback<CheckableCellViewModel<T>>() {

        override fun areItemsTheSame(p0: CheckableCellViewModel<T>, p1: CheckableCellViewModel<T>) = p0.id == p1.id

        override fun areContentsTheSame(p0: CheckableCellViewModel<T>, p1: CheckableCellViewModel<T>) = p0 == p1
    }

    override fun getItemViewType(position: Int) = R.layout.view_checkable_cell

    override fun createView(context: Context): AbstractCellView<CheckableCellViewModel<T>, ViewCheckableCellBinding> =
        CheckableCellView(context)

}