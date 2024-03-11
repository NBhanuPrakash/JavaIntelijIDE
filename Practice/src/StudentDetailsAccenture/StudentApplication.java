package StudentDetailsAccenture;

import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Id:");
        int stdId = sc.nextInt();

        System.out.println("Enter Student's Name:");
        String stdName = sc.next();

        System.out.println("Enter Student's address:");
        String stdAddress = sc.next();

        System.out.println("Whether the student is from NIT(Yes/No):");
        String clgName =  sc.next();

        while(!clgName.equalsIgnoreCase("YES") && !clgName.equalsIgnoreCase("NO")){
            System.out.println("wrong input");
            System.out.println("Whether the student is from NIT(Yes/No):");
            clgName = sc.next();
        }

        if (clgName.equalsIgnoreCase("NO")){
            System.out.println("Enter the college name:");
            String clg = sc.next();
            Student st1 = new Student(stdId,stdName,stdAddress,clg);
            studentDetails(st1);
        }else{
          Student st2 = new Student(stdId,stdName,stdAddress);
          studentDetails(st2);
        }
    }

    public static void studentDetails(Student student){
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Address: " + student.getStudentAddress());
        System.out.println("College Name: " + student.getCollegeName());
        System.out.println();
    }
}
