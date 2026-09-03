package org.example

fun main() {
    val genes = mutableSetOf("BRACA1", "TP53", "EGFR")
    println("Set initial: $genes")

    genes.add("TP53")
    println("Set après ajout d'un double : $genes")

    val geneMap = genes.associateWith { it.length }
    println("Map : $geneMap")

    val cleInexistante=geneMap["MYC"]
    println(" valeur pour la cle MYC: $cleInexistante")

    val geneList = geneMap.keys.toList()
    val sortedGeneList= geneList.sortedWith(
        compareBy<String> ({ it.length } ,{ it }))
    println("Liste triée : $sortedGeneList")

}