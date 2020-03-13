fun main(){

    val msg = "welcome to my chanel"
    val nama = "   kamhar ngado"
    val allmsg = "$nama, $msg"

    println(allmsg[0])
    println(allmsg.toUpperCase())
    println(allmsg.toLowerCase())
    println(allmsg.trim())

    val listOfMath = msg.trim().split( "")
    for (tok in listOfMath){
        println(" $listOfMath")
    }
    for (vertikal in listOfMath){
        println(" $vertikal")
    }
    for (vertikal in listOfMath){
        if (!vertikal.contains( "hoax") && !vertikal.contains("to")){
            println("handsome: $vertikal")
        }
    }

}