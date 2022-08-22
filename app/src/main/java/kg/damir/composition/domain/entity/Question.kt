package kg.damir.composition.domain.entity

import java.io.Serializable

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
){

    val rightAnswer: Int
        get() = sum - visibleNumber
}