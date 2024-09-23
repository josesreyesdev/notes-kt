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

        // expresion regular para extraer los digitos
        val runtimeRegex: Regex = "\\d+".toRegex()
        val matchResult: MatchResult? = runtimeRegex.find(runtime)

        return matchResult?.value?.toIntOrNull() ?: 0
    }

    fun newParseRuntime(runtime: String): Int {
        return if (runtime.contains("N/A")) {
            throw ErrorConvertDurationException("Cannot convert duration because it contains 'N/A'")
        } else {
            try {
                runtime.substring(0, 3).trim().toInt()
            } catch (e: NumberFormatException) {
                throw ErrorConvertDurationException("Error parsing duration: ${e.message}")
            }
        }
    }
}