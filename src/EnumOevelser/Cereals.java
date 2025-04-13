package EnumOevelser;

public enum Cereals {
    CAPTAIN_CRUNCH(50, 59.99),
    FROOT_LOOPS(60, 25.75),
    REESES_PUFFS(35, 9.95),
    COCOA_PUFFS(100, 49.99);

    //kan have atributter ligesom andre java klasser.

    final int levelOfDeliciousness; //Final, så man ikke kan ændre dem
    final double price;

    //Enum konstruktør: WOW
    Cereals (int levelOfDeliciousness, double price){
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }

    //Nu har vi igennem kostruktøren skrevet at vores enums skal indeholde en int.

}
