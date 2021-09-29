package ru.mirea.task5.third;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        FurnitureShop shop = new FurnitureShop();
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("1) Стул - добавить в корзину\n2) Стол - добавить в корзину\n3) Очистить корзину (стул)\n4) Очистить корзину (стол)\n5) Корзина\n6) Баланс\n7) Оплата\n8) Установить баланс\n9) Закончить покупки");
        while (true)
        {
            choice = in.nextInt();
            switch (choice)
            {
                case 1:
                    shop.addToCart(1);
                    break;
                case 2:
                    shop.addToCart(2);
                    break;
                case 3:
                    shop.deleteFromCart(1);
                    break;
                case 4:
                    shop.deleteFromCart(2);
                    break;
                case 5:
                    shop.cart();
                    break;
                case 6:
                    shop.getBalance();
                    break;
                case 7:
                    shop.pay();
                    break;
                case 8:
                    System.out.println("Добавить денег: 1");
                    choice = in.nextInt();
                    shop.setMoney(choice);
                    break;
                case 9:
                    System.exit(0);
            }
        }
    }

}