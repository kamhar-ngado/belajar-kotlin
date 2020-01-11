fun main(args: Array<String>)
{
    print("apakah kamu jomblo? ")
    val jomblo:Boolean = readLine()!!.toBoolean()
    print("masukan IQ anda: ")
    val IQ:Int = readLine()!!.toInt()

    val ketampanan = if (jomblo || IQ >= 120 && IQ <= 200)
    1 else 0
    println("ketampanan kamu adalah " + ketampanan + " dari 10")

    val Amazing = when (IQ)
    {
        100 -> true
        else -> false
    }
    println("apakah kamu Amazing? " + Amazing)
}