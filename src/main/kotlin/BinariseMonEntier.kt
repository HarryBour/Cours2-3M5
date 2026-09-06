package org.example

fun main (args: Array<String>) {
    if (args.isEmpty())
    {
        println("Erreur: vous devez fournir un entier en ligne de commande.")
        return
    }
try {
    val nombre = args[0].toInt()
    val binaire = nombre.toString(2)

    println(binaire)
}
catch (e: Exception) {
    println("Erreur = `${args[0]}` n'est pas un entier valide")
}



}