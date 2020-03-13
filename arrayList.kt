fun main() {

    println("aplikasi warung makan")

    val daftarMenu = ArrayList<String>()
    do {
        print("anda mau pesan apa?: ")
        val menuMakanan = readLine()!!.toString()
        if(menuMakanan != "quit") {
            daftarMenu.add(menuMakanan)
        }
    } while (menuMakanan != "quit")

    println("Menu yang anda pesan adalah:")
    for(i in 1 until daftarMenu.size) {
        println("menu $i: ${daftarMenu[i]} ")
    }

//    for(buah in daftarJus) {
//        println("buah: $buah")
//    }

}