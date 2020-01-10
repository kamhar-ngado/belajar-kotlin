import java.util.*

fun main(args: Array<String>)
{
    print("tahun berapa kamu lahir: ")
    val birthday:Int = readLine()!!.toInt()
    val kalender = Calendar.getInstance().get(Calendar.YEAR)
    val umur:Int = kalender - birthday

    print("umur kamu $umur tahun")

}