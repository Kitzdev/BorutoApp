package dev.kitzdev.borutoapp.domain.use_cases

import dev.kitzdev.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import dev.kitzdev.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase,
)