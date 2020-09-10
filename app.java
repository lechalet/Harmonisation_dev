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