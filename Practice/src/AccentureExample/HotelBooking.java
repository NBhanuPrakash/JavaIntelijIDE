package AccentureExample;

public class HotelBooking {
    public static void main(String[] args) {
        String str = "Bhanu:0:0:2";
        hotelBook(str);
    }
    public static void hotelBook(String s){
        String[] group = s.split(":");
        String name = group[0];
        int noOfAdults = Integer.parseInt(group[1]);
        int noOfCild = Integer.parseInt(group[2]);
        int noOfDays = Integer.parseInt(group[3]);
        if (noOfAdults<0){
            System.out.println("Invalid input for number of adults");
        }else if (noOfCild<0){
            System.out.println("Invalid input for number of children");
        }else if (noOfDays<=0){
            System.out.println("Invalid input for number of days");
        }else{
            int total = ((noOfAdults*1000)+(noOfCild*650))*noOfDays;
            System.out.println(name+" your booking is confirmed and the total cost is Rs "+total);
        }
    }
}
