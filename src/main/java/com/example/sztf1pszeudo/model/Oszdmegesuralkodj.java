package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public final class Oszdmegesuralkodj {

    public static ArrayList<String> kadiklegkisebbelemstring=new ArrayList<>();
    public static ArrayList<String> osszefesulorendezesstring=new ArrayList<>();
    public static ArrayList<String> gyorsrendezesstring=new ArrayList<>();
    public static ArrayList<String> felezomaxkivalasztasstring=new ArrayList<>();

    public static void Reset()
    {
        kadiklegkisebbelemstring=new ArrayList<>();
        osszefesulorendezesstring=new ArrayList<>();
        gyorsrendezesstring=new ArrayList<>();
        felezomaxkivalasztasstring=new ArrayList<>();

    }

    public static ArrayList<String> kadiklegkisebbelem(int[] x, int bal, int jobb, int k)
    {
        ArrayList<String> data = new ArrayList<>();
        kadiklegkisebbelemstring.add(String.format("K-ADIKLegkisebbElem(x,%1$s,%2$s,%3$s)", bal + 1, jobb + 1, k));
        if (bal == jobb)
        {
            kadiklegkisebbelemstring.add(String.format("x[bal]: %1$s bal: %2$s", x[bal], bal + 1));
        }
        else
        {
            int idx = szetvalogat(x, bal, jobb);
            if (k == idx - bal + 1)
            {
                data.add(String.format("x[idx], vagyis a legkisebb elem indexe: %1$s idx: %2$s", x[idx], idx + 1));
            }
            else if (k < idx - bal + 1)
            {
                kadiklegkisebbelem(x, bal, idx - 1, k);
            }
            else
            {
                kadiklegkisebbelem(x, idx + 1, jobb, k - (idx - bal + 1));
            }
        }
        return data;
    }
    public static int szetvalogat(int[] x, int bal, int jobb)
    {
        ArrayList<String> data = new ArrayList<>();
        kadiklegkisebbelemstring.add(String.format("Szétválogat(x,%1$s,%2$s)", bal + 1, jobb + 1));
        gyorsrendezesstring.add(String.format("Szétválogat(x,%1$s,%2$s)", bal + 1, jobb + 1));
        int seged = x[bal];
        while (bal < jobb)
        {
            while (bal < jobb && x[jobb] > seged)
            {
                jobb--;
            }
            if (bal < jobb)
            {
                x[bal] = x[jobb];
                bal++;
                while (bal < jobb && x[bal] <= seged)
                {
                    bal++;
                }
                if (bal < jobb)
                {
                    x[jobb] = x[bal];
                    jobb--;
                }
            }
        }
        int idx = bal;
        x[idx] = seged;
        kadiklegkisebbelemstring.add("Vissza: idx: " + (idx + 1) + "\n");
        return idx;
    }
    public static void osszefesulorendezes(int[] x, int bal, int jobb)
    {
        osszefesulorendezesstring.add(String.format("ÖsszefésülőRendezés(x,%1$s,%2$s)", bal + 1, jobb + 1));
        if (bal < jobb)
        {
            int center = (bal + jobb) / 2;
            osszefesulorendezes(x, bal, center);
            osszefesulorendezes(x, center + 1, jobb);
            osszefesules(x, bal, center, jobb);
        }
    }
    public static void osszefesules(int[] x, int bal, int center, int jobb)
    {
        osszefesulorendezesstring.add(String.format("Összefésül(x,%1$s,%2$s,%3$s)", bal + 1, center + 1, jobb + 1));
        int n1 = center - bal + 1;
        int n2 = jobb - center;
        int[] y1 = new int[n1 + 2];
        int i = 0;
        for (i = 1; i < n1; i++)
        {
            y1[i] = x[bal + i - 1];
        }
        int[] y2 = new int[n2 + 2];
        int j = 0;
        for (j = 0; j < n2; j++)
        {
            y2[j] = x[center + j];
        }
        y1[n1 + 1] = 999;
        y2[n2 + 1] = 998;
        i = 0;
        j = 0;
        for (int k = bal; k < jobb; k++)
        {
            if (y1[i] < y2[j])
            {
                x[k] = y1[i];
                i++;
            }
            else
            {
                x[k] = y2[j];
                j++;
            }
        }
    }
    public static void gyorsrendezes(int[] x, int bal, int jobb)
    {
        gyorsrendezesstring.add(String.format("GyorsRendezés(x,%1$s,%2$s)", bal + 1, jobb + 1));
        int idx = szetvalogat(x, bal, jobb);
        gyorsrendezesstring.add(String.format("idx=%1$s", idx + 1));
        if (idx > bal + 1)
        {
            gyorsrendezes(x, bal, idx - 1);
        }
        if (idx < jobb - 1)
        {
            gyorsrendezes(x, idx + 1, jobb);
        }
    }
    public static int felezomaximumkivalasztas(int[] x, int bal, int jobb)
    {
        felezomaxkivalasztasstring.add(String.format("FelezőMaximumkiválasztás(x,%1$s,%2$s)", bal + 1, jobb + 1));
        if (bal == jobb)
        {
            felezomaxkivalasztasstring.add(String.format("Bal:%1$s", bal + 1));
            return bal;
        }
        else
        {
            int center = (bal + jobb) / 2;
            int balmax = felezomaximumkivalasztas(x, bal, center);
            int jobbmax = felezomaximumkivalasztas(x, center + 1, jobb);

            if (x[balmax] > x[jobbmax])
            {
                felezomaxkivalasztasstring.add(String.format("Balmax: %1$s (index)", balmax + 1));
                return balmax;
            }
            else
            {
                felezomaxkivalasztasstring.add(String.format("Jobbmax:%1$s(index)", jobbmax + 1));
                return jobbmax;
            }
        }
    }







}
