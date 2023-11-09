package task5;

public final class TelephoneNumberTest {

    public static void testNumber() {
        String number1 = "+79406998900";
        String number2 = "89405552345";
        String number3 = "+19405552345";
        initNumber(number1);
        initNumber(number2);
        initNumber(number3);


    }
    private static void initNumber(String number) {
        System.out.println("Исходный номер телефона " + number);
        System.out.println("Полученный номер телефона:");
        new TelephoneNumber(number).printNumber();
    }
}
