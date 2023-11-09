package app;

import task1.Operations;
import task2.PersonTest;
import task3.TestAddress;
import task4.TestShirt;
import task5.TelephoneNumberTest;

public final class App {
    public static void executeFirstTask() {
        Operations.startTask();
    }
    public static void executeSecondTask() {
        PersonTest.testPerson();
    }
    public static void executeThirdTask() {
        TestAddress.testAddress();

    }
    public static void executeFourthTask() {
        TestShirt.testShirt();
    }
    public static void executeFifthTask() {
        TelephoneNumberTest.testNumber();
    }
    public static void executeSixthTask() {

    }


}
