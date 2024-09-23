package jsrdev.screenmatchPOO_02.calculations

import jsrdev.screenmatchPOO_02.model.Classification


class RecommendationFilter {
    fun filter(classification: Classification) {
        val myClassification = classification.getClassification()
        when {
            myClassification >= 4 -> println("Muy buena evaluacion al momento")
            myClassification >= 2 -> println("Popular al momento")
            else -> println("Coloca en tu lista para verlo mas tarde")
        }
    }
}