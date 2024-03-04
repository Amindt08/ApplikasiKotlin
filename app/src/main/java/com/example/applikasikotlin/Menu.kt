package com.example.applikasikotlin

class Menu (var makanan: String, var minuman: String, var hargaMakanan: Int, var hargaMinuman: Int) {

    fun updateMakanan (newMakanan: String){

    }
    fun updateMinuman (newMinuman: String){

    }
}

class Pembeli (var nama: String, var jumlahPesanan: Int, var totalHarga: Int){
}

fun main(){
    val myMenu = Menu ("Ayam Geprek", "Es Teh", 12000, 3000)
    val myPembeli = Pembeli ("Amin", 2, 15000)
    println("Pesanan atas nama ${myPembeli.nama} telah memesan item sebanyak ${myPembeli.jumlahPesanan} item")
    println("yaitu ${myMenu.makanan} dengan harga Rp ${myMenu.hargaMakanan} dan ${myMenu.minuman} dengan harga Rp ${myMenu.hargaMinuman} ")
    println("total harga pembelian 2 item Ayam Geprek dan Es Teh berjumlah Rp ${myPembeli.totalHarga}")
}