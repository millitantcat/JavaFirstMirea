package ru.mirea.task26;

interface FillStrategy {

    public void fill();
}

class HybridFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем гибрид!");
    }
}

class F1PitstopStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Пит-стоп для заправки!");
    }
}

class StandartFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Стандартная заправка бензина!");
    }
}
class Auto {

    FillStrategy fillStrategy;
    String a;

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println(a+" Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

}
class F1Car extends Auto {

    public F1Car() {
        a = "F1Car";
        this.fillStrategy = new F1PitstopStrategy();
    }
}

class HybridAuto extends Auto {

    public HybridAuto() {
        a = "Hybrid";
        this.fillStrategy = new HybridFillStrategy();
    }
}

class Sedan extends Auto {

    public Sedan() {
        a = "Sedan";
        this.fillStrategy = new StandartFillStrategy();
    }
}

public class Main {
    public static void main(String[] args) {

        Auto sedan = new Sedan();
        Auto hybrid = new HybridAuto();
        Auto f1car = new F1Car();

        sedan.fill();
        hybrid.fill();
        f1car.fill();
        sedan.gas();
        hybrid.gas();
        f1car.gas();
    }
}
