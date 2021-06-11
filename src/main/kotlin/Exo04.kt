/*
4) Sur base d'une liste de 10 valeurs de type String.
   Réaliser un algorithme qui permet de trier en ordre croissant.
   (Pour cet exercice, mettre en place un autre algorithme de trie)
   NB: Ne pas utiliser les fonctions de trie du langage.
*/

fun main() {

    // Valeur de la liste Hard-codé
    val names: List<String> = listOf("Riri", "Fifi", "Zaza", "Donald", "Della", "Balthazar", "daisy", "Archiblad", "Flagada", "Gustave")


    val sortNames: MutableList<String> = names.toMutableList()

    // Algo du trie a peigne
    var interval: Int = sortNames.size
    val facteurReduction : Double = 1.3

    while(interval > 1) {
        // - Reduction de l'interval
        interval = (interval / facteurReduction).toInt()

        // - Correction de l'interval, si celui-ci est inferieur à 1
        if(interval < 1) {
            interval = 1
        }

        // - Parcours des elements
        val limite = sortNames.size - interval
        for(i in 0 until  limite) {

            // - Comparaison
            if(sortNames[i].lowercase() > sortNames[i + interval].lowercase()) {

                // - Inversion
                val temp: String = sortNames[i]
                sortNames[i] = sortNames[i + interval]
                sortNames[i + interval] = temp
            }
        }
    }

    println(names.joinToString(" > "))
    println(sortNames.joinToString(" > "))


}