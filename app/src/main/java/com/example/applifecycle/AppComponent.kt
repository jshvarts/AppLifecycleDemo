package com.example.applifecycle

import android.app.Application
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton
import dagger.BindsInstance



@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class))
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}