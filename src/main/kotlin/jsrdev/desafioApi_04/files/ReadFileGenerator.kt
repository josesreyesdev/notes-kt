package jsrdev.desafioApi_04.files

import com.google.gson.reflect.TypeToken
import jsrdev.desafioApi_04.Constant.gson
import java.io.FileReader
import java.io.IOException

/* Investigar sobre leer y escribir
    *
    * ufferedReader y BufferedWriter
    * FileInputStream y FileOutputStream
    * ObjectInputStream y ObjectOutputStream
    * */

class ReadFileGenerator<T> {

    fun readFromFile(fileName: String, isJson: Boolean = false, type: TypeToken<T>? = null): T? {
        return try {
            val reader = FileReader(fileName)
            val content = reader.readText() /* Leer todo el archivo como texto */
            reader.close()

            if (isJson && type != null) {
                gson().fromJson(content, type.type)
            } else {
                @Suppress("UNCHECKED_CAST")
                content as? T  // Devolver el contenido como texto
            }
        } catch (exception: IOException) {
            throw RuntimeException(exception)
        }
    }

    /*
    * fun readStringsFromFile(filePath: String = PATH_FILE) {
        try {
            // crear un archivo
            val file = File(filePath)

            // leer el archivo
            val reader = FileReader(file)

            // leer los datos del archivo
            var data = reader.read()
            while (data != -1) {
                print("${data.toChar()}")
                data = reader.read()
            }

            reader.close()
        } catch (e: FileNotFoundException) {
            println("File not found")
        }
    }
    * */
}
