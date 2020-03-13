fun main()
{
    println("Aplikasi pencatat nama pasien rumah sakit")
    println("")
    print("masukan nama depan: ")
    val namaDepan = readLine()!!.toString()

    print("masukan nama belakang: ")
    val namaBelakang = readLine()!!.toString()
    val namaLengkap = "$namaDepan $namaBelakang"

    println(namaLengkap.toUpperCase())
    println("Inisial: " + namaLengkap[0].toUpperCase() + "" + namaLengkap[1].toUpperCase())

    //pertanyaan untuk pasien
    val malarindu = "1. malarindu"
    val patahHati = "2. patah hati"
    val putusCinta = "3. putus cinta"
    val ditinggalPasangan = "4. ditinggal pasangan"
    val ditinggalMantan = "5. ditinggal mantan"

    println("")
    println("anda sakit apa?")
    println("$malarindu  $patahHati $putusCinta  $ditinggalPasangan  $ditinggalMantan")

    print("masukan jenis penyakit anda disini: ")
    val penyakit = readLine()!!.toString()
    println(penyakit)

    if (penyakit == "malarindu"){
        println("$penyakit obatnya adalah makan mi sedap")
    }else{
        println("$penyakit obatnya adalah minum cendol")
    }

}