package EmployeeList_Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {

 public static void main(String[] args) {
  List<Employee> employelist = Stream.of(
          new Employee(1001,"BHanu",26,"male","Java Devloper","Bengalore",265, Arrays.asList("+91998533624","+91365284569","+6358963214")),
          new Employee(1011,"Mahesh",36,"male","Python Devloper","Chennai",65, Arrays.asList("+65214896325","+85693214785","+78945612378")),
          new Employee(1021,"Dheeraj",24,"male","Java Devloper","Hyderabad",85, Arrays.asList("+9632564899","+85236974125","+96332564789")),
          new Employee(1015,"Narasimha",38,"male","Sr.Java Devloper","Bengalore",95, Arrays.asList("+856397854","+2315794562","+74521893548")),
          new Employee(1041,"Rupesh",23,"male","Devops Engineer","Hyderabad",8, Arrays.asList("+6525896546","+854566321","+9955233648")),
          new Employee(1005,"Mounika",26,"Female","Java Devloper","Chennai",301, Arrays.asList("+9955886648","+88966542258","+775548226789")),
          new Employee(1101,"Pravalika",28,"Female","Python Devloper","Mumbai",266, Arrays.asList("+6633225432","+226355966","+78569245138")),
          new Employee(1135,"Amrutha",24,"Female","Java Tester","Mumbai",156, Arrays.asList("+856321456","+2536417892","+5223648621")),
          new Employee(1112,"Bhargavi",32,"Female","Python Devloper","Kolkatha",105, Arrays.asList("+8653245975","+125635448","+78524695288")),
          new Employee(1001,"Radika",36,"Female","Java Devloper","Bengalore",7, Arrays.asList("+98523612","+63214532687","+45896332155"))
  ).collect(Collectors.toList());


//     1.  Find the list of employees in whose rank is between 100 and 10.

        List<Employee> listOfRank = employelist.stream().filter(employee -> employee.getRank() < 100 && employee.getRank() > 10)
                .collect(Collectors.toList());
        System.out.println(listOfRank);


//      2. Find the Employees who stays in Bengalore and sort by their Names.

        List<Employee> bengalore = employelist.stream().filter(employee -> employee.getCity().equals("Bengalore"))
                .sorted(Comparator.comparing(Employee::getEmp_Name,Comparator.reverseOrder()))
                .collect(Collectors.toList());
        System.out.println(bengalore);

//      3. Find the all Domain Names

        List<String> domainList = employelist.stream().map(Employee::getDomin)
                .distinct()
                .collect(Collectors.toList());

//        Another Method
        Set<String> listOfDomains = employelist
                .stream().map(Employee::getDomin)
                .distinct().collect(Collectors.toSet());

        System.out.println(domainList);
        System.out.println(listOfDomains);


//        4. Find the all Employee Contact Numbers

        List<String> contactList = employelist.stream().flatMap(employee -> employee.getContacts().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(contactList);


//        5. Find the Employee By Domain Names.

        Map<String, List<Employee>> groupOfEmp = employelist.stream().collect(Collectors.groupingBy(Employee::getDomin));
        System.out.println(groupOfEmp);

//        I need Only Count of Domains

        Map<String, Long> countOfList = employelist.stream().collect(Collectors.groupingBy(Employee::getDomin, Collectors.counting()));
        System.out.println(countOfList);


//       6. Find the Which Domain have More Employees

        Map.Entry<String, Long> highestempDomain = employelist.stream().collect(Collectors.groupingBy(Employee::getDomin, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(highestempDomain);


//        7. Find the Average age of male and female employees

        Map<String, Double> avgAgeEmp = employelist.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getEmp_age)));

//        System.out.println(avgAgeEmp);


//        8. Find the Maximum rank in each Domain

        Map<String, Optional<Employee>> highestRankEmp = employelist.stream().collect(Collectors.groupingBy(Employee::getDomin, Collectors.minBy(Comparator.comparing(Employee::getRank))));

        System.out.println(highestRankEmp);


//        9. Find the Employee who got Second Rank

        Employee secoundRank = employelist.stream().sorted(Comparator.comparing(Employee::getRank))
                .skip(1).findFirst().get();

        System.out.println(secoundRank);
    }


}
