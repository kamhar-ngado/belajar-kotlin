fun main(args:Array<String>){

    val noSuccess = readLine()!!.toInt()
    val success = 100

    for (myLife in 0 until success){
        println("I am an android programmer")
        if (noSuccess in 0..50){
            println("try again")
        }
        else{
            println(success)
        }
    }
}