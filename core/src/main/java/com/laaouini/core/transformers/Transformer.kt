package com.laaouini.core.transformers

import java.util.*

/**
 * Created by laaouini on 28/09/2018.
 */
interface Transformer<Source, Result> {

    fun transform(source: Source): Result

    fun transform(sourceList: List<Source>): List<Result> {
        val resultList = ArrayList<Result>(sourceList.size)
        sourceList.forEach { resultList.add(transform(it)) }
        return resultList
    }
}