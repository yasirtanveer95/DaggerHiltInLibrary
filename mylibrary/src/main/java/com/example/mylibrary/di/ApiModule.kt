package com.example.mylibrary.di

import android.content.Context
import com.example.mylibrary.ShowSnakebar
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Singleton
    @Provides
    @LibraryShowSnakebar
    fun provideShowSnakebar(@ApplicationContext context: Context): ShowSnakebar {
        return ShowSnakebar("Library")
    }

//    @Singleton
//    @Provides
//    fun provideAppDatabase(@ApplicationContext context: Context): AppDataBase {
//        return Room.databaseBuilder(
//            context, AppDataBase::class.java,
//            "test.db"
//        ).build()
//    }
//
//    @Singleton
//    @Provides
//    fun provideResponsesDAO(appDataBase: AppDataBase): ResponsesDAO {
//        return appDataBase.responsesDAO()
//    }

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class LibraryShowSnakebar

}