package OOP_Homework4;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Homework {

    /**
     * Необходимо создать класс Box, описывающий коробку с фруктами. В одной коробке должны быть фрукты только одного типа.
     * У коробки должны быть методы:
     * 1. Метод добавления нового фрукта в коробку add(Fruit fruit)
     * 2. Метод подсчета суммарного веса коробки getWeight()
     * 3. Метод пересыпания фруктов одной коробки в другую move(Box box)
     * 4. * Реализовать итератор на коробке. То есть должно быть доступно написать foreach, который итерируется по фруктам в коробке.
     */

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box();
        System.out.println(appleBox.getWeight()); // 0

        appleBox.add(new Apple(2)); // Должно компилироваться
        appleBox.add(new Apple(4)); // Должно компилироваться
        System.out.println(appleBox.getWeight()); // 6
//        appleBox.add(new Orange(4)); // Не должно компилироваться!!!
        appleBox.add(new GoldenApple(4)); // Должно компилироваться
        System.out.println(appleBox.getWeight()); // 10

        Box<Orange> orangeBox = new Box();
//        orangeBox.add(new Apple(2)); // Не должно компилироваться!!!
        orangeBox.add(new Orange(8)); // Должно компилироваться
        System.out.println(orangeBox.getWeight()); // 8

//        orangeBox.move(appleBox); // Не должно компилироваться!!!
//        appleBox.move(orangeBox); // Не должно компилироваться!!!

        Box<GoldenApple> goldenAppleBox = new Box();
        goldenAppleBox.add(new GoldenApple(20)); // Должно компилироваться
//        goldenAppleBox.add(new Apple(20)); // Не должно компилироваться!!!

//        appleBox.move(goldenAppleBox); // Не должно компилироваться!!!
        goldenAppleBox.move(appleBox); // Должно компилироваться

        System.out.println(goldenAppleBox.getWeight()); // 0
        System.out.println(appleBox.getWeight()); // 30

        for (Apple apple : appleBox) { // Должно компилироваться
            System.out.println(apple);
        }

        for (GoldenApple goldenApple : goldenAppleBox) { // Должно компилироваться
            System.out.println(goldenApple);
        }

        for (Orange orange : orangeBox) { // Должно компилироваться
            System.out.println(orange);
        }

    }

    static class Box<E extends Fruit> implements Iterable<E> {
        private List<E> items = new ArrayList<>();
        private int weight = 0;

        public void add(E item) {
            this.items.add(item);
            this.weight += item.getWeight();
        }

        public int getWeight() {
            return weight;
        }

        public void move(Box<? super E> anotherBox) {
            anotherBox.items.addAll(this.items);
            anotherBox.weight += this.weight;
            this.items.clear();
            this.weight = 0;
        }


        @Override
        public Iterator<E> iterator() {

            return new Iterator<>() {
                private int index = 0;

                @Override
                public boolean hasNext() {
                    return index < items.size();
                }

                @Override
                public E next() {
                    return items.get(index++);
                }
            };
        }
    }

    static class Fruit {

        private int weight;

        public Fruit(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }
    }

    static class Apple extends Fruit {
        public Apple(int weight) {
            super(weight);
        }
    }

    static class GoldenApple extends Apple {
        public GoldenApple(int weight) {
            super(weight);
        }
    }

    static class Orange extends Fruit {
        public Orange(int weight) {
            super(weight);
        }
    }

}
