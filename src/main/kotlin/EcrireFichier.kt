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
// utile pour le tp
    val dossierCourant: File = File("./src/main/kotlin/")
    val fichierVide: File= File (dossierCourant, "vide.txt")
    val isCreated: Boolean =fichierVide.createNewFile()
    if(isCreated){
        println("Le fichier a été crée")
    }
    else {
        println("existe déja")

    }
    //alternative :File = File("vide.txt").writeText("") si on considere la racine comme le dossier parent

    //créer un fichier dans le dossierParent
    val dossierParent :File = dossierCourant.parentFile
    val fichierNom = File(dossierParent, "nomPrenom.txt")
    fichierNom.writeText("Harry Bour")
}