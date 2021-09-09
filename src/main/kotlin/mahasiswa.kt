class Mahasiswa(_nama: String, _nim: String = "1821400092", _prodi: String = "Informatika") {
    val nim = _nim
    val nama = _nama
    val prodi = _prodi

    fun tampil() {
        println("~ Data Mahasiswa ~")
        println("Nama Mahasiswa : $nama")
        println("NIM : $nim")
        println("Prodi : $prodi")
    }
}

fun main() {
    val karim = Mahasiswa("Abdul Karim")
    karim.tampil()
}