package racingcar.calculator

/** 전처리: 연산자 배열과 숫자 배열로 분리한다 */
class PreProcess {
    companion object {
        val validOperator = "+-*/"

        fun splitBySpace(s: String): List<String> {
            return s.split(" ")
        }

        fun extractNumbers(input: List<String>): List<Double> {
            return input.filter { !validOperator.contains(it) }
                .map { it.toDouble() }
        }

        fun extractOperators(input: List<String>): List<String> {
            return input.filter { validOperator.contains(it) }
        }

        fun parseStringToDouble(s: String): Double {
            return s.toDouble()
        }
    }
}
