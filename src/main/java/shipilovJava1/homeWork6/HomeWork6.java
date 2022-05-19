package shipilovJava1.homeWork6;

import java.util.Random;
import java.util.concurrent.Callable;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.
public class HomeWork6 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик", "кот"),
                new Cat("Мурзик", "кот"),
                new Cat("Жорик", "кот"),
                new Dog("Тузик", "собака"),
                new Dog("Шарик", "собака"),
                new Dog("Барбос", "собака"),


        };
        Random random = new Random();
        for (Animal animal : animals) {
            animal.run(random.nextInt(600));
            animal.swim(random.nextInt(20));


        }
    }
}



