package step3.component

import step3.RoundFactory
import step3.RoundStore
import step3.ui.Input
import step3.ui.Span

class RoundInputComponent : Component {
    private val span = Span("시도할 횟수는 몇 회인가요?", block = true)
    private var input = Input()

    init { this.input.addCommandListener(this::onCommand) }

    fun onCommand(value: String) {
        val rounds = RoundFactory.createMany(amount = value.toInt())
        RoundStore.saveAll(rounds)
    }

    override fun render() {
        this.span.draw()
        this.input.draw()
    }
}