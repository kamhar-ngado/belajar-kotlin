

//fun sum(angka1:Int, angka2:Int):Int{
//    return angka1 + angka2
//}

val sum = {angka1:Int, angka2:Int ->
angka1 + angka2}

fun main() {
   val addAngka = sum(1, 2)
    println(addAngka)

    println("")
    println("menggunakan for loop")
    val bilanganPrima = listOf(2, 3, 5, 7, 11, 13)
    for (num in bilanganPrima) {
        println(num)
    }
    println("")
    println("menggunakan ekspressi lambda")

    bilanganPrima.forEach {angka ->
        println(angka)
    }


}