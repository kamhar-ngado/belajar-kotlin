fun main(args: Array<String>)
{
    println("contoh continue")
    println("di bawah ini adalah bilangan bilangan prima")
    for (bilangan_prima:Int in 1..10)
    {
        if (bilangan_prima%2 == 0)
            {
                continue
            }
            println(bilangan_prima)
    }

    println("contoh Break")
    println("dibawah ini adalah bilangan bulat")
    for (bilangan_bulat:Int in 11..20)
    {
        if (bilangan_bulat >=17 && bilangan_bulat < 20)
        {
            break
        }
        println(bilangan_bulat)
    }
}