package jsrdev.screenmatchPOO_02.model

class Episode(val num: Int, val name: String, val series: Series, var totalViews: Int = 0) : Classification {

    override fun getClassification(): Int = if (totalViews > 1_000) 4 else 2
}