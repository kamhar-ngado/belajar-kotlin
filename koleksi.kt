//imutable tidak bisa update nilai
//mutable bisa mengapdate nilai


fun main() {
    val listImutable = listOf("kamhar, kamal")
    //listImutable[1] = "handsome"
    for (nama in listImutable) {
        println(nama)
    }

    val listMutable = mutableListOf("handsome, tamvan")
    listMutable[0] = "kamhar, tamvan"
    for (nama in listMutable) {
        println(nama)
    }


}