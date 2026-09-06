package org.example

import org.jsoup.Jsoup

fun main(args: Array<String>) {
    if(args.isEmpty()){
        println("Erreur : vous devez fournir un url en ligne de commande")
        return
        }
    var url = args[0]

    try {
        val document = Jsoup.connect(url).get()
        println(document.title())
    }
    catch (e: Exception){
    println("Impossible d'accéder au site : ${e.message}")
    }
}