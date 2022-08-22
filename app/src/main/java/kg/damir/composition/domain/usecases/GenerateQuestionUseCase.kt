package kg.damir.composition.domain.usecases

import kg.damir.composition.domain.entity.Question
import kg.damir.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {
    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestions(maxSumValue, COUNT_oF_OPTIONS)
    }

    companion object {
        private const val CO UNT_oF_OPTIONS = 6
    }
}