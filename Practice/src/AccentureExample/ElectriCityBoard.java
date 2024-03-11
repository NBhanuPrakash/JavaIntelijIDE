package AccentureExample;

import java.util.Scanner;

public class ElectriCityBoard {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Customer Id");
        String id=sc.next();
        System.out.println("Enter Customer Name");
        String name = sc.next();
        System.out.println("Enter Phone Number");
        long phNumber = sc.nextLong();
        System.out.println("Enter City");
        String city = sc.next();
        System.out.println("Enter Units Consumed");
        double units = sc.nextDouble();
        System.out.println("Enter Cost per Unit");
        double perunits = sc.nextDouble();
        CityBoardDTo details = new CityBoardDTo(id,name,phNumber,city,units,perunits);
        double result = details.calculateElectriccityBill();
        System.out.println("Amount to be paid is "+result);
    }


}
class CityBoardDTo{

    private String customerId;

    private String customerName;

    private long phoneNumber;

    private String city;

    private double unitsConsumed;

    private double costPerUnit;

    public CityBoardDTo() {
        super();
    }

    public CityBoardDTo(String customerId, String customerName, long phoneNumber, String city, double unitsConsumed, double costPerUnit) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.unitsConsumed = unitsConsumed;
        this.costPerUnit = costPerUnit;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public double calculateElectriccityBill(){
        return unitsConsumed*costPerUnit;
    }


}
