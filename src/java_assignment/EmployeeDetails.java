package java_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Employee {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private int id;
    private String name;
    private String address;
    private long salary;

    public Employee(String name, String address, long salary) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }

    public long getSalary() {
        return salary;
    }
}
public class EmployeeDetails {

    private static void searchEmployee(List<Employee> employeeList, int id, String name) {
        for(Employee employee:employeeList){
            int tmpId = employee.getId();
            String tmpName = employee.getName();
            if(tmpId == id && tmpName.equals(name)){
                System.out.println("Employee found with id " + id +" and name is " + name);
                return;
            }
        }
        System.out.println("record doesn't exist with "+ id + " " + name);
    }

    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Akhand","Bangalore",600000));
        employeeList.add(new Employee("Sonu","Patna",700000));
        employeeList.add(new Employee("Monu","Uttarpardesh",550000));
        employeeList.add(new Employee("Raju","Delhi",350000));
        employeeList.add(new Employee("Kiran","Pune",100000));

        searchEmployee(employeeList,1000,"Akhand");
        searchEmployee(employeeList,1003,"Raju");
    }
}
