package kg.damir.composition.domain.usecases

import kg.damir.composition.domain.entity.GameSettings
import kg.damir.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(): GameSettings {
        return repository.generateSettings()
    }
}