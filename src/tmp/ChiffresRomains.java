package tmp;

public class ChiffresRomains {

    // Les "valeurs importantes" extraites du document [cite: 33, 34, 46]
    private static final int[] VALEURS = {
        1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    
    private static final String[] SYMBOLES = {
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String toChiffresRomains(int nbr) {
        // Itération 3 : Robustesse [cite: 11, 12]
        if (nbr <= 0 || nbr >= 4000) {
            throw new IllegalArgumentException();
        }

        StringBuilder resultat = new StringBuilder();
        int reste = nbr;

        // On parcourt les tableaux. Si le reste est >= à la valeur, on ajoute le symbole.
        for (int i = 0; i < VALEURS.length; i++) {
            while (reste >= VALEURS[i]) {
                resultat.append(SYMBOLES[i]);
                reste -= VALEURS[i];
            }
        }

        return resultat.toString();
    }
}