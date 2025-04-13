package StringMetoderJamie;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        MinString minString = new MinString("Hellooo");
        MitTal mitTal = new MitTal(14);
        MitTal mitTal1 = new MitTal(35);
        System.out.println(mitTal.slårMitTalDetModtagendeTal(34));

        System.out.println(mitTal.hvadErMitTalPlusDetModtagendeTal(16));
        System.out.println(mitTal1.hvadErMitTalPlusDetModtagendeTal(45));

        System.out.println(minString.sidsteBogstavITekstStrengen());
    }
}
