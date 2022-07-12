package dev.kitzdev.borutoapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.kitzdev.borutoapp.data.repository.DataStoreOperationImpl
import dev.kitzdev.borutoapp.data.repository.Repository
import dev.kitzdev.borutoapp.domain.repository.DataStoreOperations
import dev.kitzdev.borutoapp.domain.use_cases.UseCases
import dev.kitzdev.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import dev.kitzdev.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
        )
    }

}