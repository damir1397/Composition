package kg.damir.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) : Parcelable {
    val minPercentOfRightAnswersString: String
        get() = minPercentOfRightAnswers.toString()
    val minCountOfRightAnswersString: String
        get() = minCountOfRightAnswers.toString()

}
