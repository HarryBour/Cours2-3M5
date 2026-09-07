package org.example

fun main() {
println(repete(4,2))
    println(repete(2,4))
    println(repete(3,4))
}
fun  repete(n: Int, nombreFois: Int) : List<Int> {
   val result = mutableListOf<Int>()

    for (nombre in 1..n) {
        for(repetition in 1..nombreFois) {
            result.add(repetition)
        }
    }
    return result
}