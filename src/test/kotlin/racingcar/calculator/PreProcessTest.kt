package racingcar.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PreProcessTest {
    @Test
    fun `연산식에서 공백 기준으로 분리`() {
        val input = "3 + 5"
        val result: List<String> = PreProcess.splitBySpace(input)
        assertThat(listOf("3", "+", "5")).isEqualTo(result)
    }

    @Test
    fun `문자열 리스트에서 숫자만 추출`() {
        val input = "3 + 5"
        val result: List<String> = PreProcess.splitBySpace(input)
        assertThat(listOf("3", "+", "5")).isEqualTo(result)

        val numbers: List<String> = PreProcess.extractNumbers(result)
        assertThat(listOf("3", "5")).isEqualTo(numbers)
    }

    @Test
    fun `문자열 리스트에서 연산자만 추출`() {
        val input = "3 + 5 - 2"
        val result: List<String> = PreProcess.splitBySpace(input)
        assertThat(listOf("3", "+", "5", "-", "2")).isEqualTo(result)

        val operators: List<String> = PreProcess.extractOperators(result)
        assertThat(listOf("+", "-")).isEqualTo(operators)
    }
}
