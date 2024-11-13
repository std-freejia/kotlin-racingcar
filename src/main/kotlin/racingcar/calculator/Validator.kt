package racingcar.calculator

/** 유틸성 함수 모음 */
open class Validator {
    companion object {
        private val validOperator: String = "+-*/"

        fun isValidOperator(s: String): Boolean {
            if (s.isEmpty()) throw IllegalArgumentException("유효하지 않은 연산자입니다")
            if (!s.contains(validOperator)) throw IllegalArgumentException("유효하지 않은 연산자입니다")
            return true
        }
    }
}
