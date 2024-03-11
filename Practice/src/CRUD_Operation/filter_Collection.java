package CRUD_Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filter_Collection {
    public static void main(String[] args) {
//        salaryFilter();
//        List<user> list2 = DummyData();
//        List<user> increlist = list2.stream().map(sal->{
//            sal.getSalary()=sal.setSalary(500000);
//
//            return sal;}
//        ).collect(Collectors.toList());
//        List<user> plist = increlist.stream().filter(sal-> sal.getSalary()>=210000).collect(Collectors.toList());
//        plist.stream().forEach(sal->System.out.println(sal.getName()));


    }

    private static void salaryFilter() {
        List<user> list = DummyData();
        List<user> newlist= list.stream().filter(e -> e.getSalary()>150000).collect(Collectors.toList());
        newlist.stream().forEach(e->System.out.println(e.getId()));
    }

    public static List<user> DummyData(){
        user new1 = new user("Bhanu","25463",68000);
        user new2 = new user("Ravi","25464",98000);
        user new3 = new user("Lalith","25465",108000);
        user new4 = new user("Dheeraj","254466",200000);
        List<user> newuser = new ArrayList<>();
        newuser.add(new1);
        newuser.add(new2);
        newuser.add(new3);
        newuser.add(new4);
        return newuser;


    }
}
class user{
    private String name;

    private String id;

    private Integer salary;

    public user() {
    }

    public user(String name, String id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
