package jsrdev.desafioApi_04.files

import java.io.FileWriter
import java.io.IOException

/* Investigar sobre leer y escribir
    *
    * ufferedReader y BufferedWriter
    * FileInputStream y FileOutputStream
    * ObjectInputStream y ObjectOutputStream
    * */

class FileGenerator<T> {

    fun writeToFile(data: T, fileName: String, isJson: Boolean = false) {
        try {
            val writer = FileWriter(fileName)
            if (isJson) {
                writer.write(Serializer().serializeData(data))  // Serializar a JSON
            } else {
                writer.write(data.toString())  // Escribir como texto
            }
            writer.close()
        } catch (exception: IOException) {
            throw RuntimeException(exception)
        }
    }
}