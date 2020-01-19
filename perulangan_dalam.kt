fun main(args: Array<String>)
{
    for (angka:Int 30..40)
    {
        println("angka: $angka")
        for (perulangan_dalam:Int 35..39)
        {
            println("perulangan_dalam: " + perulangan_dalam)
            if (perulangan_dalam:Int == 38)
            {
                break
            }
        }
    }
}