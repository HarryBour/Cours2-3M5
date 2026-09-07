package org.example

fun main() {
val nombre= listOf(0.1, 12.34, -0.1234, 3.1416)
    println(nombre)
    println(triInverseALaMain(nombre))
    println(triInverse(nombre))
}

fun triInverseALaMain(liste: List<Double>): List<Double> {
    val listeInversee = mutableListOf<Double>() // déclaration d'une liste mutable pour une boucle

    for (index in liste.size - 1 downTo 0) { //pour faire inversement avec boucle
        listeInversee.add(liste[index])
    }

    return listeInversee
}
fun triInverse(liste: List<Double>): List<Double> {
    val listeInvese = liste.reversed() // fonction reverse pour faire l'ordre inversé, plus simple que la boucle
    return listeInvese
}