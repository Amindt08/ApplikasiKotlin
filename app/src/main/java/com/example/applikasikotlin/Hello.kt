package com.example.applikasikotlin

fun main() {
    println("[======================== T E N T A N G   S A Y A ========================]") //Judul halaman

    saya("Mahasiswi", "Politeknik Negeri Madiun", "D-III Teknologi Informasi", "dua")
    bio("Amindita Maestri", "Madiun, 30 Agustus 2004", 20, "Balerejo, Madiun",
        "877-0028-8011", "amindtmstr@gmail.com") //Data informasi pribadi
    hobi("menggambar", "Hal itu \n" +
            "    dikarenakan perubahan teknologi yang semakin maju yang membuat saya \n" +
            "    lebih suka mempelajari hal baru. Juga karena saya mengambil prodi TI \n" +
            "    yang membuat saya sering mengoperasikan komputer.") //Jenis hobi dan deskripsinya

}
fun saya(status:String, univ:String, prodi:String, semester:String){

    val saya ="""
        Saya adalah $status semester $semester $univ 
        dari Program Studi $prodi 
    """.trimIndent()
    println(saya)
}

fun bio(nama:String, TTL:String, umur: Int, alamat:String, no:String, email:String){ //function biodata

    val bio ="""
  ---------------------------------------------------------------------------
  # Informasi Pribadi 
  ---------------------------------------------------------------------------
    Nama Lengkap   : $nama
    TTL            : $TTL
    Umur           : $umur tahun
    Alamat         : $alamat
    No. HP         : +62 $no
    E-mail         : $email
    """.trimIndent()
    println(bio) //Cetak nilai biodata
}

fun hobi(jenis:String, desc:String){ //function hobi
    val hobi = """
  ---------------------------------------------------------------------------
  # Hobi dan Kesukaan
  ---------------------------------------------------------------------------
    Sejak kecil saya suka sekali $jenis di kertas. Namun, setelah dewasa 
    saya menjadi lebih suka $jenis dan membuat desain digital. $desc
    """.trimIndent()
    println(hobi) //Cetak nilai hobi
}

