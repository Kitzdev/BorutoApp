package dev.kitzdev.borutoapp.domain.use_cases.save_onboarding

import dev.kitzdev.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(completed: Boolean) {
        repository.saveOnBoardingState(completed = completed)
    }
}