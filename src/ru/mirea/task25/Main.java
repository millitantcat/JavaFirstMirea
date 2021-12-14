package ru.mirea.task25;


interface Service {
    public double getPrice();
    public String getLabel();
}

class Divination implements Service {
    private String label;
    private double price;

    public Divination(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}
class Horoscope implements Service {
    private String label;
    private double price;

    public Horoscope(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return this.label;
    }
}
class OptionDecorator implements Service {
    private Service service;
    private String label;
    private double price;

    public OptionDecorator(Service service, String label, double price) {
        this.service = service;
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }

    public String getLabel() {
        return this.label + service.getLabel();
    }

}
class Aura extends OptionDecorator {
    public Aura(Service service) {
        super(service, "Характеристика ауры", 1500);
    }
}
class Chakra extends OptionDecorator {
    public Chakra(Service service) {
        super(service, "Характеристика чакр", 500);
    }
}
class Channeling extends OptionDecorator {
    public Channeling(Service service) {
        super(service, "Медитация", 99999);
    }
}
class Avatar extends OptionDecorator {
    public Avatar(Service service) {
        super(service, "Аватар", 5555);
    }
}

public class Main {
    public static void main(String[] args) {
        // Гадание на Таро
        Service taro = new Divination("Таро", 1000);
        Service chakra = new Chakra(taro);
        Service aura = new Aura(chakra);

        // И общая стоимость
        System.out.println(aura.getPrice());
        // Гороскоп
        Service horoscope = new Horoscope("Персональный гороскоп", 1000);
        Service channenling = new Channeling(horoscope);
        Service avatar = new Avatar(channenling);

        // И общая стоимость
        System.out.println(avatar.getPrice());
    }
}
