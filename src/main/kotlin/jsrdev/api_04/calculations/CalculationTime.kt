package jsrdev.api_04.calculations

import jsrdev.api_04.model.Title

class CalculationTime {
    private var _totalTime: Int = 0
    val totalTime get() = _totalTime

    fun include(title: Title) {
        _totalTime += title.durationInMinutes
    }
}