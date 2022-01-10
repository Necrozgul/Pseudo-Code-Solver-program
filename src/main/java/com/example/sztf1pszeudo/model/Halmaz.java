package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public class Halmaz {

    public static ArrayList<String> Metszet(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Metszet:");
        int[] y = new int[a.length + b.length];
        int db = 0;
        for (int i = 0; i < a.length; i++)
        {
            //Console.WriteLine($"i: {i + 1}");
            int j = 0;
            //Console.WriteLine($"j: {j + 1}");
            while (b.length > j && a[i] != b[j])
            {
                j++;
                //Console.WriteLine($"j: {j + 1}");
            }
            data.add(String.format("lefutas: %1$s j: %2$s", i + 1, j + 1));
            if (b.length > j)
            {
                y[db] = a[i];
                db++;
                //Console.WriteLine($"db: {db}");
            }
        }
        return data;
    }

    public static ArrayList<String> HalmazUnio(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("halmaz Unió:");
        int[] y1 = new int[a.length + 1];
        int[] y2 = new int[b.length + 1];
        int[] ki = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++)
        {
            y1[i] = a[i];
        }
        y1[a.length] = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++)
        {
            y2[i] = b[i];
        }
        y2[b.length] = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;
        int db = 0;
        while (y1.length > x || y2.length > y)
        {
            data.add(String.format("i: %1$s,j: %2$s,db: %3$s", x + 1, y + 1, db + 1));
            if (y1[x] > y2[y])
            {
                ki[db] = y2[y];
                y++;
            }
            else if (y2[y] > y1[x])
            {
                ki[db] = y1[x];
                x++;
            }
            else
            {
                ki[db] = y1[x];
                x++;
                y++;
            }
            db++;
        }
        return data;
    }

    public static ArrayList<String> Unio(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Unio:");
        int[] y = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++)
        {
            y[i] = a[i];
        }
        int db = a.length - 1;
        for (int i = 0; i < b.length; i++)
        {
            int j = 0;
            data.add(String.format("i: %1$s,j: %2$s, db: %3$s", j + 1, i + 1, db + 1));
            while (a.length > j && a[j] != b[i])
            {
                j++;
                data.add(String.format("i: %1$s", j + 1));
            }
            if (j >= a.length)
            {
                y[db] = b[i];
                db++;
            }
        }
        return data;
    }

    public static ArrayList<String> Osszefesul(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Osszefesul:");
        int[] y = new int[a.length + b.length];
        int db = 0;
        int i = 0;
        int j = 0;
        while (a.length > i && b.length > j)
        {
            if (a[i] > b[j])
            {
                y[db] = b[j];
                j++;
                db++;
            }
            else if (b[j] > a[i])
            {
                y[db] = a[i];
                i++;
                db++;
            }
            else
            {
                y[db] = a[i];
                i++;
                j++;
                db++;
            }
            data.add(String.format("i: %1$s,j: %2$s, db: %3$s", i + 1, j + 1, db));
        }
        while (a.length > i)
        {
            y[db] = a[i];
            db++;
            i++;
            data.add(String.format("i: %1$s,j: %2$s, db: %3$s", i + 1, j + 1, db));
        }
        while (b.length > j)
        {
            y[db] = b[j];
            db++;
            j++;
            data.add(String.format("i: %1$s,j: %2$s, db: %3$s", i + 1, j + 1, db));
        }
        return  data;
    }

    public static ArrayList<String> HalmazTulajdonsagVizsgalta(int[] x) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Halmaz Tulajdonság Vizsgálata:");
        int i = 1;
        data.add(String.format("i: %1$s", i));
        while (i < x.length && x[i] != x[i - 1])
        {
            i++;
            data.add(String.format("i: %1$s", i));
        }
        boolean l = i == x.length;
        data.add(String.valueOf(l));
        return data;
    }

    public static ArrayList<String> ReszhalmazE(int[] x1, int[] x2) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Részhalmaz Vizsgálat:");
        int i = 0;
        int j = 0;
        while (x1.length > i && x2.length > j)
        {
            if (x1[i] == x2[j])
            {
                i++;
                System.out.println("i: " + (i + 1));
            }
            j++;
            System.out.println("j: " + (j + 1));
        }
        boolean l = i >= x1.length;
        data.add(String.valueOf(l));
        return data;
    }

    public static ArrayList<String> HalmazLetrehozas(int[] x) {
        ArrayList<String> data = new ArrayList<>();
        data.add("halmaz Létrehozása:");
        int[] a = new int[x.length];
        int db = 0;
        a[db] = x[0];
        for (int i = 1; i < x.length; i++)
        {
            if (x[i] != a[db])
            {
                db++;
                a[db] = x[i];
            }
            data.add(String.format("i: %1$s, db: %2$s", i, db));
        }
        data.add(String.format("Halmazlétrehozás: db = %1$s; a = %2$s", db, Data.TombString(a)));
        return data;
    }

    public static ArrayList<String> TartalmazasVizsgalat(int[] x, int ertek) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Tartalmazás vizsgálat:");
        int bal = 0;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (bal <= jobb && x[center] != ertek)
        {
            if (x[center] > ertek)
            {
                jobb = center - 1;
                data.add(String.format("Jobb: %1$s", jobb));
            }
            else
            {
                bal = center + 1;
                data.add(String.format("Bal: %1$s", bal));
            }
            center = (bal + jobb) / 2;
        }
        boolean l = bal <= jobb;
        data.add(String.format("Tartalmazza: %1$s", l));
        return data;
    }

}
