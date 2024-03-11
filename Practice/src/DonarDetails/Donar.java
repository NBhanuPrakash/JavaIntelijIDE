package DonarDetails;

import java.util.Scanner;

public class Donar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String donarName = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the gender");
        String gender = sc.next();

        System.out.println("Enter the blood group");
        String bloodGroup = sc.next();

        System.out.println("Enter the phone no");
        long phNumber = sc.nextLong();

        DonarDetails donar = new DonarDetails(donarName,age,gender,bloodGroup,phNumber);

        System.out.println("Name:"+donar.getName());
        System.out.println("Age:"+donar.getAge());
        System.out.println("Gender"+donar.getGender());
        System.out.println("Blood group"+donar.getBloodGroup());
        System.out.println("Phone no"+donar.getPhoneNumber());
        System.out.println();

    }
}
