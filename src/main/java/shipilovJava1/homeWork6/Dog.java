package shipilovJava1.homeWork6;

public class Dog extends Animal {
    public Dog(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void run(int length) {
        if (length > 500) {
            System.out.println( getAnimal()+ " "+ getName() +  " пробежал 500 м. и устал");
        } else {
            System.out.println(getAnimal()+ " "+ getName() + " " + length + " м. пробежал");
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10) {
            System.out.println( getAnimal()+ " "+ getName() +  " проплыл 10 м. и утонул");
        } else {
            System.out.println(getAnimal()+ " "+ getName() + " " + length + " м. проплыл");
        }
    }
}
