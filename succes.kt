fun main(args:Array<String>) {
    val noSuccess = readLine()!!.toInt()
    val success = 100
    val aim = "I am an android programmer"
    for (myLife in 0 until success) {
        if (noSuccess in 0..50) {
            println("try again")
        } else {
            println("$aim $success% ")
        }
    }
}