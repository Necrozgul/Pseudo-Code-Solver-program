package com.example.sztf1pszeudo.controller;


import com.example.sztf1pszeudo.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class WebController {

    @GetMapping("/")
    public String loadIndex(HttpSession session) {
        session.setAttribute("displayerror", "none");
        return "index.jsp";
    }

    @PostMapping("/register")
    public String registerNewUser(@RequestParam("commenttext") String text, @RequestParam("id") Integer id, HttpSession session)
    {
        return "main.jsp";
    }

    @PostMapping("/distributor")
    public String Distributor(@RequestParam("text") String text, HttpSession session)
    {
        String returndata ="";
        if (text.equals("lkrszo"))
        {
            for (String item: Optimalizalas.LKRSZO("CALLCENTER", "CALENDAR")
            ) {
                returndata+=("</br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
        else if(text.equals("kincsesterkep"))
        {
            for (String item:Optimalizalas.KincsesTerkep(Data.terkep)
            ) {
                returndata+=("</br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
        else if(text.equals("hatizsak"))
        {
            for (String item:Optimalizalas.Hatizsak(Data.w, Data.p, 5)
            ) {
                returndata+=("</br>"+item);
            }
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
        else if(text.equals("maxkivalogat"))
        {
            for (String item: Osszeepitett.MaximumKivalogatas(Data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("masolasesmaximumkivalasztas"))
        {
            for (String item: Osszeepitett.masolasesmaximumkivalasztas(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("megszamolaseskereses"))
        {
            for (String item: Osszeepitett.megszamolaseskereses(Data.x,5)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("maximumkivalasztaseskivalogatas"))
        {
            for (String item: Osszeepitett.maximumkivalasztaseskivalogatas(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("maxkivalasztaseskivalogatas"))
        {
            for (String item: Osszeepitett.MaxKivalasztasEsKivalogatas(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasessorozatszamitas"))
        {
            for (String item: Osszeepitett.kivalogatasessorozatszamitas(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogataskendezettben"))
        {
            for (String item: Osszeepitett.KivalogatasRendezettben(Data.x, 3)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("megszamolasmsmereses"))//Ebből kettő van
        {
            for (String item: Osszeepitett.keresesesmegszamolas(Data.x, 3, 3)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("ismetlodeskiszurese"))
        {
            for (String item: Osszeepitett.IsmetlodesekKiszurese(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("modositottkivalogatas"))
        {
            for (String item: Osszeepitett.ModositottKivalogatas(Data.x,3,7)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasesmaximumszamitas"))
        {
            for (String item: Osszeepitett.kivalogatasesmaximumszamitas(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasesmasolas"))
        {
            for (String item: Osszeepitett.kivalogatasesmasolas(Data.x)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("masolas"))
        {
            for (String item: Osszetett.Masolas(Data.x, Data.ertek)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Osszefuttatas"))
        {
            for (String item: Osszetett.Osszefuttatas(Data.x1, Data.x2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("ModositottOsszefuttatas"))
        {
            for (String item: Osszetett.ModositottOsszefuttatas(Data.x1, Data.x2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("KozoselemLetezese"))
        {
            for (String item: Osszetett.KozoselemLetezese(Data.x1, Data.x2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Szetvalogat"))
        {
            for (String item: Osszetett.Szetvalogat(Data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("SzetvalogatEgyTombbe"))
        {
            for (String item: Osszetett.SzetvalogatEgyTombbe(Data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("SzetvalogatasEredetiben"))
        {
            for (String item: Osszetett.SzetvalogatasEredetiben(Data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kadiklegkisebbelem"))
        {
            Oszdmegesuralkodj.kadiklegkisebbelem(Data.x,0,Data.x.length-1,8);
            for (String item: Oszdmegesuralkodj.kadiklegkisebbelemstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("osszefesulorendezes"))
        {
            Oszdmegesuralkodj.osszefesulorendezes(Data.x,0,Data.x.length-1);
            for (String item: Oszdmegesuralkodj.osszefesulorendezesstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("gyorsrendezes"))
        {
            Oszdmegesuralkodj.gyorsrendezes(Data.x,0,Data.x.length-1);
            for (String item: Oszdmegesuralkodj.gyorsrendezesstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("felezomaximumkivalasztas"))
        {
            Oszdmegesuralkodj.felezomaximumkivalasztas(Data.x,0,Data.x.length-1);
            for (String item: Oszdmegesuralkodj.felezomaxkivalasztasstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("MaxKivalasztasRekurziv"))
        {
            Rekurziv.MaxKivalasztasRekurziv(Data.x,Data.x.length-1);
            for (String item: Rekurziv.MaxKivalasztasRekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Logaritmikuskeresesrekurziv"))
        {
            Rekurziv.Logaritmikuskeresesrekurziv(Data.x,0,Data.x.length-1,6);
            for (String item: Rekurziv.Logaritmikuskeresesrekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("FibonacciIterativ"))
        {
            for (String item: Rekurziv.FibonacciIterativ(7)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("LinearisKeresesRekurziv"))
        {
            Rekurziv.LinearisKeresesRekurziv(Data.x,3,0);
            for (String item: Rekurziv.LinearisKeresesRekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("aniterativ"))
        {
            for (String item: Rekurziv.aniterativ(Data.ertek,3)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("anrekurziv"))
        {
            Rekurziv.anrekurziv(Data.ertek,3);
            for (String item: Rekurziv.anrekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("anrekurzivfelezes"))
        {
            Rekurziv.anrekurzivfelezes(Data.ertek,4);
            for (String item: Rekurziv.anrekurzivfelezesstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("towerOfHanoi"))
        {
            Rekurziv.towerOfHanoi(Data.ertek, 'A', 'C', 'B');
            for (String item: Rekurziv.towersofhanoistring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("EgyszeruCseresRendezes"))
        {
            for (String item: Rendezesek.EgyszeruCseresRendezes(Data.x)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("MinKivRendezes"))
        {
            for (String item: Rendezesek.MinKivRendezes(Data.x)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("BuborekRendezes"))
        {
            for (String item: Rendezesek.BuborekRendezes(Data.x)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("JavitottBuborekRendzes"))
        {
            for (String item: Rendezesek.JavitottBuborekRendzes(Data.x)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("BeillesztesesRendezes"))
        {
            for (String item: Rendezesek.BeillesztesesRendezes(Data.x)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("JavitottBeillesztesesRendezes"))
        {
            for (String item: Rendezesek.JavitottBeillesztesesRendezes(Data.x)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else
        {
            returndata="A keresett pszeudo nem létezik!";
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
    }
}
