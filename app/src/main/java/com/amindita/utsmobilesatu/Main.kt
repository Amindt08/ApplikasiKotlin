package com.amindita.utsmobilesatu

fun main() {
    //Identitas
    println("2A_233307002_Amindita Maestri")
    println()

    // Inisialisasi mutableList dan tambah data List
    val clubs = mutableListOf<Club>(
    Club("Liverpool", 19, 8, 9, 6, 3),
    Club("Manchester United", 20, 12, 6, 3, 1),
    Club("Chelsea", 6, 6, 5, 2, 2),
    Club("Manchester City", 8, 8, 8, 0, 0),
    Club("Arsenal", 13, 14, 2, 0, 0))

    // High order function filter and sort
    fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
        return options(clubs)
    }

    // Fungsi sorting
    fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
        val sortedClubs = clubs.sortedByDescending {
            it.totalTrophy
        }
        return sortedClubs
    }

    // Fungsi filter
    fun filterByEuropeanTrophy(clubs: List<Club>): List<Club> {
        val filteredClubs = filterAndSort(clubs) {clubs ->
            clubs.filter { club -> !(club.leu > 0 || club.lce > 0)}
        }
        return filteredClubs
    }

    // Passing a named function ::sortByNumberTrophyTotal
    val sortedClubs = sortByNumberTrophyTotal(clubs)

    // Hasil sorting total trofi
    println("+++++++++++++++++++++++++++++++++++++++++++++++")
    println("Urutan klub berdasarkan jumlah total trofi: ")
    println("+++++++++++++++++++++++++++++++++++++++++++++++")
    for (club in sortedClubs) {
        println("=> ${club.name} : (${club.totalTrophy})")
    }
    println()
    println()

    // Passing a named function ::filterByEuropeanTrophy
    val filteredClubs = filterByEuropeanTrophy(clubs)
    // Hasil sorting total trofi
    println("+++++++++++++++++++++++++++++++++++++++++++++++")
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    println("+++++++++++++++++++++++++++++++++++++++++++++++")
    for (club in filteredClubs) {
        println("${club.name}")
    }
    println()
    println()

    // Panggil extension function Club recap
    println("+++++++++++++++++++++++++++++++++++++++++++++++")
    println("Recap perolehan trofi club: ")
    println("+++++++++++++++++++++++++++++++++++++++++++++++")
    for (club in clubs) {
    println(club.recap())
    }
}

