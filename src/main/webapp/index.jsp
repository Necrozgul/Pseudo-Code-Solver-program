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

<label>[X] LKRSZO: lkrszo</label><br>
<label>[X] Kincsestérkép: kincsesterkep</label><br>
<label>[X] 0-1 Hátizsák = hatizsak</label><br>


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
<br><br>
<label>[X] Másolás = masolas</label><br>
<label>[X] Összefuttatás = Osszefuttatas</label><br>
<label>[X] Modositott Osszefuttatas = ModositottOsszefuttatas</label><br>
<label>[X] Kozos elem Letezese = KozoselemLetezese</label><br>
<label>[X] Szetvalogat = Szetvalogat</label><br>
<label>[X] Szetvalogat Egy Tombbe = SzetvalogatEgyTombbe</label><br>
<label>[X] Szetvalogatas Eredetiben = SzetvalogatasEredetiben</label><br>
<br><br>
<label>----------------------------  [ Oszd meg és Uralkodj ]  ----------------------------</label>
<br><br>
<label>[X] K-adiklegkisebbelem = kadiklegkisebbelem</label><br>
<label>[X] Összefésülő rendezés = osszefesulorendezes</label><br>
<label>[X] Gyorsrendezés = gyorsrendezes</label><br>
<label>[X] Felező Maximum Kiválasztás = felezomaximumkivalasztas</label><br>
<label>[X] Logaritmikuskeresesrekurziv = Logaritmikuskeresesrekurziv</label><br>
<label>[X] FibonacciIterativ = FibonacciIterativ</label><br>
<label>[X] LinearisKeresesRekurziv = LinearisKeresesRekurziv</label><br>
<label>[X] aniterativ = aniterativ</label><br>
<label>[X] anrekurziv = anrekurziv</label><br>
<label>[X] anrekurzivfelezes = anrekurzivfelezes</label><br>
<label>[X] towerOfHanoi = towerOfHanoi</label><br>
<br><br>
<label>----------------------------  [ Rendezesek ]  ----------------------------</label>
<br><br>
<label>[X] EgyszeruCseresRendezes</label><br>
<label>[X] MinKivRendezes</label><br>
<label>[X] BuborekRendezes</label><br>
<label>[X] JavitottBuborekRendzes</label><br>
<label>[X] BeillesztesesRendezes</label><br>
<label>[X] JavitottBeillesztesesRendezes</label><br>
<label>[X] NULL = NULL</label><br>
<label>[X] NULL = NULL</label><br>
<label>[X] NULL = NULL</label><br>
<label>[X] NULL = NULL</label><br>
<label>[X] NULL = NULL</label><br>
<label>[X] NULL = NULL</label><br>


<%
for (String item: Osszeepitett.MaximumKivalogatas(Data.x1)
) {
out.println("<br>"+item);

}
%>


</body>
</html>
