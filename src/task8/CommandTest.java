package task8;

public class CommandTest {
//    Позволяет инкапсулировать различные операции в отдельные объекты.

    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);
        CarInvoker carInvoker01 = new CarInvoker(startCar);
        CarInvoker carInvoker02 = new CarInvoker(stopCar);

        carInvoker01.execute();
        carInvoker02.execute();
    }
}

interface Command {
    void execute();
}

class Car {
    public void startEngine() {
        System.out.println("запустить двигатель");
    }

    public void stopEngine() {
        System.out.println("остановить двигатель");
    }
}

class StartCar implements Command {
    private Car car;

    public StartCar(Car car) {
        this.car = car;
    }

    public void execute() {
        car.startEngine();
    }
}

class StopCar implements Command {
    private Car car;

    public StopCar(Car car) {
        this.car = car;
    }

    public void execute() {
        car.stopEngine();
    }
}

class CarInvoker {
    private Command command;

    public CarInvoker(Command command){
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
