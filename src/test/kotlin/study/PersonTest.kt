package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun `이름 붙인 인자`() {
        val actual = Person(name = "홍길동", age = 20, nickname = "길동")
        Person(name = "김석진", nickname = "찐", age = 22)
        assertThat(actual.name).isEqualTo("홍길동")
        assertThat(actual.nickname).isEqualTo("길동")
    }

    @Test
    fun `널 타입`() {
        val actual = Person(name = "김석진", age = 30, nickname = null)
        assertThat(actual.nickname).isEqualTo(null)
    }

    @Test
    fun `기본인자`() {
        val actual = Person(name = "김석진", age = 30)
        assertThat(actual.nickname).isEqualTo("김석진")
    }

    @Test
    fun `데이터 클래스`() {
        val actual = Person(name = "김석진", age = 30)
        assertThat(actual.nickname).isEqualTo("김석진")
    }
}
