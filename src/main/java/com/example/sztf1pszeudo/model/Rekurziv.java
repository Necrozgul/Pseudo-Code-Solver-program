package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public final class Rekurziv {
    public static ArrayList<String> MaxKivalasztasRekurzivstring=new ArrayList<>();
    public static ArrayList<String> Logaritmikuskeresesrekurzivstring=new ArrayList<>();
    public static ArrayList<String> LinearisKeresesRekurzivstring=new ArrayList<>();
    public static ArrayList<String> anrekurzivstring=new ArrayList<>();
    public static ArrayList<String> anrekurzivfelezesstring=new ArrayList<>();
    public static ArrayList<String> towersofhanoistring=new ArrayList<>();

    public static void Reset()
    {
        MaxKivalasztasRekurzivstring=new ArrayList<>();
        Logaritmikuskeresesrekurzivstring=new ArrayList<>();
        LinearisKeresesRekurzivstring=new ArrayList<>();
        anrekurzivstring=new ArrayList<>();
        anrekurzivfelezesstring=new ArrayList<>();
        towersofhanoistring=new ArrayList<>();
    }

    public static int MaxKivalasztasRekurziv(int[] a, int jobb)
    {
        MaxKivalasztasRekurzivstring.add("(Visszafele) MaxRekurziv: jobb: " + (jobb + 1));
        if (jobb == 0)
        {
            System.out.println("Vissza: 1");
            return 0;
        }
        else
        {
            int max = MaxKivalasztasRekurziv(a, jobb - 1);
            if (a[jobb] > a[max])
            {
                MaxKivalasztasRekurzivstring.add("Vissza: " + (jobb + 1));
                return jobb;
            }
            else
            {
                MaxKivalasztasRekurzivstring.add("Vissza: " + (max + 1));
                return max;
            }
        }
    }
    public static int Logaritmikuskeresesrekurziv(int[] a, int bal, int jobb, int keresett)
    {
        Logaritmikuskeresesrekurzivstring.add(String.format("LogaritmikusKeresés: Bal: %1$s, jobb: %2$s keresett: %3$s", bal + 1, jobb + 1, keresett));
        if (jobb > bal)
        {
            int center = (bal + jobb) / 2;
            if (a[center] == keresett)
            {
                Logaritmikuskeresesrekurzivstring.add(String.format("Vissza: %1$s", center + 1));
                return center;
            }
            else if (a[center] > keresett)
            {
                return Logaritmikuskeresesrekurziv(a, bal, center - 1, keresett);
            }
            else
            {
                return Logaritmikuskeresesrekurziv(a, center + 1, jobb, keresett);
            }
        }
        else
        {
            return 0;
        }
    }
    public static ArrayList<String> FibonacciIterativ(int a)
    {
        ArrayList<String> data = new ArrayList<>();
        int n1 = 0;
        int n2 = 1;
        int fibonacci = 0;
        for (int i = 0; i < a; i++)
        {
            fibonacci = n1 + n2;
            n2 = n1;
        }
        data.add(fibonacci+"");
        return data;
    }
    public static int LinearisKeresesRekurziv(int[] a, int keresett, int i)
    {
        LinearisKeresesRekurzivstring.add(String.format("LineárisRekurzív: %1$s", i + 1));
        if (a[i] == keresett)
        {
            LinearisKeresesRekurzivstring.add("Vissza " + (i + 1));
            return i;
        }
        else if (i > a.length)
        {
            return -1;
        }
        else
        {
            return LinearisKeresesRekurziv(a, keresett, i + 1);
        }
    }
    public static ArrayList<String> aniterativ(int a, int N)
    {
        ArrayList<String> data = new ArrayList<>();
        int ertek = a;
        for (int i = 1; i < N; i++)
        {
            data.add(String.format("Jelenlegi értéke: %1$s", ertek));
            ertek = ertek * a;
        }
        return data;
    }
    public static int anrekurziv(int a, int N)
    {
        anrekurzivstring.add(String.format("Hatványrekurzív(%1$s,%2$s)", a, N - 1));
        if (N == 1)
        {
            anrekurzivstring.add(String.format("a: %1$s", a));
            return a;
        }
        else
        {
            return anrekurziv(a, N - 1);
        }
    }
    public static int anrekurzivfelezes(int a, int N)
    {
        int seged = 0;
        if (N == 1)
        {
            return a;
        }
        else
        {
            if (N % 2 == 0)
            {
                anrekurzivfelezesstring.add(String.format("Hatványfelező(%1$s,%2$s)", a, N / 2));
                seged = anrekurzivfelezes(a, N / 2);
                return seged * seged;
            }
            else
            {
                anrekurzivfelezesstring.add(String.format("Hatványfelező(%1$s,%2$s)", a, (N - 1) / 2));
                seged = anrekurzivfelezes(a, (N - 1) / 2);
                return a * seged * seged;
            }

        }
    }
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 0)
        {
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        towersofhanoistring.add("Move disk "+ n + " from rod " +
                from_rod +" to rod " + to_rod );
        towersofhanoistring.add((String.valueOf(n)+String.valueOf(from_rod)+String.valueOf(to_rod)+String.valueOf(aux_rod)+""));
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }




}
