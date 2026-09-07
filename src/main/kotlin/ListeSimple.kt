package org.example

fun main() {
println(repete(4,2))
    println(repete(2,4))
    println(repete(3,4))
}
fun  repete(n: Int, nombreFois: Int) : List<Int> {
   val result = mutableListOf<Int>() // crée la variable résultat et le déclare comme une listemutable de nombre entiers

    for (nombre in 1..n) // nombre répété à la liste
    {
        for(repetition in 1..nombreFois) // nombre ajouté à la liste
        {
            result.add(repetition) // répete et ajoute le nombre ajouté
        }
    }
    return result
}