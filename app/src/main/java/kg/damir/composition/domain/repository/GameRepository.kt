package kg.damir.composition.domain.repository

import kg.damir.composition.domain.entity.GameSettings
import kg.damir.composition.domain.entity.Level
import kg.damir.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestions(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}