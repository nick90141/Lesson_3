package task_3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1, 100, 725.4, 2018,5.5, 412);
        Car car = new Car(2, 35, 250.2,2012);
        Ship ship = new Ship(3, 80, 90.41, 2009, 219, 120);

        System.out.println("САМОЛЕТ");
        plane.show();
        System.out.println(" ");

        System.out.println("МАШИНА");
        car.show();
        System.out.println(" ");

        System.out.println("КОРАБЛЬ");
        ship.show();
        System.out.println(" ");
    }
}
