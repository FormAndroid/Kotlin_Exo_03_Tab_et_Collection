/*
 2) Réaliser un programme qui permet de détecter si un texte est un palindrome.
 NB: L'algorithme doit se baser sur l'utilisation de boucle et de collection.
 */

fun main() {

    print("Veuillez entrer un texte : ")
    val text: String = readLine()!!
    val textProcess = text.trim().lowercase()

    val sizeCheck: Int = textProcess.length / 2
    val maxIndex : Int = textProcess.length - 1

    var isPalindrom : Boolean = true

    var i: Int = 0
    while(isPalindrom && i < sizeCheck) {

        val charStart = textProcess[i]
        val charEnd = textProcess[maxIndex - i]

        if(charStart != charEnd) {
            isPalindrom = false
        }

        i++
    }

    print("Le texte « $text » ${if(isPalindrom) "est" else "n'est pas"} un palindrome")

//    val verb : String = if(isPalindrom) "est" else "n'est pas"
//    print("Le texte « $text » $verb un palindrome")
}