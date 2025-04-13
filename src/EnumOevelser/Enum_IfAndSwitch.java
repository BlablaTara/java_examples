package EnumOevelser;

public class Enum_IfAndSwitch {

    public static void main(String[] args) {

        Status s = Status.PENDING;

        if ( s == Status.RUNNING)
            System.out.println("All Good");
        else if (s == Status.FAILED)
            System.out.println("Try Again");
        else if (s == Status.PENDING)
            System.out.println("Please Wait");
        else
        System.out.println("Done");




        Status ss = Status.RUNNING;

        switch (ss){
            case RUNNING -> System.out.println("All Good");
            case FAILED -> System.out.println("Try Again");
            case PENDING -> System.out.println("Please Wait");
            default -> System.out.println("Done");
        }
    }
}
