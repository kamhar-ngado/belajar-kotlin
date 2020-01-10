fun main(args: Array<String>)
{
   
   print("masukan nilai x:")
   var x:Int = readLine()!!.toInt()
   print("masukan nilai y:")
   var y:Int = readLine()!!.toInt()

   println("nilai x dan y akan menjadi ($x, $y)")

   println("nilai x dikurangi 1 dan nilai y dikurangi 2")
   x -= 1
   y -= 2 

   println("($x, $y)")

}