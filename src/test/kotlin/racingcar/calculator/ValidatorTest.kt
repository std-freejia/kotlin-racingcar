package racingcar.calculator

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class ValidatorTest {
    @Test
    fun `null 이거나 공백인 경우`() {
        val input = ""
        assertThatThrownBy {
            Validator.isValidOperator(input)
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("유효하지 않은 연산자입니다")
    }

    @Test
    fun `사칙연산 기호가 아닌 경우`() {
        val input = "3 & 5"
        assertThatThrownBy {
            Validator.isValidOperator(input)
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("유효하지 않은 연산자입니다")
    }
}
