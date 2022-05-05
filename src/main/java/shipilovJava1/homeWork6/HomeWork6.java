package shipilovJava1.homeWork6;

import java.util.concurrent.Callable;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.
public class HomeWork6 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "кот", 200, 5,200,0);
        Dog dog1 = new Dog("Бим", "собака", 500, 10,500,10);
        Cat cat2 = new Cat("Мурзик", "кот", 100, 15,200, 0);
        Dog dog2 = new Dog("Шарик", "собака", 80, 7,500,10);
        Cat cat3 = new Cat("Симба", "кот", 1000, 1,200,0);
        Dog dog3 = new Dog("Тузик", "собака", 700, 20,500,10);


        cat1.printRun();
        cat1.printToSail();
        dog3.printRun();
        dog3.printToSail();
        cat2.printRun();
        cat2.printToSail();
        cat3.printRun();
        cat3.printToSail();
    }

}



