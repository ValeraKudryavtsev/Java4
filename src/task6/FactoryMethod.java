package task6;

public class FactoryMethod {
    public static void main(String[] args) {
        CarModel car1 = FactoryModel.create("sedan");
        CarModel car2 = FactoryModel.create("coupe");

        car1.toSay();
        car2.toSay();
    }
}

interface CarModel {
    void toSay();
}

class Sedan implements CarModel {
    @Override
    public void toSay() {
        System.out.println("It's a sedan.");
    }
}

class Coupe implements CarModel {
    @Override
    public void toSay() {
        System.out.println("It's a coupe.");
    }
}

class FactoryModel {
    public static CarModel create(String type) {
        switch(type) {
            case "sedan":
                return new Sedan();
            case "coupe":
                return new Coupe();
            default:
                return null;
        }
    }
}
