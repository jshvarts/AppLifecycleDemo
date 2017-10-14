package com.example.applifecycle;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application;
    }
}
