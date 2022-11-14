package step3.component

import step3.CarFactory
import step3.CarStore
import step3.ui.Input
import step3.ui.Span

class CarInputComponent : Component {
    private val span = Span(text = "자동차 대수는 몇 대인가요?", block = true)
    private val input = Input()

    init { this.input.addCommandListener(this::onCommand) }

    fun onCommand(value: String) {
        val cars = CarFactory.createMany(amount = value.toInt())
        CarStore.saveAll(cars)
    }

    override fun render() {
        this.span.draw()
        this.input.draw()
    }
}