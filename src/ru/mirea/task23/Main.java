package ru.mirea.task23;

class LuxuryAuto {

    private String model;
    private int manufactureYear;
    private int dollarPrice;

    public LuxuryAuto(String model, int manufactureYear, int dollarPrice) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.dollarPrice = dollarPrice;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LuxuryAuto that = (LuxuryAuto) o;

        if (manufactureYear != that.manufactureYear) return false;
        if (dollarPrice != that.dollarPrice) return false;
        return model.equals(that.model);
    }
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + manufactureYear;
        result = 31 * result + dollarPrice;
        return result;
    }
}


public class Main {
    public static void main(String[] args) {

        LuxuryAuto bmw1 = new LuxuryAuto("BMW 530i", 2019, 70000000);
        LuxuryAuto bmw2 = new LuxuryAuto("BMW 730Li", 2019, 70000000);
        LuxuryAuto bmw3 = new LuxuryAuto("BMW 530i", 2019, 70000000);

        System.out.println("bmw1 == bmw2? "+bmw1.equals(bmw2));
        System.out.println("bmw1 == bmw3? "+bmw1.equals(bmw3));

        System.out.println("Какие у них хэш-коды?");
        System.out.println(bmw1.hashCode());
        System.out.println(bmw2.hashCode());
        System.out.println(bmw3.hashCode());
    }

}
