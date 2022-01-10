package com.example.sztf1pszeudo.model;

import org.springframework.lang.Nullable;

public class Console {
    public String string;
    public void Write(String data)
    {
        string+=data;
    }
    public void WriteLine(String data)
    {

            string+="<br> "+data;
    }
    public void WriteLine()
    {
        string+="<br>";
    }
}
