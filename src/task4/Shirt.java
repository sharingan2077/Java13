package task4;

final class Shirt {

    private String number;
    private String type;
    private String color;
    private String size;

    void setNumber(String number) {
        this.number = number;
    }

    void setType(String type) {
        this.type = type;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSize(String size) {
        this.size = size;
    }

    String getNumber() {
        return number;
    }

    String getType() {
        return type;
    }

    String getColor() {
        return color;
    }

    String getSize() {
        return size;
    }

    Shirt(String number, String type, String color, String size) {
        this.number = number;
        this.type = type;
        this.color = color;
        this.size = size;
    }
    Shirt(String model) {
        String[] modelArr = model.split(",");
        number = modelArr[0];
        type = modelArr[1];
        color = modelArr[2];
        size = modelArr[3];
    }

    @Override
    public String toString() {
        return "Number - " + number
                + "\nType - " + type
                + "\nColor - " + color
                + "\nSize - " + size;
    }
    void printShirt() {
        System.out.println(this + "\n");
    }
}
