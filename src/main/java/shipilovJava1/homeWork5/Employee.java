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



        System.out.println("Сотрудник 1 = " + employeeArray[0].name + "; должность: " + employeeArray[0].position + "; почта: " + employeeArray[0].email + "; номер телефона: " + employeeArray[0].phone + "; зарплата: " + employeeArray[0].salary + "; возраст: " + employeeArray[0].age );
        System.out.println("Сотрудник 2 = " + employeeArray[1].name + "; должность: " + employeeArray[1].position + "; почта: " + employeeArray[1].email + "; номер телефона: " + employeeArray[1].phone + "; зарплата: " + employeeArray[1].salary + "; возраст: " + employeeArray[1].age );
        System.out.println("Сотрудник 3 = " + employeeArray[2].name + "; должность: " + employeeArray[2].position + "; почта: " + employeeArray[2].email + "; номер телефона: " + employeeArray[2].phone + "; зарплата: " + employeeArray[2].salary + "; возраст: " + employeeArray[2].age );
        System.out.println("Сотрудник 4 = " + employeeArray[3].name + "; должность: " + employeeArray[3].position + "; почта: " + employeeArray[3].email + "; номер телефона: " + employeeArray[3].phone + "; зарплата: " + employeeArray[3].salary + "; возраст: " + employeeArray[3].age );
        System.out.println("Сотрудник 5 = " + employeeArray[4].name + "; должность: " + employeeArray[4].position + "; почта: " + employeeArray[4].email + "; номер телефона: " + employeeArray[4].phone + "; зарплата: " + employeeArray[4].salary + "; возраст: " + employeeArray[4].age );

        for (int i = 0; i < 4; i++) {
            if (employeeArray[i].age > 43 ){
                System.out.println(employeeArray[i].name);
            }

        }

    }
}
