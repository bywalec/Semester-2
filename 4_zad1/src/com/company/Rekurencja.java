package com.company;

public class Rekurencja {
    public int potega_iteracyjna(int x, int n) {
        int potegowanie = x;
        if (n == 0)
            return 1;
        for (int i = 0; i < n - 1; i++) {
            potegowanie *= x;
        }
        return potegowanie;
    }

    public int potega_rekurencyjna(int x, int n)
    {
        if(n > 0)
        {
            return x*potega_rekurencyjna(x, n - 1);
        }
        else
            return 1;
    }
}
