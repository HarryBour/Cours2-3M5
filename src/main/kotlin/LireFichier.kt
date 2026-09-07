package org.example

import java.io.File

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Veuillez fournir un nom de fichier.")
        return
    }

    val fichier1 = File(args[0])

    if (fichier1.exists()) {
        try {
            var texte =fichier1.readText()
            println(texte)
            val liste1: List<String> = fichier1.readLines()

            println(liste1)

            val texte2 = liste1.joinToString("-------------")
            println(texte2)
        } catch (e: Exception) {
            println("Le fichier $fichier1 ne peut pas être lu.")
        }
    } else {
        println("Le fichier $fichier1 n'existe pas.")
    }
}