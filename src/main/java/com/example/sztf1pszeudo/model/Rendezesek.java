package com.example.sztf1pszeudo.model;

import java.util.ArrayList;

public class Rendezesek {
    public static ArrayList<String> EgyszeruCseresRendezes(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++)
        {
            data.add(String.format("i: %1$s", i + 1));
            for (int j = i + 1; j < a.length; j++)
            {
                data.add(String.format("j: %1$s", j + 1));
                if (a[i] > a[j])
                {
                    int seged = a[i];
                    a[i] = a[j];
                    a[j] = seged;
                }
            }
        }
        return data;
    }
    public static ArrayList<String> MinKivRendezes(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++)
        {
            data.add(String.format("i: %1$s", i + 1));
            int min = i;
            data.add(String.format("min: %1$s", i + 1));
            for (int j = i + 1; j < a.length; j++)
            {
                data.add(String.format("j: %1$s", j + 1));
                if (a[min] > a[j])
                {
                    min = j;
                    data.add(String.format("min: %1$s", j + 1));
                }
            }
            int seged = a[i];
            a[i] = a[min];
            a[min] = seged;
        }
        return data;
    }
    public static ArrayList<String> BuborekRendezes(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        for (int i = a.length - 1; i > 1; i--)
        {
            data.add(String.format("i: %1$s", i + 1));
            for (int j = 0; j < i; j++)
            {
                data.add(String.format("j: %1$s", j + 1));
                if (a[j] > a[j + 1])
                {
                    //Console.WriteLine($"i: {i + 1},j: {j + 1}");
                    int seged = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = seged;
                }
            }
        }
        return  data;
    }
    public static ArrayList<String> JavitottBuborekRendzes(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        int i = a.length - 1;
        data.add(String.format("i: %1$s", i + 1));
        while (i >= 1)
        {
            int idx = 0;
            System.out.println(String.format("idx: %1$s", idx + 1));
            for (int j = 0; j < i; j++)
            {
                data.add(String.format("j: %1$s", j + 1));
                if (a[j] > a[j + 1])
                {
                    //Console.WriteLine($"i: {i + 1},j: {j + 1}");
                    int seged = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = seged;
                    idx = j;
                    data.add(String.format("idx: %1$s", idx + 1));
                }
            }
            i = idx;
            data.add(String.format("i: %1$s", i + 1));
        }
        return data;
    }
    public static ArrayList<String> BeillesztesesRendezes(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i < a.length; i++)
        {
            data.add(String.format("i: %1$s", i + 1));
            int j = i - 1;
            data.add(String.format("j: %1$s", j + 1));
            while (j >= 0 && a[j] > a[j + 1])
            {
                int seged = a[j];
                a[j] = a[j + 1];
                a[j + 1] = seged;
                j--;
                data.add(String.format("j: %1$s", j + 1));
            }
        }
        return data;
    }
    public static ArrayList<String> JavitottBeillesztesesRendezes(int[] a)
    {
        ArrayList<String> data = new ArrayList<>();
        for (int i = 1; i < a.length; i++)
        {
            data.add(String.format("i: %1$s", i + 1));
            int j = i - 1;
            data.add(String.format("j: %1$s", j + 1));
            int seged = a[i];
            while (j >= 0 && a[j] > seged)
            {
                a[j + 1] = a[j];
                j--;
                data.add(String.format("j: %1$s", j + 1));
            }
            a[j + 1] = seged;
        }
        return data;
    }
}
