fun main(args: Array<String>) 
{
    print("masukan nama:")
    val nama:String = readLine()!!.toString()
    print("masukan IPK:")
    val IPK:Double = readLine()!!.toDouble()
    print("masukan umur:")
    val umur = readLine()!!.toInt()
    

    println("====info====")
    println("Nama: $nama")
    println("IPK: $IPK")
    println("umur: $umur")


}
