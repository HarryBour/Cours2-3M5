package org.example

fun main (){
    val nombres = listOf(10, 20, 30, 40)

    println(trouveALaMain(20, nombres))
    println(trouveALaMain(50, nombres))

    println(trouve(20, nombres))
    println(trouve(50, nombres))

    println(compteALaMain(10, nombres))
    println(compteALaMain(20, nombres))
    println(compteALaMain(50, nombres))

    println(compte(10, nombres))
    println(compte(20, nombres))
    println(compte(50, nombres))




}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean {
    for (nombre in liste) {
    if (nombre == element) {
        return true
    }
    }
    return false
}
fun trouve(element: Int, liste: List<Int>): Boolean {
    return liste.contains(element)
}

fun compteALaMain(element: Int, liste: List<Int>): Int{
    var compteur = 0
    for (nombre in liste) {
        if (nombre == element) {
            compteur++

        }
    }
    return compteur
}
fun compte(element: Int, liste: List<Int>): Int{
    return liste.count { it == element }
}