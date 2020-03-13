fun main()
{

    println("aplikasi pemesanan barang")
    println("")

    //awal main kode
    println("masukan jumlah jenis barang yang ingin dipesan: ")
    val barangMax = readLine()!!.toInt() + 1
    val daftarBarang:Array<Int> = Array(barangMax){0}
    for(i in 1 until barangMax){
        print("pilih barang melalui kode yang tersedia $i: ")
        daftarBarang[i] = readLine()!!.toInt()
    }

    println("barang yang ingin anda pesan adalah: ")
    for(i in 1 until barangMax){
        println("barang $i kode: ${daftarBarang[i]}")
    }
    val jumlahBarang = barangMax - 1
    println("jumhlah barang yang anda pesan: $jumlahBarang")
///// akhir main kode

    println("apakah anda yakin?")
    val user = readLine()!!.toString()
    if (user == "ya"){
        println("terima kasih barang akan kami kirimkan")
    }else {
        println("silahkan cek kembali barang anda")

        println("masukan jumlah jenis barang yang ingin dipesan: ")
        val barangMax1 = readLine()!!.toInt() + 1
        val daftarBarang1: Array<Int> = Array(barangMax1) { 0 }
        for (i in 1 until barangMax1) {
            print("pilih barang melalui kode yang tersedia $i: ")
            daftarBarang1[i] = readLine()!!.toInt()
        }

        println("barang yang ingin anda pesan adalah: ")
        for (i in 1 until barangMax1) {
            println("barang $i kode: ${daftarBarang1[i]}")
        }
        val jumlahBarang1 = barangMax1 - 1
        println("jumhlah barang yang anda pesan: $jumlahBarang1")

        println("apakah anda yakin?")
        val user1 = readLine()!!.toString()
        if (user1 == "ya") {
            println("terima kasih barang akan kami kirimkan")
        }

    }




}