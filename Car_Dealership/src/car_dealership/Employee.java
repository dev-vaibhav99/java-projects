package car_dealership;

public class Employee {

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
        double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
        if (finance){
            runCreditHistory(customer, loanAmount);
        } else if (vehicle.getPrice() <= customer.getCashOnHand()){
            processTransaction(customer, vehicle);
        } else {
            System.out.println("You need "+ loanAmount +" more money to purchase vehicle: "+vehicle);
        }
    }

    private void runCreditHistory(Customer customer, double loanAmount) {
        System.out.println("Ran credit history for "+ customer.getName()+"...");
        System.out.println("Customer has been approved to purchase the vehicle ! ");
        System.out.println("You have to pay "+loanAmount+" as loan amount.");
    }

    private void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println(customer.getName()+" has purchased vehicle : "
                + vehicle + " for the price "+vehicle.getPrice());
    }
}
