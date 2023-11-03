package racing.ui

import racing.domain.Car
import racing.domain.CarName
import racing.domain.Location
import java.util.StringJoiner

object OutputView {
    private const val ERROR_MESSAGE = "[ERROR]"
    private const val ROAD = "-"
    fun printGameResult() {
        println("실행 결과")
    }

    fun printResultPerRace(cars: List<Car>) {
        for (car in cars) {
            println("%s: %s".format(car.name, locationToRoad(car.location)))
        }
        println()
    }

    private fun locationToRoad(location: Location): String {
        val stringBuilder = StringBuilder()
        for (i in 0 until location.location) {
            stringBuilder.append(ROAD)
        }
        return stringBuilder.toString()
    }

    fun printIllegalArgumentException(e: IllegalArgumentException) {
        System.out.printf("%s%s\n", ERROR_MESSAGE, e.message)
    }

    fun printWinner(winners: List<CarName>) {
        val stringJoiner = StringJoiner(",")
        for (winner in winners) {
            stringJoiner.add(winner.name)
        }
        println("최종 우승자 : %s".format(stringJoiner.toString()))
    }
}