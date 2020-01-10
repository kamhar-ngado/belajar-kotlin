fun main(args: Array<String>)
 {
    var angka1:Int = 10
    var angka2:Int = 20

    var temp:Int = angka1
    angka1 = angka2
    angka2 = temp

    println("pada mulanya (10, 20, ...n)")
    println("saya akan menukar angka1 menjadi angka2 dan sebaliknya")
    println("($angka1, $angka2, ...n)")
}
