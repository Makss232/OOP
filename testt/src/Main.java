public class Main {

    public Main() {}
    public static void main(String[] args) {
        Car bmw = new Car(200.5f, 2000, "Black", new byte[] {0, 0, 0 });
        bmw.engine.setValues(false, 200);
        bmw.engine.info();
        Truck truck = new Truck(130f,5000,"White",true);
        truck.engine.setValues(true,10);
        truck.engine.info();
        truck.moveObject();
        truck.setValues(130f,5000,"White",new byte[] {0, 100, 0 },true);
        System.out.println(truck.getValues());
    }
}