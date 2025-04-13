package StringMetoderJamie;

public class MinString {
    private String tekst;


    public MinString(String tekst) {
        this.tekst = tekst;
    }

    public char sidsteBogstavITekstStrengen (){ // Skal ikke have en parameter, når det kun er én attribut der skal bruges.
       char sidsteB;                            // Skulle den også bruge en teksstreng modtaget fra main klassen, så skal den
        sidsteB = tekst.charAt(tekst.length()-1);// have en String i parameteren
        return sidsteB;
    }
}
