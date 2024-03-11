package AccentureExample;

import java.util.Locale;
import java.util.Scanner;

public class DisneyToursim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Name");
        String name = sc.next();
        System.out.println("Enter the City name");
        String cityName = sc.next();
        System.out.println("Enter the phone number");
        String phNumber = sc.next();
        System.out.println("Enter number of people");
        int noOfPeople = sc.nextInt();
        System.out.println("Enter the option");
        System.out.println("1. Boat House Booking");
        System.out.println("2. Boat Ride Booking");
        int userChioce = sc.nextInt();
        switch (userChioce){
            case 1:
                System.out.println("Enter number of days");
                int noOfDays = sc.nextInt();
                System.out.println("Enter food type (Veg/NonVeg)");
                String foodType = sc.next();
                BoatHouseBooking bhb = new BoatHouseBooking(name,cityName,phNumber,noOfPeople,noOfDays,foodType);
                System.out.println("Your booking has been confirmed pay Rs. "+bhb.calculateTotalAmount());
                break;
            case 2:
                System.out.println("Enter number of hours");
                float noOfHours = sc.nextFloat();
                System.out.println("Do you want guide (Yes/No)");
                String guide = sc.next();
                BoatRideBooking brb = new BoatRideBooking(name,cityName,phNumber,noOfPeople,noOfHours,guide);
                System.out.println("Your booking has been confirmed pay Rs. "+brb.calculateTotalAmount());
        }
    }


}
abstract class Booking{
    protected String customerName;

    protected String cityName;

    protected String phoneNumber;

    protected int noOfPeople;



    public Booking(String customerName, String cityName, String phoneNumber, int noOfPeople) {
        this.customerName = customerName;
        this.cityName = cityName;
        this.phoneNumber = phoneNumber;
        this.noOfPeople = noOfPeople;
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public abstract double calculateTotalAmount();
}

class BoatHouseBooking extends Booking{
    private int noOfDays;

    private String foodType;



    public BoatHouseBooking(String customerName, String cityName, String phoneNumber, int noOfPeople,int noOfDays, String foodType) {
        super(customerName, cityName, phoneNumber, noOfPeople);
        this.noOfDays = noOfDays;
        this.foodType = foodType;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public double calculateTotalAmount() {
        double foodtype = 0;
        if ("nonveg".equals(foodType.toLowerCase())){
            foodtype=500;
        }else if ("veg".equals(foodType.toLowerCase())){
            foodtype=250;
        }
        double totalAmount = noOfDays*3000+getNoOfPeople()*800+foodtype;
        return totalAmount;
    }
}

class BoatRideBooking extends Booking{
    private float noOfHours;

    private String guide;

    public BoatRideBooking(String customerName, String cityName, String phoneNumber, int noOfPeople, float noOfHours, String guide) {
        super(customerName, cityName, phoneNumber, noOfPeople);
        this.noOfHours = noOfHours;
        this.guide = guide;
    }

    public float getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(float noOfHours) {
        this.noOfHours = noOfHours;
    }

    public String getGuide() {
        return guide;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    @Override
    public double calculateTotalAmount() {
        double guideAmount = 0;
        if ("yes".equals(guide.toLowerCase())){
            guideAmount=150;
        }
        double totalAmount = noOfPeople*80+noOfHours*300+guideAmount;
        return totalAmount;
    }
}
