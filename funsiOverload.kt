

fun penjumlahan(angka1:Int, angka2:Int):Int{
    return angka1 * angka2
}

fun penjumlahan(angka1:Int, angka2:Int, angka3:Int):Int{
    return angka1 + angka2 + angka3
}

fun penjumlahan(angka1:Int, angka2:Int, angka3:Int, angka4:Int):Int{
    return angka1 + angka2 + angka3 + angka4
}

fun main() {
    println(penjumlahan(1, 2))
    println(penjumlahan(2, 3, 4))
    println(penjumlahan(3, 4, 5, 6))
}