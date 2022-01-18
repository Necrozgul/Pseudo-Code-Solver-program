package com.example.sztf1pszeudo.model;

public class Data {//final kiszedve
    public Data() {
    }

    public Data(String x1, String x2, int value1,int value2, int minvalue, int maxvalue, String lkrszo1, String lkrszo2) {

        this.lkrszo1 = lkrszo1;
        System.out.println(this.lkrszo1);
        this.lkrszo2 = lkrszo2;
        System.out.println(this.lkrszo2);
        this.x1 = setarray(x1);
        this.x2 = setarray(x2);
        this.value1 = value1;
        System.out.println(this.value1);
        this.value2 = value2;
        System.out.println(this.value2);
        this.minvalue = minvalue;
        System.out.println(this.minvalue);
        this.maxvalue = maxvalue;
        System.out.println(this.maxvalue);

    }
    public static int[][]setTerkep(String terkep)
    {
        return null;
    }
    private static int[] setarray(String array)
    {
        if (array.equals("-"))
        {
            return null;
        }
        else
        {
            array.split(",");
            int[] createdarray;
            createdarray=new int[array.split(",").length];
            for (int i = 0; i < createdarray.length; i++) {
                createdarray[i]=Integer.parseInt( array.split(",")[i]);
                System.out.println(createdarray[i]);
            }
            return createdarray;

        }

    }
    private static String setlkrszo1(String data)
    {
        if (data.equals("-"))
        {
            return null;
        }
        else
        {
            return data;
        }
    }
    private static String setlkrszo2(String data)
    {
        if (data.equals("-"))
        {
            return null;
        }
        else
        {
            return data;
        }
    }

    public String lkrszo1;
    public String lkrszo2;
    public int[] x1;
    public int[] x2;
    public int[] x;
    public int value1;
    public int value2;
    public int minvalue;
    public int maxvalue;

    public int[] p;
    public int[] w;

    public int[][] terkep =
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
