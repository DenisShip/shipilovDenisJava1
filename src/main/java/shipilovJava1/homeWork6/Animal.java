package shipilovJava1.homeWork6;

public class Animal {

    private String name;
    private String animal;
    private int run;
    private int toSail;
    private int noRun;
    private int noToSail;


    public Animal(String name, String animal, int run, int toSail,int noRun,int noToSail) {
        this.name = name;
        this.animal = animal;
        this.run = run;
        this.toSail = toSail;
        this.noToSail = noRun;
        this.noRun = noToSail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {

        this.run = run;
    }

    public int getToSail() {
        return toSail;
    }

    public void setToSail(int toSail) {
        this.toSail = toSail;
    }

    public int getNoRun() {
        return noRun;
    }

    public void setNoRun(int noRun) {
        this.noRun = noRun;
    }

    public int getNoToSail() {
        return noToSail;
    }

    public void setNoToSail(int noToSail) {
        this.noToSail = noToSail;
    }

    public void printRun() {
        if (run > noRun) {
            System.out.println(animal + " " + name + " сошел с дистанции");

        } else {
            System.out.println(animal + " " + name + " пробежал " + run + " м");
        }
    }

    public void printToSail() {
        if (toSail > noToSail) {
            System.out.println(animal + " " + name + " утонул");
        } else {

            System.out.println(animal + " " + name + "  проплыл " + toSail + " м");
        }
    }
}
