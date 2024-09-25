package jsrdev.api_04.model

import jsrdev.api_04.exceptions.ErrorConvertDurationException

object ParseData {
    fun parseDate(field: String): Int {
        // expresion regular para extraer los digitos
        val runtimeRegex: Regex = "\\d+".toRegex()
        val matchResult: MatchResult? = runtimeRegex.find(field)

        return matchResult?.value?.toIntOrNull() ?: 0
    }

    fun parseRuntime(runtime: String): Int {

        return if (runtime.contains("N/A")) {
            throw ErrorConvertDurationException("Cannot convert duration because it contains 'N/A'")
        } else {
            val regex = Regex("\\d+") // Expresión regular para encontrar solo los números
            val matchResult = regex.find(runtime) // Busca el primer número en el string

            if (matchResult != null) {
                try {
                    matchResult.value.toInt() // Convierte el número encontrado a Int
                } catch (e: NumberFormatException) {
                    throw ErrorConvertDurationException("Error parsing duration: ${e.message}")
                }
            } else {
                throw ErrorConvertDurationException("No valid numeric duration found")
            }
        }
    }
}