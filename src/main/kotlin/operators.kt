class Kalkulator(_angka1: Int, _angka2: Int) {
    var angka1 = _angka1
    var angka2 = _angka2

    fun penjulahan(): Int {
        var hasil = angka1.plus(angka2)
        return hasil
    }

    fun pengurangan(): Int {
        var hasil_kurang = angka1.minus(angka2)
        return hasil_kurang
    }

    fun pembagian(): Int {
        var hasil_bagi = angka1.div(angka2)
        return hasil_bagi
    }

    fun perkalian(): Int {
        var hasil_kali = angka1.times(angka2)
        return hasil_kali
    }

    fun modulus(): Int {
        var hasil_modulus = angka1 % angka2
        return hasil_modulus
    }

}

fun main() {
    val menghitung = Kalkulator(10, 3)
    var hasil_jumlah = menghitung.penjulahan()
    println("Hasil Penjumlahan : $hasil_jumlah")
    var hasil_kurang = menghitung.pengurangan()
    println("Hasil Pengurangan : $hasil_kurang")
    var hasil_bagi = menghitung.pembagian()
    println("Hasil Pembagian : $hasil_bagi")
    var hasil_kali = menghitung.perkalian()
    println("Hasil Perkalian : $hasil_kali")
    var hasil_modulus = menghitung.modulus()
    println("Hasil Modulus : $hasil_modulus")
}