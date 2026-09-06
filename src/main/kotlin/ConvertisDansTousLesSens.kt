package org.example

fun main() {
    val entier = 10
    val entierFloat = entier.toFloat()

    println("Int vers Float :")
    println("$entier devient $entierFloat")

    val decimal = 12.25
    val decimalversEntier = decimal.toInt()
    println("decimal vers entier : ")
    println("$decimal devient $decimalversEntier")
    println("La partie après la virgule est supprimée")

    val string= "123"
    val stringEnInt = string.toInt()

    println("string vers Int:")
    println("$string devient $stringEnInt")

    val stringInvalide= "123abc"
    val resultat = stringInvalide.toIntOrNull()

    if (resultat == null) {
        println("La chaîne de caractère fournis est invalide")
    }
    else{
        println(resultat)
    }

    val nombre = 10
    val nombreEnString = nombre.toString()
    println("nombre en string: ")
    println("$nombre devient \"$nombreEnString\"")

    val flottant = 3.14f
    val flottantDouble = flottant.toDouble()
    println("flottant en double:")
    println("$flottant devient $flottantDouble")




}