fun main() {
    print("masukan jumlah jus yang anda mau pesan: ")
    val maxJus = readLine()!!.toInt()
    val daftarJus = ArrayList<String>()
    for (i in 0 until maxJus) {
        print("$i: ")
        daftarJus.add(readLine()!!.toString())
    }

    println("Jus yang anda pesan adalah:")
    for(i in 0 until maxJus) {
        println("Jus $i: ${daftarJus[i]} ")
    }

    if(daftarJus.contains("buah naga")) {
        println("maaf stok buah naga habis")
    }else {
        println("terima kasih")
    }

}