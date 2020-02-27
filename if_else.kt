fun main(args: Array<String>){
    print("uang saya: ")
    val harga_laptop:Int = readLine()!!.toInt()
    if (harga_laptop >=26 && harga_laptop <= 29)
    {
        print("saya beli asus scar III hero")
    }
    else if (harga_laptop in 22..25)
    {
        println("saya akan beli Lenovo Y740")
    }
    else if (harga_laptop in 18..21)
    {
        println("saya akan beli laptop HP Pavilon")
    }
    else if (harga_laptop in 14..17)
    {
        println("saya akan beli laptop asus tuf")
    }
    else
    {
        println("saya tidak beli laptop")
    }

}