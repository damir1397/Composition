package kg.damir.composition.domain.entity

data class Question(
    val sum: Int,
    val visibleNumberL: Int,
    val options: List<Int>
)