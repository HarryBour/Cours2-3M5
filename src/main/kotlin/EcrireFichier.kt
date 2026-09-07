package org.example

import java.io.File

fun main(){
   try {
       val fichierVide = File("vide.txt")
       fichierVide.writeText("")

       val fichierNom =File("../nom.txt")
        fichierNom.writeText("Harry Bour")
       println("Les fichiers ont étés crées")
       println("Fichier créé ici : ${fichierNom.absolutePath}") // pour voir fichier parent nom.txt

   }
   catch (e: Exception){
    println("Les fichiers ne peuvent pas êtes crées: ${e.message}")
   }


}