package com.muratozcan.moviesapp.di

import com.muratozcan.moviesapp.data.datasource.MoviesDataSource
import com.muratozcan.moviesapp.data.repo.MoviesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideMoviesDataSource() : MoviesDataSource {
        return MoviesDataSource()
    }

    @Provides
    @Singleton
    fun provideMoviesRepository(mds: MoviesDataSource) : MoviesRepository {
        return MoviesRepository(mds)
    }
}