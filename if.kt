fun main(args: Array<String>)
{
    print("masukan nilai ujianmu:")
    val nilai_ujian:Int = readLine()!!.toInt()

    if (nilai_ujian >= 90)
    println("nilaimu adalah A")

    if (nilai_ujian >= 70 && nilai_ujian <= 90)
    println("nilaimu adalah B")

    if (nilai_ujian >= 50 && nilai_ujian <= 70)
    println("nilaimu adalah C")

}