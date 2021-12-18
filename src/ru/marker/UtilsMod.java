package ru.marker;

import java.math.BigInteger;

public class UtilsMod {

    /** Умножение по модулю
     * (a * b) % c **/
    public static long mulMod(long a, long b, long mod) {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
    }

    /** Возведение в степень по модулю
     * (a ^ b) % c **/
    public static long powMod(long a, long b, long mod) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
            res %= mod;
        }
        return res % mod;
    }


}
