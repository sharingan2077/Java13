package task3;

class Address {

    protected String country;
    protected String region;
    protected String city;
    protected String street;
    protected String house;
    protected String frame;
    protected String apartment;

    Address(String address) {
        String separator = getSeparator(address);
        String[] arrAddress = address.split(separator);
        this.country = arrAddress[0];
        this.region = arrAddress[1];
        this.city = arrAddress[2];
        this.street = arrAddress[3];
        this.house = arrAddress[4];
        this.frame = arrAddress[5];
        this.apartment = arrAddress[6];
    }
    final void printAddress() {
        System.out.println(this);
    }

    private String getSeparator(String address) {
        StringBuilder separator = new StringBuilder();
        char symbol;
        for (int i = 0; i < address.length(); i++) {
            symbol = address.charAt(i);
            if (symbol != ' ') {
                if ((symbol < 'A' || symbol > 'Z' && symbol < 'a' || symbol > 'z') &&
                        (symbol < 'А' || symbol > 'я') &&
                        (symbol < '0' || symbol > '9')) {
                    separator.append(symbol);
                }
            }
            else break;
        }
        return separator + " ";
    }


    @Override
    public final String toString() {
        return "Адрес:" +
                "\nСтрана - " + country +
                "\nРегион - " + region +
                "\nГород - " + city +
                "\nУлица - " + street +
                "\nДом - " + house +
                "\nКорпус - " + frame +
                "\nКвартира - " + apartment;
    }
}
