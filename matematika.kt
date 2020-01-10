fun main(args: Array<String>)
{
    print("masukan angka1:")
    val angka1:Int = readLine()!!.toInt()

    print("masukan angka2:")
    val angka2:Int = readLine()!!.toInt()

    val sum:Int = angka1+angka2
    println("penjumlahan: $angka1 + $angka2 = $sum")

    val sub:Int = angka2-angka1
    println("pengurangan: $angka2 - $angka1 = $sub")

    val mul:Int =angka1*angka2
    println("perkalian: $angka1 * $angka2 = $mul")

    val div = angka2/angka1
    println("pembagian: $angka2/$angka1 = $div")

}