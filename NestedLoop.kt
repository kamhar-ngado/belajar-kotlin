fun main(args: Array<String>)
{
    var nama2_mantan = arrayOf("bunga", "mawar", "melati", "dan myBeb")
    for (mantan in nama2_mantan.indices)
    {
        if (mantan%1 == 0)
            println(nama2_mantan[mantan])
    }
}