package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringTest {
    @Test
    fun isBlank() {
        val actual = "".isBlank()
        println(actual)
        assertThat("".isBlank()).isEqualTo(true)
        assertThat(" ".isBlank()).isEqualTo(true)
    }
}
