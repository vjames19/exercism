fun transcribeToRna(dna: String): String = dna.map(Transcriber::transcribe).joinToString(separator = "")

object Transcriber {
    val map = hashMapOf(
            'G' to 'C',
            'C' to 'G',
            'T' to 'A',
            'A' to 'U')

    fun transcribe(char: Char): Char {
        return map[char]!!
    }
}

