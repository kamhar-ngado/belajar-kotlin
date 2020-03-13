import  java.util.*

fun main() {
    println("Aplikasi perkantoran")

    val dokumen = HashMap<Int, String>()
    dokumen[123] = "joko"
    dokumen[125] = "bowo"
    dokumen[558] = "amin"
    dokumen[89] = "wati"

    for(key in dokumen.keys) {
        println("$key: ${dokumen[key]}")
    }

}