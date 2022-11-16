package com.deblead.hilt_sample.module

import android.content.Context
import com.deblead.hilt_sample.common.NormalToastClass
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class SampleAppModule {


    //Example Provide instance of Normal Toast class
    @Provides
    @Singleton
    fun provideNormalToastC(@ApplicationContext context: Context): NormalToastClass =
        NormalToastClass(context)
}