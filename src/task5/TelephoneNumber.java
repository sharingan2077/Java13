package task5;

import org.jetbrains.annotations.NotNull;

class TelephoneNumber {

    private final String number;

    TelephoneNumber(String telephoneNumberAll) {
        StringBuilder numberBuilder = new StringBuilder();
        numberBuilder.append('+');
        int index = 0;
        if (telephoneNumberAll.charAt(0) != '+') index = -1;

        //Country code
        numberBuilder.append(Integer.parseInt(String.valueOf(telephoneNumberAll.charAt(1)))+ index);
        //First three numbers
        numberBuilder.append(telephoneNumberAll.charAt(2 + index));
        numberBuilder.append(telephoneNumberAll.charAt(3 + index));
        numberBuilder.append(telephoneNumberAll.charAt(4 + index));
        numberBuilder.append('-');
        //Second three numbers
        numberBuilder.append(telephoneNumberAll.charAt(5 + index));
        numberBuilder.append(telephoneNumberAll.charAt(6 + index));
        numberBuilder.append(telephoneNumberAll.charAt(7 + index));
        numberBuilder.append('-');
        //Last four numbers
        numberBuilder.append(telephoneNumberAll.charAt(8 + index));
        numberBuilder.append(telephoneNumberAll.charAt(9 + index));
        numberBuilder.append(telephoneNumberAll.charAt(10 + index));
        numberBuilder.append(telephoneNumberAll.charAt(11 + index));
        this.number = numberBuilder.toString();

    }
    void printNumber() {
        System.out.println(number + "\n");
    }


}
