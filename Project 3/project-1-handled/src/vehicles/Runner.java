package vehicles;


public class Runner {
    public static void main(String[] args){
        Bus bus = new Bus();
        Car car = new Car();
        Truck truck = new Truck();

        //Before Step 2:
        if(bus.petrol)
            System.out.println("Bus has petrol");

        if(car.petrol)
            System.out.println("Car has petrol");

        if(truck.petrol)
            System.out.println("Truck has petrol");


        //After Step 2:
        try {
            System.out.println("Bus");
            bus.addCNG();

            System.out.println("Car");
            car.addCNG();

            System.out.println("Truck");
            truck.addCNG();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
