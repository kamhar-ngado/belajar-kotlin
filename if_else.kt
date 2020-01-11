fun main(args: Array<String>)
{
    print("masukan mahar: ")
    val mahar:Int = readLine()!!.toInt()

    if (mahar >= 15)
    println("lamaranmu diterima")

    if (mahar >= 9 && mahar <= 14 ) /*satuan juta */
    println("lamaranmu ditolak")
        else{
                println("coba lagi")
            }


   
}