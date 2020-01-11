fun main(args: Array<String>)
{
    val jomblo = false
    val IQ = 200

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