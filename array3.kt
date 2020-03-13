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
    if (user == "ya") {
        println("terima kasih barang akan kami kirimkan")

    } else {

        val daftarBarang1 = ArrayList<String>()
        do{
            print("barang: ")
            val namaBarang1 = readLine()!!.toString()
            if (namaBarang1 !="keluar"){
                daftarBarang1.add(namaBarang1)
            }
        }while (namaBarang1 !="keluar")
    }



}