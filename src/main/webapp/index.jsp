<%@ page import="java.io.ByteArrayOutputStream" %>
<%@ page import="java.io.PrintStream" %>
<%@ page import="com.example.sztf1pszeudo.model.*" %><%--
<%@ page import="com.example.sztf1pszeudo.model.Osszetett" %><%--
  Created by IntelliJ IDEA.
  User: msand
  Date: 2021. 12. 03.
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Válasz</title>
</head>
<body>
<form action="/distributor" method="post">
    <label for="text">Pszeudo name:</label><br>
    <input type="text" id="text" name="text"><br>
    <input type="submit" value="Submit">
</form>
<label>----------------------------  [ Optimalizalas ]  ----------------------------</label>
<br>
<label>[X] LKRSZO: lkrszo</label><br>
<label>[X] Kincsestérkép: kincsesterkep</label><br>
<label>[X] 0-1 Hátizsák = hatizsak</label><br>

<label>----------------------------  [ Osszeépített ]  ----------------------------</label>
<br>
<label>[X] MaximumKiválogatás = maxkivalogat</label><br>
<label>[X] Másolás és Maxkiválasztás = masolasesmaximumkivalasztas</label><br>
<label>[X] Összeszámolja hányszeor szerepel a keresett elem = megszamolaseskereses</label><br>
<label>[X] maximumkiválasztás és Kiválogatás = maximumkivalasztaseskivalogatas</label><br>
<label>[X] maxkiválasztás és Kiválogatás = maxkivalasztaseskivalogatas</label><br>
<label>[X] Kiválogatás és sorozatszámítás = kivalogatasessorozatszamitas</label><br>
<label>[X] Kiválogatás Rendezett Tömbben = kivalogataskendezettben</label><br>
<label>[X] Keres X Darab elemet = keresesesmegszamolas</label><br>
<label>[X] Ismétlődés kiszűrése = ismetlodeskiszurese</label><br>
<label>[X] Módositott Kivalogatás = modositottkivalogatas</label><br>
<label>[X] Kiválogatás és Maximumszamitas = kivalogatasesmaximumszamitas</label><br>
<label>[X] Kiválogatás és Másolás = kivalogatasesmasolas</label><br>
<label>----------------------------  [ Osszetett ]  ----------------------------</label>
<br>
<label>[X] masolas</label><br>
<label>[X] Osszefuttatas</label><br>
<label>[X] ModositottOsszefuttatas</label><br>
<label>[X] KozoselemLetezese</label><br>
<label>[X] Szetvalogat</label><br>
<label>[X] SzetvalogatEgyTombbe</label><br>
<label>[X] SzetvalogatasEredetiben</label><br>
<br><br>
<label>----------------------------  [ Oszd meg és Uralkodj ]  ----------------------------</label><br>
<label>[X] kadiklegkisebbelem</label><br>
<label>[X] osszefesulorendezes</label><br>
<label>[X] gyorsrendezes</label><br>
<label>[X] felezomaximumkivalasztas</label><br>
<label>----------------------------  [ rekurzív ]  ----------------------------</label><br>
<label>[X] MaxKivalasztasRekurziv</label><br>
<label>[X] Logaritmikuskeresesrekurziv</label><br>
<label>[X] FibonacciIterativ</label><br>
<label>[X] LinearisKeresesRekurziv</label><br>
<label>[X] aniterativ</label><br>
<label>[X] anrekurziv</label><br>
<label>[X] anrekurzivfelezes</label><br>
<label>[X] towerOfHanoi</label><br>
<br><br>
<label>----------------------------  [ Rendezesek ]  ----------------------------</label><br>
<label>[X] EgyszeruCseresRendezes</label><br>
<label>[X] MinKivRendezes</label><br>
<label>[X] BuborekRendezes</label><br>
<label>[X] JavitottBuborekRendzes</label><br>
<label>[X] BeillesztesesRendezes</label><br>
<label>[X] JavitottBeillesztesesRendezes</label><br>
<br><br>
<label>----------------------------  [ Rendezesek ]  ----------------------------</label><br>
<label>[X] logaritmuskeresesiterativ</label><br>
<label>[X] eldontesrendezettbe</label><br>
<label>[X] modositotteldontesrendezettbe</label><br>
<label>[X] kivalogatasrendezettbe</label><br>
<label>[X] modositottkivalogatasrendezettbe</label><br>
<label>[X] megszamlalas</label><br>

</body>
</html>
