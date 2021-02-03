package car_dealership;

public class Dealership {
    public static void main(String[] args) {

        Customer cust1 = new Customer();
        cust1.setName("Rahul");
        cust1.setAddress("Navi Mumbai");
        cust1.setCashOnHand(500000);

        Vehicle vehicle = new Vehicle();
        Employee employee = new Employee();
        cust1.purchaseCar(vehicle, employee, false);
    }

}
