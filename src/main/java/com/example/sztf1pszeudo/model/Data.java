package com.example.sztf1pszeudo.model;

public final class Data {
    public Data() {
    }

    public int[] getX1() {
        return x1;
    }

    public void setX1(int[] x1) {
        this.x1 = x1;
    }

    public int[] getX2() {
        return x2;
    }

    public void setX2(int[] x2) {
        this.x2 = x2;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public static int getErtek() {
        return ertek;
    }

    public static void setErtek(int ertek) {
        Data.ertek = ertek;
    }

    public static int[] x1 = new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    public static int[] x2 = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
    public static int[] x = new int[] {3, 1, 6, 10, 8, 2, 7, 9, 4, 12, 11};
    public static int ertek = 5;

    public static int[] p = {2, 1, 3, 4};
    public static int[] w = {2, 2, 1, 3};

    public static int[][] terkep =
            {
                    {9, 1, 8, 1, 1},
                    {6, 0, 5, 4, 6},
                    {3, 4, 1, 4, 3},
                    {4, 2, 1, 2, 4},
                    {1, 8, 3, 5, 6}
            };
    public static boolean P(int x)
    {
        return x % 2 == 0;
    }

    public static String TombString(int[] x)
    {
        String s = "{";
        for (int i = 0; i < x.length; i++)
        {
            s += x[i];
            if (i != x.length - 1)
            {
                s += ", ";
            }
        }
        return s + "}";
    }

    public static String MatrixString(int[][] x)
    {
        String s = "";
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < (x.length == 0 ? 0 : x[0].length); j++)
            {
                s += x[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }







}
