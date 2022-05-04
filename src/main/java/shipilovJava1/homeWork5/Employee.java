package shipilovJava1.homeWork5;

public class Employee {


    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;


    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    public void print (){
        System.out.println("name, position, email, phone,salary,age");

    }

    public Employee(String name, String position, String phone, int salary, int age) {
        this(name, position, "", phone, salary, age);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}


