import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* a) Veuillez initialiser un ensemble de String nommé colors : Rouge, Cyan, Bleu et Vert */

        Set<String> colors;
        Collections.addAll(
                colors = new HashSet<String>(), "Rouge", "Cyan", "Bleu", "Vert");

        System.out.println(colors);

        /* b) Supprimez la couleur Rouge */

        colors.remove("Rouge");

        System.out.println(colors);

        /* c) Initialisez un ensemble de String nommé others : Jaune, Magenta */

        Set<String> others;
        Collections.addAll(
                others = new HashSet<String>(), "Jaune", "Magenta");

        System.out.println(others);

        /* d) Ajoutez l’ensemble others dans l’ensemble colors */

        colors.addAll(others);

        System.out.println(colors);

        /* e) Recherchez une fonction spécifique de suppression qui s’exécute si une condition est
        vraie. Supprimez la couleur Vert. */

        colors.remove("Vert");

        System.out.println(colors);

        /* f) Au sein de colors, effectuez une suppression de tous les éléments contenus par others */

        colors.removeAll(others);

        System.out.println(colors);

        /* g) Videz les ensembles colors et others */

        colors.clear();
        others.clear();

        System.out.println(colors);
        System.out.println(others);

    }
}