package ru.marker;

/**
 * * Тест Миллера-Рабина
 **/

import static ru.marker.UtilsMod.mulMod;
import static ru.marker.UtilsMod.powMod;

import java.util.Random;

public class MillerRabin {

    public boolean isPrime(long n, int iteration) {

        /*
           Проверка базовых случаев
         */
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n == 0 || n == 1) {
            return false;
        }


        long s = n - 1;
        while (s % 2 == 0) {
            s /= 2;
        }

        Random rand = new Random();
        for (int i = 0; i < iteration; i++) {
            long r = Math.abs(rand.nextLong());
            long a = r % (n - 1) + 1, temp = s;
            long mod = powMod(a, temp, n);
            while (temp != n - 1 && mod != 1 && mod != n - 1) {
                mod = mulMod(mod, mod, n);
                temp *= 2;
            }
            if (mod != n - 1 && temp % 2 == 0) {
                return false;
            }
        }
        return true;
    }



}