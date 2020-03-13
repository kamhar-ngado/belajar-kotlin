
fun mathop(a:Double, b:Double): Double {
    val penjumlahan = a + b
    return penjumlahan
}


fun info(vararg ketampanan: Array<String>) {
    for(nama in ketampanan) {
        println(ketampanan)
    }
}

fun main() {
    var penjumlahan = mathop(1.0, 2.0)
    penjumlahan = mathop(2.0, 3.0)
    println(penjumlahan)

    info(*arrayOf(arrayOf("handsome, tamvan, handoem")))

}