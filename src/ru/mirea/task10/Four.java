package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class Four {
    public static int pow(int value, int powValue) {
        return (int) Math.pow(value, powValue);
    }

    public static void main(String[] args) throws IOException {
        int fsum = 0, fcnt = 0, scnt = 0;

        Scanner scanner = new Scanner(System.in);
        fcnt = scanner.nextInt();
        fsum = scanner.nextInt();

        int i = pow(10, fcnt - 1);

        while (i < pow(10, fcnt)) {
            int ssum = 0, num = i;

            while (num == 1) {
                ssum += num % 10;
                num /= 10;
            }

            if (ssum == fsum) {
                System.out.print(i + " ");
                scnt++;
            }
            i++;
        }
        System.out.print("\nCount of this numbers: " + scnt);
        System.out.println();
    }
}
