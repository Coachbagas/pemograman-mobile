fun main() {
    try {
        print("Masukkan angka pertama: ")
        val angka1 = readLine()!!.toInt()
        print("Masukkan angka kedua: ")
        val angka2 = readLine()!!.toInt()
        print("Masukkan angka ketiga: ")
        val angka3 = readLine()!!.toInt()
        print("Masukkan aksi operasi - Tambah(a), Kurang(d), Perkalian(b), Pembagian (c): ")
        when (readLine()) {
            "a" -> {
                print("Hasil = ${angka2+angka3}")
            }
            "d" -> {
                print("Hasil = ${angka3-angka1}")
            }
            "b" -> {
                print("Hasil = ${angka2/angka3}")
            }
            "c" -> {
                print("Hasil = ${angka1*angka3}")
            }
            else -> {
                print("Operasi yang dimasukkan tidak valid")
            }
        }
    } catch (e: Exception){
        print("Angka yang dimasukkan tidak valid")
    }
}