package Throws_CostumExceptionDemo;

public class CustomEx {
    public static void main(String[] args) throws AgeLessThanZeroException {
        new CustomEx().run();
    }

    private void run() throws AgeLessThanZeroException {
        validateAge(3);

    }

    // hvis man valgte en normal Excenption, kunne vi være heldig at den
    //faktisk kunne være tæt på at gøre det vi vil have den til
    //men for at være sikker, laver vi vores egen.

    private void validateAge (int age) throws AgeLessThanZeroException {
        if (age < 0){
            throw new AgeLessThanZeroException();

        }
    }

    //Lav en class med din nye exception. Skal hedder
    // det som din exception vil gøre + exception.
}
