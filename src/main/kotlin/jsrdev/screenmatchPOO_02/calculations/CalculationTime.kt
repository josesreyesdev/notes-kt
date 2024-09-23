package jsrdev.screenmatchPOO_02.calculations

import jsrdev.screenmatchPOO_02.model.Title

class CalculationTime {
    private var _totalTime: Int = 0
    val totalTime get() = _totalTime

    fun include(title: Title) {
        _totalTime += title.durationInMinutes
    }
}