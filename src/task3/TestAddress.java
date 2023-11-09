package task3;

import java.util.StringTokenizer;

public class TestAddress {

    public static void testAddress() {
        String address1 = "Россия, Московская область, Москва, Мичуринский проспект, 31, 2, 37/3";
        getAddress(address1);

        String address2 = "Россия! Московская область! Москва! Мичуринский проспект! 31! 2! 37/3";
        getAddress(address2);

        String address3 = "Россия-= Московская область-= Москва-= Мичуринский проспект-= 31-= 2-= 37/3-=";
        getAddress(address3);

        String address4 = "Россия@@@### Московская область@@@### Москва@@@### Мичуринский проспект@@@### 31@@@### 2@@@### 37/3";
        getAddress(address4);
    }

    private static void getAddress(String address) {
        System.out.println(address);
        new Address(address).printAddress();
        System.out.println();
    }

}
