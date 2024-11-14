package racingcar.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OperatorTest {
    @Test
    fun `문자열에 맞는 enum 을 생성`() {
        assertThat(Operator.getOperatorBySymbol("+")).isEqualTo(Operator.PLUS)
        assertThat(Operator.getOperatorBySymbol("-")).isEqualTo(Operator.MINUS)
    }

    @Test
    fun `문자열에 맞는 enum 생성 후 연산 `() {
        val operator = Operator.getOperatorBySymbol("+")
        assertThat(operator.apply(1.0, 2.0)).isEqualTo(3.0)
    }
}
