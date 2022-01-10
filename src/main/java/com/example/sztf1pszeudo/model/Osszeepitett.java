package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public class Osszeepitett {
    public static ArrayList<String> MaximumKivalogatas(int[] x)
    {
        ArrayList<String> data = new ArrayList<>();
        int[] y = new int[x.length];
        int max = x[0];
        int db = 0;
        for (int i = 0; i < x.length; i++)
        {
            data.add(String.format("i: %1$s, db: %2$s", i + 1, db));
            if (x[i] > max)
            {
                max = x[i];
                db = 0;
                y[db] = i + 1;
                db++;
            }
            else if (x[i] == max)
            {
                y[db] = i + 1;
                db++;
            }
        }
        for (int item:y
             ) {
            data.add("Y="+item);
        }
        return data;
    }
    public static ArrayList<String> masolasesmaximumkivalasztas(int[] x)
    {
        ArrayList<String> data = new ArrayList<>();
        int n = x.length;
        int max = 0;
        int maxertek = x[0];
        data.add(String.format("Maxérték: %1$s", maxertek));
        for (int i = 1; i < n; i++)
        {
            int seged = x[i] * x[i]; // ide kell ha változtatni akarunk az értékén pl abszolút érték
            data.add(String.format("Segéd: %1$s", seged));
            if (maxertek < seged)
            {
                max = i;
                data.add(String.format("Max: %1$s", max + 1));
                maxertek = seged;
                data.add(String.format("Maxérték: %1$s", maxertek));
            }
        }
        return data;
    }
    public static ArrayList<String> megszamolaseskereses(int[] x, int k1)
    {
        ArrayList<String> data = new ArrayList<>();
        int db = 0;
        int i = 0;
        while (i < x.length && db < k1)
        {
            data.add(String.format("i: %1$s", i + 1));
            if (x[i] % 2 == 0)
            {
                db++;
                data.add(String.format("db: %1$s", db));
            }
            i++;
        }
        boolean van = db == k1;
        if (van)
        {
            int idx = i;
            data.add(String.format("Van: %1$s, Elem indexe: %2$s", van, idx));
        }
        else
        {
            data.add(String.format("Van:%1$s", van));
        }
        return data;
    }
    public static ArrayList<String> maximumkivalasztaseskivalogatas(int[] x)
    {
        ArrayList<String> data = new ArrayList<>();
        int[] y = new int[x.length];
        int maxertek = x[0];
        data.add(String.format("Maxérték: %1$s", maxertek));
        int db = 0;
        y[db] = 0;
        for (int i = 1; i < x.length; i++)
        {
            System.out.println("i" + (i + 1));
            if (x[i] > maxertek)
            {
                maxertek = x[i];
                data.add(String.format("Maxérték: %1$s", maxertek));
                db = 0;
                data.add(String.format("db: %1$s", db + 1));
                y[db] = i;
                db++;
            }
            else
            {
                if (x[i] == maxertek)
                {
                    data.add(String.format("db: %1$s", db + 1));
                    y[db] = i;
                    db++;
                }
            }
        }
        data.add(String.format("maximumkivalasztas: y = %1$s", Data.TombString(y)));
        return data;
    }
    public static ArrayList<String> MaxKivalasztasEsKivalogatas(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        int[] y = new int[a.length];
        int db = 0;
        int max = a[0];
        int maxertek = 0;
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
                maxertek = i;
                db = 0;
                y[db] = maxertek;
                db++;
                data.add("max: " + max + " maxhely: " + (maxertek + 1));
            }
            if (max == a[i])
            {
                y[db] = i;
                db++;
            }
        }
        return data;
    }
    public static ArrayList<String> kivalogatasessorozatszamitas(int[] x)
    {
        ArrayList<String> data = new ArrayList<>();
        int ertek = 0; // 0 ha összeadás, 1 ha szorzás
        data.add(String.format("Érték: %1$s", ertek));
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] % 2 == 0)
            {
                ertek = ertek + x[i];
                data.add(String.format("Érték: %1$s", ertek));
            }
        }
        return data;
    }
    public static ArrayList<String> KivalogatasRendezettben(int[] x, int keresett)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 0;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (jobb >= bal && x[center] != keresett)
        {
            if (x[center] > keresett)
            {
                jobb = center - 1;
                data.add("jobb: " + (jobb + 1));

            }
            else
            {
                bal = center + 1;
                data.add("bal: " + (bal + 1));

            }
            center = (bal + jobb) / 2;
            data.add("center: " + (center + 1));

        }
        boolean van = jobb > bal;
        if (van)
        {
            bal = center;
            while (bal > 0 && x[bal - 1] == keresett)
            {
                bal--;
                data.add("bal:" + (bal + 1));

            }
            jobb = center;
            while (x.length - 1 > jobb && x[jobb + 1] == keresett)
            {
                jobb++;
                data.add("jobb:" + (jobb + 1));

            }
            data.add("Vissza: bal" + (bal + 1) + " jobb: " + (jobb + 1) + " van ");
        }
        else
        {
            data.add("nincs");
        }
        return data;
    }
    public static ArrayList<String> keresesesmegszamolas(int[] x, int keresett, int hany)
    {
        ArrayList<String> data = new ArrayList<>();
        int db = 0;
        int i = 0;
        while (x.length > i && db != hany)
        {
            if (x[i] == keresett)
            {
                db++;
            }
            data.add("i: " + (i + 1));
            i++;
        }
        if (db == keresett)
        {
            data.add("vissza idx: " + (i + 1) + " van");
        }
        else
        {
            data.add("Vissza: nincs");
        }
        return data;
    }
    public static ArrayList<String> IsmetlodesekKiszurese(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        int db = 0;
        for (int i = 1; i < a.length; i++)
        {
            data.add("i: " + (i + 1));
            int j = 0;
            while (db >= j && a[i] != a[j])
            {
                data.add("j: " + (j + 1));
                j++;
            }
            if (j > db)
            {
                a[db] = a[i];
                db++;
                data.add("db: " + (db + 1));
            }
        }
        return data;
    }
    public static ArrayList<String> ModositottKivalogatas(int[] x, int alsohatar, int felsohatar)
    {
        ArrayList<String> data = new ArrayList<>();
        int bal = 0;
        int jobb = x.length - 1;
        int center = (bal + jobb) / 2;
        while (jobb >= bal && (alsohatar > x[center] || x[center] > felsohatar))
        {
            if (x[center] > felsohatar)
            {
                jobb = center - 1;
                data.add("jobb: " + (jobb + 1));
            }
            else
            {
                bal = center + 1;
                data.add("bal: " + (bal + 1));
            }
            center = (bal + jobb) / 2;
            data.add("Center: " + center);
        }
        boolean van = jobb >= bal;
        if (van)
        {
            bal = center;
            while (bal > 0 && x[bal - 1] >= alsohatar)
            {
                bal--;
                data.add("bal " + (bal + 1));
            }
            jobb = center;
            while (x.length - 1 > jobb && felsohatar >= x[jobb + 1])
            {
                jobb++;
                data.add("jobb " + (jobb + 1));
            }
            data.add("Vissza: bal " + (bal + 1) + " jobb: " + (jobb + 1) + " van ");
        }
        else
        {
            data.add("nincs");
        }
        return data;
    }
    public static ArrayList<String> kivalogatasesmaximumszamitas(int[] x)
    {
        ArrayList<String> data = new ArrayList<>();
        int maxertek = -1;
        int max = 0;
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] % 2 == 0 && x[i] > maxertek)
            {
                max = i;
                maxertek = x[i];
            }
        }
        boolean van = maxertek > -1;
        if (van)
        {
            data.add(String.format("van: %1$s, maxindex: %2$s, maxérték: %3$s", van, max + 1, maxertek));
        }
        return data;
    }
    public static ArrayList<String> kivalogatasesmasolas(int[] x)
    {
        ArrayList<String> data = new ArrayList<>();
        int[] y = new int[x.length];
        int db = -1;
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] % 2 == 0)
            {
                db++;
                System.out.println(String.format("db: %1$s", db));
                y[db] = x[i] * x[i]; //ha kell valamin vátoztatni akkor itt kell az x[i]-vel
            }
        }
        data.add(String.format("Kivalogatás és másolás: y = %1$s", Data.TombString(y)));
        return data;
    }




}
