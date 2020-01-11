fun main(args: Array<String>)
{
    print("apakah kamu jomblo? ")
    val jomblo:Boolean = readLine()!!.toBoolean()
    print("masukan IQ anda: ")
    val IQ:Int = readLine()!!.toInt()

    val ketampanan = if (jomblo && IQ <= 120)
    1 else 0
    println("ketampanan saya adalah " + ketampanan)

    val Amazing = when (IQ)
    {
        100 -> true
        else -> false
    }
    println("apakah saya Amazing? " + Amazing)
}