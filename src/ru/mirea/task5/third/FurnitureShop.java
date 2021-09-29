package ru.mirea.task5.third;

public class FurnitureShop
{
    private Furniture chair = new Chair("синий", "маленький");
    private Furniture table = new Table("чёрный", "большой");
    private int sum = 0;
    private int tables = 0;
    private int chairs = 0;
    private int money = 5000;

    public void getBalance()
    {
        System.out.println("Баланс: " +money+".");
    }

    public void setMoney(int money)
    {
        this.money += money;
        System.out.println("Баланс: " +this.money+".");
    }

    public void addToCart(int choice)
    {
        if (choice == 1)
        {
            System.out.println("Стул добавлен в корзину");
            sum += chair.cost;
            chairs++;
        }
        if (choice == 2)
        {
            System.out.println("Стол добавлен в корзину");
            sum += table.cost;
            tables++;
        }
    }

    public void deleteFromCart(int choice)
    {
        if (choice == 1)
        {
            System.out.println("Один стул удалён");
            chairs--;
            sum -= chair.cost;
        }
        if (choice == 2)
        {
            System.out.println("Оден стол удалён");
            tables--;
            sum -= table.cost;
        }
    }

    public void cart()
    {
        System.out.println("В корзине сейчас" +tables+ " столов / " +chairs+ " стульев. Всего вещей " +sum+ ".");
    }

    public void pay()
    {
        if (money >= sum)
        {
            money -=sum;
            System.out.println("Вы купили " +tables+ " столов / " +chairs+ " стульев. На балансе: " +money+ ".");
            tables = 0;
            chairs = 0;
            sum = 0;
        }
        else
        {
            System.out.println("Итог " +sum+ ". Недостаточно средств.");
        }
    }
}