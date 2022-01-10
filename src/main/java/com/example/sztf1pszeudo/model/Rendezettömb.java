package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public class Rendezettömb {
    public static ArrayList<String> logaritmuskeresesiterativ(int[] x, int ertek)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 1;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (bal <= jobb && x[center] != ertek)
        {
            data.add(String.format("bal:%1$s, center:%2$s, jobb:%3$s", bal + 1, center + 1, jobb + 1));
            if (x[center] > ertek)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
        }
        boolean van = bal <= jobb;
        if (van)
        {
            int idx = center;
            data.add(String.format("Van:%1$s, indexe (idx):%2$s", van, idx + 1));
        }
        else
        {
            data.add(String.format("Van:%1$s", van));
        }
        return data;
    }
    public static ArrayList<String> eldontesrendezettbe(int[] x, int ertek)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 1;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (bal <= jobb && x[center] != ertek)
        {
            data.add(String.format("Bal: %1$s,center: %2$s,jobb: %3$s", bal + 1, center, jobb + 1));
            if (x[center] > ertek)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
        }
        boolean van = bal <= jobb;
        data.add(String.format("Van:%1$s", van));
        return data;
    }
    public static ArrayList<String> modositotteldontesrendezettbe(int[] x, int alsohatar, int felsohatar)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 0;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (bal <= jobb && !(alsohatar <= x[center] && x[center] <= felsohatar))
        {
            data.add(String.format("bal: %1$s,center:%2$s, jobb:%3$s", bal + 1, center + 1, jobb + 1));
            if (x[center] > felsohatar)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
        }
        boolean van = bal <= jobb;
        data.add(String.format("Van:%1$s", van));
        return data;
    }
    public static ArrayList<String> kivalasztas(int[] x, int ertek)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 0;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (x[center] != ertek)
        {
            data.add(String.format("Bal: %1$s,center: %2$s,jobb: %3$s", bal + 1, center, jobb + 1));
            if (x[center] > ertek)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
        }
        int idx = center;
        data.add(String.format("x tömb elem indexe ami megegyezik a keresettel (idx):%1$s", idx + 1));
        return data;
    }
    public static ArrayList<String> kivalogatasrendezettbe(int[] x, int ertek)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 0;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (bal <= jobb && x[center] != ertek)
        {
            data.add(String.format("bal: %1$s,Center: %2$s, jobb: %3$s", bal + 1, center + 1, jobb + 1));
            if (x[center] > ertek)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
        }
        boolean van = bal <= jobb;
        if (van)
        {
            bal = center;
            while (bal > 0 && x[bal - 1] == ertek)
            {
                bal--;
                data.add(String.format("bal: %1$s,Center: %2$s, jobb: %3$s", bal + 1, center + 1, jobb + 1));
            }
            jobb = center;
            while (jobb < x.length && x[jobb + 1] == ertek)
            {
                jobb++;
                data.add(String.format("bal: %1$s,Center: %2$s, jobb: %3$s", bal + 1, center + 1, jobb + 1));
            }
            data.add(String.format("Van: %1$s, bal: %2$s jobb: %3$s", van, bal + 1, jobb + 1));
        }
        else
        {
            data.add(String.format("Van: %1$s", van));
        }
        return data;
    }
    public static ArrayList<String> modositottkivalogatasrendezettbe(int[] x, int alsohatar, int felsohatar)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 1;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        data.add(String.format("bal: %1$s,center:%2$s, jobb:%3$s", bal + 1, center + 1, jobb + 1));
        while (bal <= jobb && !(alsohatar <= x[center] && x[center] <= felsohatar))
        {
            if (x[center] > felsohatar)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
            data.add(String.format("bal: %1$s,center:%2$s, jobb:%3$s", bal + 1, center + 1, jobb + 1));
        }
        boolean van = bal <= jobb;
        if (van)
        {
            bal = center;
            while (bal > 1 && x[bal - 1] == alsohatar)
            {
                data.add(String.format("bal: %1$s,center:%2$s, jobb:%3$s", bal + 1, center + 1, jobb + 1));
                bal--;
            }
            jobb = center;
            while (jobb < x.length - 1 && x[jobb + 1] == felsohatar)
            {
                data.add(String.format("bal: %1$s,center:%2$s, jobb:%3$s", bal + 1, center + 1, jobb + 1));
                jobb++;
            }
            data.add(String.format("Van: %1$s, bal: %2$s, jobb: %3$s", van, bal + 1, jobb + 1));
        }
        else
        {
            data.add(String.format("Van: %1$s", van));
        }
        return data;
    }
    public static ArrayList<String> megszamlalas(int[] x, int ertek)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 0;
        int jobb = x.length - 1;
        int db = 0;
        int center = (bal + jobb) / 2;
        data.add(String.format("bal: %1$s,center: %2$s,jobb: %3$s,db: %4$s", bal + 1, center + 1, jobb + 1, db));
        while (bal <= jobb && x[center] != ertek)
        {
            if (x[center] > ertek)
            {
                jobb = center - 1;
            }
            else
            {
                bal = center + 1;
            }
            center = (bal + jobb) / 2;
            data.add(String.format("bal: %1$s,center: %2$s,jobb: %3$s,db: %4$s", bal + 1, center + 1, jobb + 1, db));
        }
        boolean van = bal <= jobb;
        if (van)
        {
            bal = center;
            data.add(String.format("bal: %1$s,center: %2$s,jobb: %3$s,db: %4$s", bal + 1, center + 1, jobb + 1, db));
            while (bal > 0 && x[bal - 1] == ertek)
            {
                bal--;
                data.add(String.format("bal: %1$s,center: %2$s,jobb: %3$s,db: %4$s", bal + 1, center + 1, jobb + 1, db));
            }
            jobb = center;
            while (jobb < x.length - 1 && x[jobb + 1] == ertek)
            {
                jobb++;
                data.add(String.format("bal: %1$s,center: %2$s,jobb: %3$s,db: %4$s", bal + 1, center + 1, jobb + 1, db));
            }
            db = jobb - bal + 1;
            data.add(String.format("bal: %1$s,center: %2$s,jobb: %3$s,db: %4$s", bal + 1, center + 1, jobb + 1, db));
        }
        else
        {
            data.add(String.format("db:%1$s", db));
        }
        return data;
    }







}
