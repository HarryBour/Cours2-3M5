package org.example

fun main(args: Array<String>){
   if(args.isEmpty())
   {
       println("Vous devez fournir une chaîne de caractère")
       return
   }
    val chaine: String = args[0]

    for (caractere in chaine){
        println(caractere)
    }
}