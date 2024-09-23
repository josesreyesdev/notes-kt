package jsrdev.screenmatchListas_03.calculations

import jsrdev.screenmatchListas_03.model.Title

class CalculationTime {
    private var _totalTime: Int = 0
    val totalTime get() = _totalTime

    fun include(title: Title) {
        _totalTime += title.durationInMinutes
    }
}