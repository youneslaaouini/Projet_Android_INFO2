package com.laaouini.mytodolist

import android.app.Application
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.plugins.databases.DatabasesFlipperPlugin
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.soloader.SoLoader
import com.facebook.stetho.Stetho
import com.jbvincey.design.BuildConfig
import com.laaouini.core.dependencies.coreModule
import com.laaouini.featureaddtodo.featureAddTodoModule
import com.laaouini.featureaddtodolist.featureAddListTodoModule
import com.laaouini.navigation.navigationModule
import com.laaouini.todolist.featureTodoListModule
import com.laaouini.todolistpicker.featureTodoListPickerModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by laaouini on 16/09/2018.
 */
class MyTodoListApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            initializeFlipper()
        }

        startKoin {
            // use AndroidLogger as Koin Logger - default Level.INFO
            androidLogger()

            // use the Android context given there
            androidContext(this@MyTodoListApp)

            // load properties from assets/koin.properties file
            androidFileProperties()

            // module list
            modules(listOf(
                coreModule,
                navigationModule,
                featureTodoListPickerModule,
                featureAddListTodoModule,
                featureTodoListModule,
                featureAddTodoModule
            ))
        }

        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }

    private fun initializeFlipper() {
        SoLoader.init(this, false)
        if (FlipperUtils.shouldEnableFlipper(this)) {
            val client = AndroidFlipperClient.getInstance(this)
            client.addPlugin(InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()))
            client.addPlugin(DatabasesFlipperPlugin(this))
            client.start()
        }
    }

}