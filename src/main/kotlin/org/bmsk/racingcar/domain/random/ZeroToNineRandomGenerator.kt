package org.bmsk.racingcar.domain.random

internal class ZeroToNineRandomGenerator : RandomGenerator {
    override fun generate(): Int {
        return (0..9).random()
    }
}