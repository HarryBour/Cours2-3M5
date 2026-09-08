package org.example

fun main (){
    var map : Map<String, Int> = mapOf("on" to 4, "me" to 4, "voit" to 4, "plus" to 2)
    println(map)

    for (k: String in map.keys) { // 2E FAÇON D'AFFICHER EN SAUTANT DES LIGNES
        println("${k} = ${map[k]}")
    }
}