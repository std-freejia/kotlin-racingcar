package racingcar.calculator

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class ValidatorTest {
    @Test
    fun `null 이거나 공백인 경우`() {
        val input = ""
        assertThatThrownBy {
            Validator.isValidOperator(input)
        }.isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("유효하지 않은 식입니다")
    }

    @Test
    fun `사용자 입력이 정상 연산식인 경우`() {
        val input = "3 + 2 - 1"
        assertThat(Validator.isValidOperator(input)).isTrue()
    }
}
