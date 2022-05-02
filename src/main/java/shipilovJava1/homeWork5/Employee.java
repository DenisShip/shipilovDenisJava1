package shipilovJava1.homeWork5;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;


    }

    public static void main(String[] args) {
        printInfoEmployee();



    }


    public static void printInfoEmployee() {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иван Иванов ", "менеджер", "i@com.ru", "+7928555667", 500, 43);
        employeeArray[1] = new Employee("Петр Петров", "водитель", "p@com.ru", "+79285556668", 300, 23);
        employeeArray[2] = new Employee("Семен Семенов", "сторож", "s@com.ru", "+7928555669", 250, 21);
        employeeArray[3] = new Employee("Максим Максимов", "диреткор", "m@com.ru", "+7928555661", 1000, 49);
        employeeArray[4] = new Employee("Андрей Андреев", "юрист", "a@com.ru", "+7928555662", 400, 28);



        System.out.println("Сотрудник 1 = " + employeeArray[0]);
        System.out.println("Сотрудник 2 = " + employeeArray[1]);
        System.out.println("Сотрудник 3 = " + employeeArray[2]);
        System.out.println("Сотрудник 4 = " + employeeArray[3]);
        System.out.println("Сотрудник 5 = " + employeeArray[4]);



    }
}
