package study

import carRace.Car
import carRace.CarMovingStrategy
import carRace.CarRaceSimulator
import carRace.ManualInputView
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarRaceSimulatorTest : StringSpec({
    val drivers = listOf("aaa", "bbb", "ccc", "ddd", "eee")
    "carDriveTest" {
        val originalPosition = 1
        val car = Car("anonymous", originalPosition, AlwaysMovingStrategy)

        val driveCount = 1

        repeat(driveCount) {
            car.drive()
        }

        val expectedDistance = originalPosition + driveCount
        val actualDistance = car.traveled

        expectedDistance.shouldBe(actualDistance)
    }

    "carRaceSimulatorAlwaysMovingTest" {
        val iterationCount = 5
        val simulator = CarRaceSimulator(ManualInputView(drivers, iterationCount))
        val result = simulator.simulate(AlwaysMovingStrategy)

        result.currentCars.forEach {
            it.traveled.shouldBe(iterationCount)
        }
    }

    "carRaceSimulatorAlwaysNotMovingTest" {
        val iterationCount = 5
        val simulator = CarRaceSimulator(ManualInputView(drivers, iterationCount))
        val result = simulator.simulate(AlwaysNotMovingStrategy)

        result.currentCars.forEach {
            it.traveled.shouldBe(0)
        }
    }
})

object AlwaysMovingStrategy : CarMovingStrategy {
    override fun shouldMove(): Boolean = true
}

object AlwaysNotMovingStrategy : CarMovingStrategy {
    override fun shouldMove(): Boolean = false
}