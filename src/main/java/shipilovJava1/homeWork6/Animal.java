package shipilovJava1.homeWork6;

public abstract class Animal {

    private String name;
    private String animal;

    public Animal(String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

    public abstract void run(int length);
    public abstract void swim(int length);

    public String getAnimal() {
        return animal;
    }

    public String getName() {
        return name;
    }
}


