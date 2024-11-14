package racingcar.calculator

class Calculator(inputString: String) {
    val inputStringList: List<String> = PreProcess.splitBySpace(inputString)
    val numbers: List<Double> = PreProcess.extractNumbers(inputStringList)
    val operators: List<String> = PreProcess.extractOperators(inputStringList)

    fun calculate(): Double {
        var answer = numbers[0]
        for (i in operators.indices) {
            val currentOperator = Operator.getOperatorBySymbol(operators[i])
            answer = currentOperator.apply(answer, numbers[i + 1])
        }
        return answer
    }
}
