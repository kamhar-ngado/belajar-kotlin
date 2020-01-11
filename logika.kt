/*dasar-dasar logika
kurang dari (<)
lebih dari (>)
sama dengan (==)
kurang dari sama dengan (<=)
lebih dari sama dengan (>=)
tidak sama dengan (!=)

===logika and (&&)===
True && True = True
True && False = False
False && True = False
False && False = False

===logika or (||) ====
True || True = True
True || False = True
False || True = True
False || False = False
 */

fun main(args: Array<String>)



{
println("logika sederhana bagian 1")
    val a:Boolean = 7>5
    val b:Boolean = 5<8
    val c:Boolean = 2==2
    val d:Boolean = 2!=3

    println(b)
    println(a)
    println(c)
    println(d)

println("logika sederhana bagian 2")
val f:Boolean = 5>3
val g:Boolean = 6>=7
val h:Boolean = 8<=9
val i:Boolean = 11>=15

println( f && g)
println(h || i)

}