package vehicles;

public interface Four_wheeler {

    Boolean petrol = true;

    //Step 2:
    public default void addCNG(){
        System.out.println("CNG Kit has been installed in the vehicle");
    }
}
