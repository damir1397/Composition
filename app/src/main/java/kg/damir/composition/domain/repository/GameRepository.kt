package kg.damir.composition.domain.repository

import kg.damir.composition.domain.entity.GameSettings
import kg.damir.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestions():Question
    fun generateSettings():GameSettings
}