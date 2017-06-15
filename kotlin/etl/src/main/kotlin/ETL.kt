object ETL {

    fun transform(scores: Map<Int, List<Char>>): Map<Char, Int> {
        return scores.flatMap {
            val value = it.key
            it.value.map { it.toLowerCase() to value }
        }.toMap()
    }

}