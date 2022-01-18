package com.example.sztf1pszeudo.controller;


import com.example.sztf1pszeudo.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class WebController {
    @PostMapping("/data")
    public static void Feldolgoz(
            @RequestParam("array1") String array1,
            @RequestParam("array2") String array2,
            @RequestParam("sortedarray1") String sortedarray1,
            @RequestParam("value1") Integer value1,
            @RequestParam("minvalue") Integer minvalue,
            @RequestParam("maxvalue") Integer maxvalue,
            @RequestParam("parray") String parray,
            @RequestParam("warray") String warray,
            @RequestParam("terkep") String terkep,
            HttpSession session
    )
    {



    }
    @GetMapping("/")
    public String loadIndex(HttpSession session) {
        session.setAttribute("displayerror", "none");
        return "index.jsp";

    }
    @PostMapping("/distributor")
    public String Distributor(
            @RequestParam("text") String text,
            @RequestParam("array1") String array1,
            @RequestParam("array2") String array2,
            @RequestParam("value1") Integer value1,
            @RequestParam("value2") Integer value2,
            @RequestParam("minvalue") Integer minvalue,
            @RequestParam("maxvalue") Integer maxvalue,
            @RequestParam("text1") String lkrszo1,
            @RequestParam("text2") String lkrszo2,
            HttpSession session)
    {

        Oszdmegesuralkodj.Reset();
        Rekurziv.Reset();
        text=text.trim();
        String returndata ="";
        Data data = new Data(array1,array2,value1,value2,minvalue,maxvalue,lkrszo1,lkrszo2);
        // Optimalizálás
        if (text.equals("lkrszo"))
        {
            for (String item: Optimalizalas.LKRSZO(data.lkrszo1, data.lkrszo2)
            ) {
                returndata+=("</br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
        else if(text.equals("kincsesterkep"))
        {
            for (String item:Optimalizalas.KincsesTerkep(data.terkep)
            ) {
                returndata+=("</br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
        else if(text.equals("hatizsak"))
        {
            for (String item:Optimalizalas.Hatizsak(data.x1, data.x2, value1)
            ) {
                returndata+=("</br>"+item);
            }
            session.setAttribute("data", returndata);
            return "main.jsp";
        }
        // Összeépített
        else if(text.equals("maxkivalogat"))
        {
            for (String item: Osszeepitett.MaximumKivalogatas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("masolasesmaximumkivalasztas"))
        {
            for (String item: Osszeepitett.masolasesmaximumkivalasztas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("megszamolaseskereses"))
        {
            for (String item: Osszeepitett.megszamolaseskereses(data.x1,data.value1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("maximumkivalasztaseskivalogatas"))
        {
            for (String item: Osszeepitett.maximumkivalasztaseskivalogatas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("maxkivalasztaseskivalogatas"))
        {
            for (String item: Osszeepitett.MaxKivalasztasEsKivalogatas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasessorozatszamitas"))
        {
            for (String item: Osszeepitett.kivalogatasessorozatszamitas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogataskendezettben"))
        {
            for (String item: Osszeepitett.KivalogatasRendezettben(data.x1, data.value1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("megszamolasmsmereses"))//Ebből kettő van
        {
            for (String item: Osszeepitett.keresesesmegszamolas(data.x1, value1, data.value2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("ismetlodeskiszurese"))
        {
            for (String item: Osszeepitett.IsmetlodesekKiszurese(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("modositottkivalogatas"))
        {
            for (String item: Osszeepitett.ModositottKivalogatas(data.x1,data.minvalue,data.maxvalue)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasesmaximumszamitas"))
        {
            for (String item: Osszeepitett.kivalogatasesmaximumszamitas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasesmasolas"))
        {
            for (String item: Osszeepitett.kivalogatasesmasolas(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        // Összetett
        else if(text.equals("masolas"))
        {
            for (String item: Osszetett.Masolas(data.x1, data.value1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Osszefuttatas"))
        {
            for (String item: Osszetett.Osszefuttatas(data.x1, data.x2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("ModositottOsszefuttatas"))
        {
            for (String item: Osszetett.ModositottOsszefuttatas(data.x1, data.x2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("KozoselemLetezese"))
        {
            for (String item: Osszetett.KozoselemLetezese(data.x1, data.x2)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Szetvalogat"))
        {
            for (String item: Osszetett.Szetvalogat(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("SzetvalogatEgyTombbe"))
        {
            for (String item: Osszetett.SzetvalogatEgyTombbe(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("SzetvalogatasEredetiben"))
        {
            for (String item: Osszetett.SzetvalogatasEredetiben(data.x1)
            ) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        // Oszd meg és uralkodj
        else if(text.equals("kadiklegkisebbelem"))
        {
            Oszdmegesuralkodj.kadiklegkisebbelem(data.x1,0,data.x1.length-1,8);
            for (String item: Oszdmegesuralkodj.kadiklegkisebbelemstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("osszefesulorendezes"))
        {
            Oszdmegesuralkodj.osszefesulorendezes(data.x1,0,data.x1.length-1);
            for (String item: Oszdmegesuralkodj.osszefesulorendezesstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("gyorsrendezes"))
        {
            Oszdmegesuralkodj.gyorsrendezes(data.x1,0,data.x1.length-1);
            for (String item: Oszdmegesuralkodj.gyorsrendezesstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("felezomaximumkivalasztas"))
        {
            Oszdmegesuralkodj.felezomaximumkivalasztas(data.x1,0,data.x1.length-1);
            for (String item: Oszdmegesuralkodj.felezomaxkivalasztasstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        // Rekurziv
        else if(text.equals("MaxKivalasztasRekurziv"))
        {
            Rekurziv.MaxKivalasztasRekurziv(data.x1,data.x1.length-1);
            for (String item: Rekurziv.MaxKivalasztasRekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Logaritmikuskeresesrekurziv"))
        {
            Rekurziv.Logaritmikuskeresesrekurziv(data.x1,0,data.x1.length-1,6);
            for (String item: Rekurziv.Logaritmikuskeresesrekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("FibonacciIterativ"))
        {
            for (String item: Rekurziv.FibonacciIterativ(data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("LinearisKeresesRekurziv"))
        {
            Rekurziv.LinearisKeresesRekurziv(data.x1,data.value1,0);
            for (String item: Rekurziv.LinearisKeresesRekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("aniterativ"))
        {
            for (String item: Rekurziv.aniterativ(data.value1,data.value2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("anrekurziv"))
        {
            Rekurziv.anrekurziv(data.value1,data.value2);
            for (String item: Rekurziv.anrekurzivstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("anrekurzivfelezes"))
        {
            Rekurziv.anrekurzivfelezes(data.value1,data.value2);
            for (String item: Rekurziv.anrekurzivfelezesstring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("towerOfHanoi"))
        {
            Rekurziv.towerOfHanoi(data.value1, 'A', 'C', 'B');
            for (String item: Rekurziv.towersofhanoistring) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        // Rendezesek
        else if(text.equals("EgyszeruCseresRendezes"))
        {
            for (String item: Rendezesek.EgyszeruCseresRendezes(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("MinKivRendezes"))
        {
            for (String item: Rendezesek.MinKivRendezes(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("BuborekRendezes"))
        {
            for (String item: Rendezesek.BuborekRendezes(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("JavitottBuborekRendzes"))
        {
            for (String item: Rendezesek.JavitottBuborekRendzes(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("BeillesztesesRendezes"))
        {
            for (String item: Rendezesek.BeillesztesesRendezes(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("JavitottBeillesztesesRendezes"))
        {
            for (String item: Rendezesek.JavitottBeillesztesesRendezes(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        // Rendezettomb
        else if(text.equals("logaritmuskeresesiterativ"))
        {
            for (String item: Rendezettömb.logaritmuskeresesiterativ(data.x1, data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("eldontesrendezettbe"))
        {
            for (String item: Rendezettömb.eldontesrendezettbe(data.x1, data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("modositotteldontesrendezettbe"))
        {
            for (String item: Rendezettömb.modositotteldontesrendezettbe(data.x1, data.value1,data.value2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalasztas"))
        {
            for (String item: Rendezettömb.kivalasztas(data.x1, data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("kivalogatasrendezettbe"))
        {
            for (String item: Rendezettömb.kivalogatasrendezettbe(data.x1, data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("modositottkivalogatasrendezettbe"))
        {
            for (String item: Rendezettömb.modositottkivalogatasrendezettbe(data.x1, data.minvalue,data.maxvalue)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("megszamlalas"))
        {
            for (String item: Rendezettömb.megszamlalas(data.x1, data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        //Halmaz
        else if(text.equals("Metszet"))
        {
            for (String item: Halmaz.Metszet(data.x1, data.x2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("HalmazUnio"))
        {
            for (String item: Halmaz.HalmazUnio(data.x1, data.x2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Unio"))
        {
            for (String item: Halmaz.Unio(data.x1, data.x2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("Osszefesul"))
        {
            for (String item: Halmaz.Osszefesul(data.x1, data.x2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("HalmazTulajdonsagVizsgalta"))
        {
            for (String item: Halmaz.HalmazTulajdonsagVizsgalta(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("ReszhalmazE"))
        {
            for (String item: Halmaz.ReszhalmazE(data.x1, data.x2)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("HalmazLetrehozas"))
        {
            for (String item: Halmaz.HalmazLetrehozas(data.x1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        else if(text.equals("TartalmazasVizsgalat"))
        {
            for (String item: Halmaz.TartalmazasVizsgalat(data.x1, data.value1)) {
                returndata+=("<br>"+item);

            }
            session.setAttribute("data", returndata);
            return "main.jsp";

        }
        //Nincsen elem
        else
        {
            returndata="A keresett pszeudo nem létezik!";
            session.setAttribute("data", returndata);
            return "index.jsp";
        }
    }
}
