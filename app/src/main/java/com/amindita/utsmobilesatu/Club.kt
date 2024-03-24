package com.amindita.utsmobilesatu

data class Club(
    val name: String,
    val lpi: Int,
    val fa: Int,
    val efl: Int,
    val lce: Int,
    val leu: Int,
) {
    val totalTrophy: Int
        get() = lpi + fa + efl + lce + leu
}

// extension function recap
fun Club.recap(): String {
    val recap = StringBuilder()
    recap.append("=> ${this.name} berhasil meraih ${this.lpi} trofi Liga Primer Inggris, ${this.fa} trofi FA,\n ")
    recap.append("  ${this.efl} trofi EFL, 6 trofi Liga Champions, dan ${this.leu} trofi Liga Eropa UEFA.")
    return recap.toString()
    println()
    println()
}