package newsCodelabsGoogle.functions

fun main() {
    val dirtyLevel = 20
    //val waterFilter = { dirty : Int -> dirty / 2}
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
    println(waterFilter(dirtyLevel))
    println(updateDirty(12, waterFilter))
    println(updateDirty(15, ::increaseDirty))
    println("--------------")

    var dirtyLevel2 = 19
    dirtyLevel2 = updateDirty(dirtyLevel2) { dirtyLevel2 -> dirtyLevel2 + 23}
    println(dirtyLevel2)
}

private fun updateDirty( dirty: Int, operation: (Int) -> Int) : Int {
    return operation(dirty)
}

private fun increaseDirty( start: Int) = start + 1