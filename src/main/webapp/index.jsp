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
        <input type="text" id="text" name="text" value="-"><br>
    <label for="Array1">Array1 Data: like--> 3,6,8</label><br>
        <input type="text" id="array1" name="array1" value="-"><br>
    <label for="array2">Array2 Data: like--> 3,6,8</label><br>
        <input type="text" id="array2" name="array2" value="-"><br>
    <label for="value1">Value1 Number</label><br>
        <input type="number" id="value1" name="value1" value="0"><br>
    <label for="value2">Value2 Number</label><br>
        <input type="number" id="value2" name="value2" value="0"><br>
    <label for="minvalue">Minimum value</label><br>
        <input type="number" id="minvalue" name="minvalue" value="0"><br>
    <label for="maxvalue">Maximum value</label><br>
        <input type="number" id="maxvalue" name="maxvalue" value="0"><br>
    <label for="text1">LKRSZO1</label><br>
        <input type="text" id="text1" name="text1" value="-"/><br>
    <label for="text2">LKRSZO2:</label><br>
        <input type="text" id="text2" name="text2" value="-"/><br>
    <br>
    <input type="submit" value="Submit">
</form>
<label>----------------------------  [ Optimalizalas ]  ----------------------------</label><br>
<label>[X] LKRSZO: lkrszo</label><br>
<label>[X] Kincsestérkép: kincsesterkep</label><br>
<label>[X] 0-1 Hátizsák = hatizsak</label><br>
<label>----------------------------  [ Osszeépített ]  ----------------------------</label><br>
<label>[X] [Array1] = maxkivalogat</label><br>
<label>[X] [Array1] és Maxkiválasztás = masolasesmaximumkivalasztas</label><br>
<label>[X] [Array1,value1] = megszamolaseskereses</label><br>
<label>[X] [Array1] = maximumkivalasztaseskivalogatas</label><br>
<label>[X] [Array1] = maxkivalasztaseskivalogatas</label><br>
<label>[X] [Array1] = kivalogatasessorozatszamitas</label><br>
<label>[X] [Array1,value1]  = kivalogataskendezettben</label><br>
<label>[X] [Array1,value1,value2] = keresesesmegszamolas</label><br>
<label>[X] [Array1,value1,value2] = megszamolasmsmereses</label><br>
<label>[X] [Array1] = ismetlodeskiszurese</label><br>
<label>[X] [Array1,Minvalue,Maxvalue] = modositottkivalogatas</label><br>
<label>[X] [Array1] = kivalogatasesmaximumszamitas</label><br>
<label>[X] [Array1] = kivalogatasesmasolas</label><br>
<label>----------------------------  [ Osszetett ]  ----------------------------</label><br>
<label>[X] [Array1,Value1] = masolas</label><br>
<label>[X] [Array1,Array2] = Osszefuttatas</label><br>
<label>[X] [Array1,Array2] = ModositottOsszefuttatas</label><br>
<label>[X] [Array1,Array2] = KozoselemLetezese</label><br>
<label>[X] [Array1] = Szetvalogat</label><br>
<label>[X] [Array1] = SzetvalogatEgyTombbe</label><br>
<label>[X] [Array1] = SzetvalogatasEredetiben</label><br>
<label>----------------------------  [ Oszd meg és Uralkodj ]  ----------------------------</label><br>
<label>[X] [Array1,Value1] = kadiklegkisebbelem</label><br>
<label>[X] [Array1] = osszefesulorendezes</label><br>
<label>[X] [Array1] = gyorsrendezes</label><br>
<label>[X] [Array1] = felezomaximumkivalasztas</label><br>
<label>----------------------------  [ rekurzív ]  ----------------------------</label><br>
<label>[X] [Array1] = MaxKivalasztasRekurziv</label><br>
<label>[X] [Array1,Value1] = Logaritmikuskeresesrekurziv</label><br>
<label>[X] [Value1] = FibonacciIterativ</label><br>
<label>[X] [Array1,Value1] = LinearisKeresesRekurziv</label><br>
<label>[X] [Value1,Value2] = aniterativ</label><br>
<label>[X] [Value1,Value2] = anrekurziv</label><br>
<label>[X] [Value1,Value2] = anrekurzivfelezes</label><br>
<label>[X] [Data.Value1] = towerOfHanoi</label><br>
<label>----------------------------  [ Rendezesek ]  ----------------------------</label><br>
<label>[X] [Array1] = EgyszeruCseresRendezes</label><br>
<label>[X] [Array1] = MinKivRendezes</label><br>
<label>[X] [Array1] = BuborekRendezes</label><br>
<label>[X] [Array1] = JavitottBuborekRendzes</label><br>
<label>[X] [Array1] = BeillesztesesRendezes</label><br>
<label>[X] [Array1] = JavitottBeillesztesesRendezes</label><br>
<label>----------------------------  [ Rendezettomb ]  ----------------------------</label><br>
<label>[X] [Array1,Value1] = logaritmuskeresesiterativ</label><br>
<label>[X] [Array1,Value1] = eldontesrendezettbe</label><br>
<label>[X] [Array1,Value1,Value2] = modositotteldontesrendezettbe</label><br>
<label>[X] [Array1,Value1] = kivalasztas</label><br>
<label>[X] [Array1,Value1] = kivalogatasrendezettbe</label><br>
<label>[X] [Array1,Value1,Value2] = modositottkivalogatasrendezettbe</label><br>
<label>[X] [Array1,Value1] = megszamlalas</label><br>
<label>----------------------------  [ Halmaz ]  ----------------------------</label><br>
<label>[X] [Array1,Array2] = Metszet</label><br>
<label>[X] [Array1,Array2] = HalmazUnio</label><br>
<label>[X] [Array1,Array2] = Unio</label><br>
<label>[X] [Array1,Array2] = Osszefesul</label><br>
<label>[X] [Array1] = HalmazTulajdonsagVizsgalta</label><br>
<label>[X] [Array1,Array2] = ReszhalmazE</label><br>
<label>[X] [Array1] = HalmazLetrehozas</label><br>
<label>[X] [Array1,value1] = TartalmazasVizsgalat</label><br>

</body>
</html>
