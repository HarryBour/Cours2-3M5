package org.example

fun main (args: Array<String>) {
    if (args.isEmpty()) {
        println("Vous devez fournir des arguments en ligne de commande")
        return
    }
    for (arg in args){
        val hauteur: Int = arg.toInt()
        afficherPyramide(hauteur)
    }


}

 fun afficherPyramide(hauteur: Int) {

    var nbEtoiles: Int = 1
    var nbEspaces: Int = hauteur - 1
    var ligne: String = ""
    for (i: Int in 1..hauteur) {
        ligne = " ".repeat(nbEspaces) + "*".repeat(nbEtoiles)
        println(ligne)
        nbEtoiles += 2
        nbEspaces -= 1
    }
}

