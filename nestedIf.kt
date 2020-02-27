fun main(){
    print("masukan nilaimu")
    val nilai:Int = readLine()!!.toInt()

    if(nilai >= 90){
        if(nilai > 93){
        println("A+")
        }else{
                println("A-")
        }
    }

    else if(nilai in 80..89){
        if(nilai > 85){
            println("B+")
        }else{
            println("B-")
        }
    }

    else if(nilai 70..79){
        println("C")
    }else{
        println("kamu gagal")
    }


}