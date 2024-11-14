package racingcar.calculator

/** 유틸성 함수 모음 */
open class Validator {
    companion object {
        fun isValidOperator(s: String?): Boolean {
            if (s.isNullOrEmpty()) throw IllegalArgumentException("유효하지 않은 식입니다")
            return true
        }
    }
}
