package com.example.hw55

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ShareModule {
    @Singleton
    @Provides
    fun providePref(context: Context):Pref{
        return Pref(context)
    }

}