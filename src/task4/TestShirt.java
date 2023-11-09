package task4;

public final class TestShirt {

    private static Shirt[] shirts;
    private static final int size = 11;


    public static void testShirt() {
        initShirts();
        for (Shirt i : shirts) {
            i.printShirt();
        }

    }

    private static void initShirts() {
        shirts = new Shirt[size];
        shirts[0] = new Shirt("S001,Black Polo Shirt,Black,XL");
        shirts[1] = new Shirt("S002,Black Polo Shirt,Black,L");
        shirts[2] = new Shirt("S003,Blue Polo Shirt,Blue,XL");
        shirts[3] = new Shirt("S004,Blue Polo Shirt,Blue,M");
        shirts[4] = new Shirt("S005,Tan Polo Shirt,Tan,XL");
        shirts[5] = new Shirt("S006,Black T-Shirt,Black,XL");
        shirts[6] = new Shirt("S007,White T-Shirt,White,XL");
        shirts[7] = new Shirt("S008,White T-Shirt,White,L");
        shirts[8] = new Shirt("S009,Green T-Shirt,Green,S");
        shirts[9] = new Shirt("S010,Orange T-Shirt,Orange,S");
        shirts[10] = new Shirt("S011,Maroon Polo Shirt,Maroon,S");
    }

}
