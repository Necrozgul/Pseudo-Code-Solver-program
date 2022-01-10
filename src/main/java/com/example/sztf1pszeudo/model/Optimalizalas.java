package com.example.sztf1pszeudo.model;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Optimalizalas {
    public static int Max(int a, int b) {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static ArrayList<String> LKRSZO(String a, String b) {
        ArrayList<String>data=new ArrayList<>();
        int[][] seged = new int[a.length() + 1][b.length() + 1]; //a-vertical b-horizontal
        String textline="";
        for (int i = 0; i < (seged.length == 0 ? 0 : seged[0].length); i++)
        {
            for (int j = 0; j < seged.length; j++)
            {

                if (j > 0 && i > 0)
                {
                    if (a.charAt(j - 1) == b.charAt(i - 1))
                    {
                        seged[j][i] = seged[j - 1][i - 1] + 1;
                    }
                    else if (seged[j - 1][i] > seged[j][i] || seged[j][i - 1] > seged[j][i])
                    {
                        seged[j][i] = Max(seged[j][i - 1], seged[j - 1][i]);
                    }
                }
                textline+=(seged[j][i] + " ");
            }
            if (i > 0)
            {
                textline+=b.charAt(i - 1);
            }

            data.add(textline);
            textline="";
        }
        textline+="   ";
        String text ="";
        for (int i = 0; i < a.length(); i++)
        {

            text+=(a.charAt(i) + " ");
        }
        data.add(text);
        return data;
    }

    public static ArrayList<String> KincsesTerkep(int[][] terkep) {
        ArrayList<String> data=new ArrayList<>();
        String text ="";
        int[][] seged = new int[terkep.length][(terkep.length == 0 ? 0 : terkep[0].length)];
        seged[terkep.length - 1][0] = terkep[terkep.length - 1][0];
        for (int i = 1; i < (terkep.length == 0 ? 0 : terkep[0].length); i++)
        {
            seged[terkep.length - 1][i] = seged[terkep.length - 1][i - 1] + terkep[terkep.length - 1][i];
        }
        for (int i = terkep.length - 1; i > 0 ; i--)
        {
            seged[i - 1][0] = seged[i][0] + terkep[i - 1][0];
        }
        for (int i = terkep.length - 2; i >= 0; i--)
        {
            for (int j = 1; j < (terkep.length == 0 ? 0 : terkep[0].length); j++)
            {
                seged[i][j] = Max(seged[i + 1][j], seged[i][j - 1]) + terkep[i][j];
            }
        }
        for (int i = 0; i < seged.length; i++)
        {
            for (int j = 0; j < (seged.length == 0 ? 0 : seged[0].length); j++)
            {
                text+=(seged[i][j]+" ");
            }
            data.add(text);
            text="";

            data.add(text);
        }
        return data;
    }

    public static ArrayList<String> Hatizsak(int[] p, int[] w, int c) {
        int[][] seged = new int[p.length + 1][c + 1];
        ArrayList<String> data=new ArrayList<>();
        String text ="";

        for (int y = 1; y <= p.length; y++)
        {
            for (int x = 1; x < (seged.length == 0 ? 0 : seged[0].length); x++)
            {
                if (x >= w[y - 1])
                {
                    seged[y][x] = Max(seged[y - 1][x], seged[y - 1][x - w[y - 1]] + p[y - 1]);
                }
                else
                {
                    seged[y][x] = seged[y - 1][x];
                }
            }
        }
        for (int i = 0; i < seged.length; i++)
        {
            for (int j = 0; j < (seged.length == 0 ? 0 : seged[0].length); j++)
            {
                text+=(seged[i][j]+" ");
            }
            data.add(text);
            text="";

            data.add(text);
        }
        return data;
    }

}
