package tmp;

public class ChiffresRomains {

    public ChiffresRomains() {
        super();
    }

    public String toChiffresRomains(int nbr) {
        if (nbr <= 0 || nbr >= 4000) {
            throw new IllegalArgumentException();
        }

        String resultat = "";
        int reste = nbr;

        if (reste >= 5) {
            resultat += "V";
            reste -= 5;
        }

        if (reste == 4) {
            resultat += "IV";
            reste -= 4;
        }

        while (reste >= 1) {
            resultat += "I";
            reste -= 1;
        }

        return resultat;
    }
}