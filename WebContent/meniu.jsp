<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List" %>
<%@ page import="date.ProdusCSV" %>
<%@ page import="date.Produs" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Meniu</title>
	
	<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
	<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
	<script src="https://code.jquery.com/jquery-1.9.1.js"></script>
	
	<style>
	
	  /*sursa< https://www.geeksforgeeks.org/how-to-create-table-with-100-width-with-vertical-scroll-inside-table-body-in-html/  */
	table.meniu { 
	    width: 100%; 
	            /* border-collapse: collapse; */ 
	    border-spacing: 0; 
	    border: 1px solid #dddddd; 
	    } 
	          
	        /* To display the block as level element */ 
	   table.meniu tbody, table.meniu thead { 
	        display: block; 
	        }  
	          
	        thead tr th { 
	            height: 20px;  
	            line-height: 1px; 
	        } 
	          
	        table.meniu tbody { 
	            /* Set the height of table body */ 
	            height: 400px;  
	            /* Set vertical scroll */ 
	            overflow-y: auto; 
	            /* Hide the horizontal scroll */ 
	            overflow-x: hidden;  
	        } 
	          
	        tbody {  
	            border-top: 2px solid black; 
	        } 
	        tbody td, thead th { 
	            width : 262px; 
	            border-right: 1px solid #dddddd; 
	        } 
	/*         td { 
	            text-align:center; 
	        }  */  
	  
	/* tbody, td, thead, th {
	  border: 1px solid #dddddd;
	  padding: 2px;
	} */
	
	tr:nth-child(odd) {
	  background-color: #88ff88;
	  font-family: Times;
	  font-size: 15px;
	  color="blue" 
	}
	</style>

</head>

<body>

<nav>
	<button class="baraOptiuni" onclick="location.href='/restaurant/index.html'">Home</button>
    <button class="baraOptiuni" onclick="location.href='/restaurant/adaugaProdusNou.jsp'">Administrator</button>
    <button class="baraOptiuni" onclick="location.href='/restaurant/adaugaProdusNou.jsp'">Ospatar</button>
    <button class="baraOptiuni" onclick="location.href='/restaurant/AfiseazaMeniu'">Client</button>
    <button class="baraOptiuni" onclick="location.href='/restaurant/AfiseazaMeniu'">Meniu</button>
    <button class="baraOptiuni" onclick="location.href='/restaurant/comandaCurenta'">Comanda curenta</button>
</nav>


	<h1 align="center"><b><i>RESTAURANTUL VEDETELOR</i></b></h1>
	<h2 align="center"><b><i>Meniu</i></b></h2>
	
<%-- 	<%
		List listaProduse = (List) pageContext.getAttribute("listaProduse", PageContext.SESSION_SCOPE);
	%> --%>
	
	
	<table class="meniu" style="width:100%" border="1">
		<thead>
			<tr> <!-- Scrierea capului de tabel -->
				<th rowspan="2">Categorie</th>
				<th style="color:red" align="left">Produs</th>
				<th>Pret</th>
				<th>Imagine</th> 
				<th>Cantitate</th>
				<th>Adauga</th>
			</tr>  
			<tr>
				<th align="left" colspan="5" style="color:blue" ><i>Descriere produs</i></th>
			</tr>
		</thead>
			
		<tbody>	
			<c:forEach var="produse" items="${produse}"> 
			
				<tr align="center">
					<td rowspan="2">${produse.getIdCategorie()}</td>
					<td style="color:red" align="left"><b><i>${produse.getIdProdus()}</i>
									 - ${produse.getNumeProdus()}</b></td>
					<!--  <td>${produse.getDescriereProdus()}</td> -->
					<td>${produse.getPretUnitar()}</td>
					<td><img border="3" src="imagini/meniu.jpg" width="120" height="80"></td>
					<td><input type="number" value=0 ></td>
					<%-- <td> <% if(%>${produse.getStoc()}<% &gt; %>${produse.getNivelAlerta()})<% {%>
							<input type="button" value="adauga">
							<%} else if(%>${produse.getStoc()} <% > 0) {%>
							 Intreaba osparatul <%} else { %> 
							 <font color="red">Produsul nu este disponbil!</font> <%}%> </td> --%>
					
					<td><input type="button" value="adauga"/></td>		 
							 
				</tr>
				<tr>
					<td colspan="5" style="color:blue"><i>${produse.getDescriereProdus()}</i></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
<%-- 		<tbody>
			<% for(int i=0; i<listaProduse.size();i++) { %> <!-- scrierea iterativa a meniului -->
				<% ProdusCSV produs = (ProdusCSV) listaProduse.get(i); %>
				<tr align="center">
					<td rowspan="2"><%=produs.getIdCategorie()%></td>
					<td style="color:red" align="left"><b><i><%=produs.getIdProdus() %></i> - <%=produs.getNumeProdus() %></b></td>
					<td><%=produs.getPretUnitar() %></td>
					<td><%=produs.getPoza() %></td>
					<td><input type="number"></td>
					<td><% if(Integer.parseInt(produs.getStoc()) > 10) {%>
							<input type="button" value="adauga">
							<%} else if(Integer.parseInt(produs.getStoc()) > 0) {%>
							 Intreaba osparatul <%} else { %> 
							 <font color="red">Produsul nu este disponbil!</font> <%} %></td>
				</tr>
				<tr>
					<td colspan="5" style="color:blue"><i><%=produs.getDescriereProdus() %></i></td>
				</tr>
			<%}%>
		</tbody> --%>
	</table>
	
	<p></p>
	<p align="right"><input action="AdaugaComanda" type="submit" value="Adauga comanda"></p>
</body>
</html>
