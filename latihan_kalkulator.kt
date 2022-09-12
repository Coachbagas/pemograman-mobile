fun main () {
    println("masukkan nama anda")
    var nama:String?= readLine()!!.toString()
    println("masukkan nilai pertama" )
    var np:Int?= readLine()!!.toInt()
    println("masukkan nilai kadua" )
    var nk:Int?= readLine()!!.toInt()

    println("hasil tambah = " +(np!!+nk!!))
    println("hasil kurang = " +(np!!-nk!!))
    println("hasil kali = " +(np!!*nk!!))
    println("hasil bagi = " +(np!!/nk!!))
}



