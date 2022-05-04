package shipilovJava1.homeWork5;

public class HomeWork5 {


    public static void main(String[] args) {


        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иван Иванов ", "менеджер", "i@com.ru", "+7928555667", 500, 43);
        employeeArray[1] = new Employee("Петр Петров", "водитель", "p@com.ru", "+79285556668", 300, 23);
        employeeArray[2] = new Employee("Семен Семенов", "сторож", "", "+7928555669", 250, 21);
        employeeArray[3] = new Employee("Максим Максимов", "диреткор", "m@com.ru", "+7928555661", 1000, 49);
        employeeArray[4] = new Employee("Андрей Андреев", "юрист", "a@com.ru", "+7928555662", 400, 28);


        System.out.println("Сотрудник 1 = " + employeeArray[0].getName() + "; должность: " + employeeArray[0].getPosition() + "; почта: " + employeeArray[0].getEmail() + "; номер телефона: " + employeeArray[0].getPhone() + "; зарплата: " + employeeArray[0].getSalary() + "; возраст: " + employeeArray[0].getAge());
        System.out.println("Сотрудник 2 = " + employeeArray[1].getName() + "; должность: " + employeeArray[1].getPosition() + "; почта: " + employeeArray[1].getEmail() + "; номер телефона: " + employeeArray[1].getPhone() + "; зарплата: " + employeeArray[1].getSalary() + "; возраст: " + employeeArray[1].getAge());
        System.out.println("Сотрудник 3 = " + employeeArray[2].getName() + "; должность: " + employeeArray[2].getPosition() + "; почта: " + employeeArray[2].getEmail() + "; номер телефона: " + employeeArray[2].getPhone() + "; зарплата: " + employeeArray[2].getSalary() + "; возраст: " + employeeArray[2].getAge());
        System.out.println("Сотрудник 4 = " + employeeArray[3].getName() + "; должность: " + employeeArray[3].getPosition() + "; почта: " + employeeArray[3].getEmail() + "; номер телефона: " + employeeArray[3].getPhone() + "; зарплата: " + employeeArray[3].getSalary() + "; возраст: " + employeeArray[3].getAge());
        System.out.println("Сотрудник 5 = " + employeeArray[4].getName() + "; должность: " + employeeArray[4].getPosition() + "; почта: " + employeeArray[4].getEmail() + "; номер телефона: " + employeeArray[4].getPhone() + "; зарплата: " + employeeArray[4].getSalary() + "; возраст: " + employeeArray[4].getAge());

        for (int i = 0; i < 4; i++) {
            if (employeeArray[i].getAge() > 43) {
                System.out.println(employeeArray[i].getName());
            }

        }
    }
}