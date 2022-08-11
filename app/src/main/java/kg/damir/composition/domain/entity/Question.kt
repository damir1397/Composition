package kg.damir.composition.domain.entity

import java.io.Serializable

data class Question(
    val sum: Int,
    val visibleNumberL: Int,
    val options: List<Int>
): Serializable