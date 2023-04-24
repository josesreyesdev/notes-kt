package examples.retos2023

fun main() {
    drawSteps(0)
    drawSteps(4)
    drawSteps(-4)
}
fun drawSteps( steps: Int) {
    var spaces: String
    when {
        steps > 0 -> {
            for (step in 0..steps) {
                spaces = "  " //*(steps - step)
                val drawSpace = if (step == 0) "_" else "_|"
                println("$spaces$drawSpace")
            }
        }

        steps < 0 -> {
            for (step in 0..(-steps + 1)) { /*range(abs(steps) + 1)*/
                spaces = " " // * ((step * 2) - 1)
                val drawSpace = if (step == 0) "_" else "|_"
                println("$spaces$drawSpace")
            }
        }

        else -> print("__")
    }
}