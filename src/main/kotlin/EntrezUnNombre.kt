package org.example

fun main() {
    var question = "Veuillez entrer un nombre : "
    while (true){
    println(question)
        var reponse: String = readln()
       var nombre = reponse.toIntOrNull()
        if (nombre != null)
        {
            println("Merci votre nombre est : $nombre")
            return
        }
        else {
            println("Ceci n'est pas un nombre, veuillez entrer un nombre : ")
        }
    }
}