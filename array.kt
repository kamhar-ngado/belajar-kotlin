fun main() {
    print("masukan jumlah jus yang anda mau pesan: ")
    val maxJus = readLine()!!.toInt() + 1
    val daftarJus = Array(maxJus){""}
    for (i in 1 until maxJus) {
        daftarJus[i] = readLine()!!.toString()
    }

    println("Jus yang anda pesan adalah:")
    for(i in 1 until maxJus) {
        println("Jus $i: ${daftarJus[i]} ")
    }

}