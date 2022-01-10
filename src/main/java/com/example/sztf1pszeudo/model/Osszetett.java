package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public class Osszetett {
    //Összetett programozási tételek!

    public static ArrayList<String> Masolas(int[] x, int n) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Másolás:");
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        data.add(String.format("Másolást tömb: %1$s", Data.TombString(y)));
        return data;
    }

    public static ArrayList<String> Osszefuttatas(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Összefuttatás:");
        int[] y = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int db = 0;
        while (a.length > i && b.length > j) {
            data.add(String.format("i: %1$s,j: %2$s,db: %3$s", i + 1, j + 1, db + 1));
            if (b[j] > a[i]) {
                y[db] = a[i];
                i++;
            } else {
                if (a[i] > b[j]) {
                    y[db] = b[j];
                    j++;
                } else {
                    y[db] = a[i];
                    i++;
                    j++;

                }
            }
            db++;
        }
        while (a.length > i) {
            data.add(String.format("i: %1$s,j: %2$s,db: %3$s", i + 1, j + 1, db + 1));
            y[db] = a[i];
            db++;
            i++;


        }
        while (b.length > j) {
            data.add(String.format("i: %1$s,j: %2$s,db: %3$s", i + 1, j + 1, db + 1));
            y[db] = b[j];
            db++;
            j++;
        }
        return data;
    }

    public static ArrayList<String> ModositottOsszefuttatas(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Módosított összefuttatás:");
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

    public static ArrayList<String> KozoselemLetezese(int[] a, int[] b) {
        ArrayList<String> data = new ArrayList<>();
        data.add("KozoselemLetezese:");
        boolean van = false;
        int i = 0;
        while (a.length > i && !van)
        {
            data.add(String.format("i: %1$s", i + 1));
            int j = 0;
            while (b.length > j && a[i] != b[j])
            {
                data.add(String.format("j: %1$s", j + 1));
                j=j+1;
            }
            if (b.length > j)
            {
                van = true;
            }
            i=i+1;
        }
        data.add(String.format("Vissza: %1$s", van));
        return  data;
    }

    public static ArrayList<String> Szetvalogat(int[]a) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Szétválogat:");
        int db = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 1)
            {
                data.add(String.format("i: %1$s", i + 1));
                int seged = a[db];
                a[db] = a[i];
                a[i] = seged;
                db++;
            }
        }
        return data;
    }

    public static ArrayList<String> SzetvalogatEgyTombbe(int[] a) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Szétválogatás Egy Tömbbe:");
        int[] y = new int[a.length];
        int db = 0;
        int jobb = a.length - 1;
        data.add(String.format("db: %1$s jobb: %2$s", db + 1, jobb + 1));
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                y[db] = a[i];
                db++;
            }
            else
            {
                y[jobb] = a[i];
                jobb--;
            }
            data.add(String.format("db: %1$s jobb: %2$s", db + 1, jobb + 1));
        }
        return data;
    }

    public static ArrayList<String> SzetvalogatasEredetiben(int[] a) {
        ArrayList<String> data = new ArrayList<>();
        data.add("SzétválogatásEredetiben:");
        int bal = 0;
        int jobb = a.length - 1;
        int seged = a[bal];
        data.add(String.format("bal: %1$s,jobb: %2$s", bal + 1, jobb + 1));

        while (jobb > bal)
        {
            while (jobb > bal && (a[jobb] % 2 != 0))
            {
                jobb--;
                data.add(String.format("bal: %1$s,jobb: %2$s", bal + 1, jobb + 1));
            }
            if (jobb > bal)
            {
                a[bal] = a[jobb];
                while (jobb > bal && a[bal] % 2 == 0)
                {
                    bal++;
                    data.add(String.format("bal: %1$s,jobb: %2$s", bal + 1, jobb + 1));
                }
                if (jobb > bal)
                {
                    a[jobb] = a[bal];
                    jobb--;
                    data.add(String.format("bal: %1$s,jobb: %2$s", bal + 1, jobb + 1));
                }
            }
        }
        a[bal] = seged;
        return data;
    }
}

