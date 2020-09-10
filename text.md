# Harmonisation developpement

## Exercice Algo Nano dico

### Décrire l'algorithme qui permettra de trier une liste de mots simple, sans doublons

L'algorithme expliqué plus bas permettre de trier une liste de mot d'un tableau par ordre Alphabétique. De plus il va permettre de supprimer les doublons de cette même liste.

### Ecrire le pseudo code correspondant à cet algorithme

``` 
// Déclaration du tableau à trier
words[a, b, c, d ...] 
// Déclaration du nouveau tableau trié (alphabétique) et sans doublons avec le même nombre d'entité
sortWords[] = word.length
// On tri le tableau words 
Arrays.sort(words)
// On supprime les doublons en faisant une première boucle sur le premier tableau
for( i<words.length alors i ++)
// Dans cette boucle on affecte dans le nouveau tableau les valeur uniquement différentes du premier tableau
for( j<sortWords.length alors j++)
    if (word[i]) !=sortWords[j] alors sortWords[i] = words[i] sinon on arrête
// On affiche le résultat
System.out.printls("la nouvelle liste de mot trié est : " + Arrays.toString(sortWords)
```

### Implémentation en Java 
```
import java.util.Arrays;

class app {

    public static void main(String[] args) {

        String[] words = { "voiture", "camion", "vélo", "avion", "avion" };
        String[] newWords = new String[words.length];

        // On trie le tableau
        Arrays.sort(words);

        // On supprime les doublon
        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < newWords.length; j++) {
                if (words[i] != newWords[j]) {
                    newWords[i] = words[i];
                } else {
                    break;
                }
            }
        }
        // On affiche le résultat
        System.out.println("newWords : " + Arrays.toString(newWords));
    }
}
