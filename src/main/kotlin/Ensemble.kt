package org.example

fun main(args: Array<String>){
    val motsUniques: Set<String> = args.toSet()
    val motsTriés :List<String> = motsUniques.sorted()
    for(mot in motsTriés)
    {
        println(mot)
    }
}