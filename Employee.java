public class Employee {
    private int id;
    private String name;
    private String email;
    private String city;
    private double salary;

    public Employee(int id, String name, String email, String city, double salary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCity(){
        return this.city;
    }

    public double getSalary(){
        return this.salary;
    }
}
