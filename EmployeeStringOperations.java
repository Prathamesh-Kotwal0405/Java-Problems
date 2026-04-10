import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeStringOperations {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Prathamesh", "prathameshkotwal1@gmail.com", "Pune", 600000);
        Employee e2 = new Employee(2, "Akanksha", "akankshak1@gmail.com", "Nashik", 1000000);
        Employee e3 = new Employee(3, "Aishwarya", "aishwaryad1@gmail.com", "Nashik", 500000);
        Employee e4 = new Employee(4, "Sarthak", "sarthak1@gmail.com", "Pune", 1600000);
        Employee e5 = new Employee(5, "Onkar", "onkarg1@gmail.com", "SambhajiNagar", 600000);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4,e5);
        EmployeeStringOperations eo = new EmployeeStringOperations();
        eo.getEmployeesByCity(employeeList);
        eo.sortEmployeesBySalary(employeeList);
        eo.removeDuplicates();
    }

    public void getEmployeesByCity(List<Employee> employeeList){
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.mapping(Employee::getName,Collectors.toList()))));
    }

    public void sortEmployeesBySalary(List<Employee> employeeList){
        System.out.println(employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.mapping(Employee::getName,Collectors.toList())));
    }

    public void removeDuplicates(){
        List<Integer> numbers = Arrays.asList(1,1,2,2,3,3,4,5,6,7,7);

        // Using streams
        System.out.println(numbers.stream().distinct().collect(Collectors.toList()));

        //Using set
        Set<Integer> unique = new HashSet<>();
        for(int  i : numbers){
            if(unique.add(i)){
                System.out.println("Inserted " + i + " in set");
            }
            else{
                System.out.println("oops duplicates element "+ i);
            }
        }
        System.out.println("Final distinct list is"+ unique.toString());
    }
}
