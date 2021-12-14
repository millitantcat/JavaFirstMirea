package ru.mirea.task28;

//вложенные
class Auto {
    String model;

    class Engine {
        private boolean working = false;

        public void work () {
            working = true;
            System.out.print("Двигатель запущен!");
        }

        public void nwork () {
            working = false;
            System.out.print("Двигатель мёртв :c");
        }
    }

    Engine en = new Engine();
}

public class Car {
    public static void main(String[] args) {
        //вложеннный
        Auto niva = new Auto();
        niva.en.work();

        System.out.println();
        //вложенный
        Auto bmw = new Auto();
        bmw.en.nwork();

        System.out.println();
        //анонимный
        Auto car = new Auto() {
            void flyingMoto () {
                System.out.print ("Летающий мотоцикл");
            }
        };

    }
}
