package jsrdev.desafioApi_04.files

import jsrdev.desafioApi_04.Constant.gson

class Serializer {

    fun <T> deserializeData(json: String, genericObject: Class<T>): T =
        gson().fromJson(json, genericObject)

    fun <T> serializeData(genericObject: T): String =
        gson().toJson(genericObject)
}