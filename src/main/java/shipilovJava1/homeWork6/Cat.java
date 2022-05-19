package shipilovJava1.homeWork6;

public class Cat extends Animal {
    public Cat(String name, String animal) {
        super(name, animal);
    }



    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println( getAnimal()+ " "+ getName() +  " пробежал 200 м. и устал");
        } else {
            System.out.println(getAnimal()+ " "+ getName() + " " + length + " м. пробежал");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println( getAnimal()+" " + getName() + " не умеет плавать");

    }
}

