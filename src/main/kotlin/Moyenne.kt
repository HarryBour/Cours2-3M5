package org.example
import kotlin.random.Random

fun main(args: Array<String>) {
val n = args[0].toInt()
    val tableau = creeTableauAleatoire(n)
    println("Tableau généré : ${tableau.joinToString { ", " }}")
    afficherStats(tableau)
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    return Array(n) { Random.nextInt(0,101) }
}

fun afficherStats(tableau: Array<Int>) {
    val somme = tableau.sum()
    val moyenne = somme.toDouble()
    val min = tableau.min()
    val max = tableau.max()

    println("Somme : $somme")
    println("Moyenne : $moyenne")
    println("Minimum : $min")
    println("Maximum : $max")
}
