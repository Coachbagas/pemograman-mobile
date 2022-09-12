fun main (){
    println("masukkan nama lengkap anda")
    val nama:String? = readLine()

    println("nama lengkap anda adalah =  $nama")

    println("masukkan nilai uts")
    val uts: Int = readLine()!!.toInt()
    println("masukkan nilai uas")
    val uas: Int = readLine()!!.toInt()

    val NA : Double=(0.4 * uts) + (0.6 * uas)

    if (NA > 80) {
        println("selamat anda naik semester")
    }
    else
        println("anda cuti")
}