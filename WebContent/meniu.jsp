<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List" %>
<%@ page import="date.ProdusCSV" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Meniu</title>
	
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
	            width : 160px; 
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
	<h1 align="center"><b><i>RESTAURANTUL VEDETELOR</i></b></h1>
	<h2 align="center"><b><i>Meniu</i></b></h2>
	
	<%
		List listaProduse = (List) pageContext.getAttribute("listaProduse", PageContext.SESSION_SCOPE);
	%>
	
<%-- 	<% 
		List listaProduse = (List) MeniuManager.getAttribute("listaProduse", PageContext.SESSION_SCOPE); 
 	%> --%>
	

	<table class="meniu" style="width:100%" border="1">
		<thead>
			<tr> <!-- Scrierea capului de tabel -->
				<th rowspan="2">Categorie</th>
				<th style="color:red" align="left">Produs</th>
				<!--  <th>Descriere produs</th> A fost mutat pe randul 2-->
				<th>Pret</th>
				<th>Imagine</th>
				<th>Cantitate</th>
				<th>Adauga</th>
			</tr>  
			<tr>
				<th align="left" colspan="5" style="color:blue"><i>Descriere produs</i></th>
			</tr>
		</thead>
			
		<tbody>
			<% for(int i=0; i<listaProduse.size();i++) { %> <!-- scrierea iterativa a meniului -->
				<% ProdusCSV produs = (ProdusCSV) listaProduse.get(i); %>
				<tr align="center">
					<td rowspan="2"><%=produs.getCategorie()%></td>
					<td style="color:red" align="left"><b><i><%=produs.getIdProdus() %></i> - <%=produs.getNumeProdus() %></b></td>
					<!--  <td><%=produs.getDescriereProdus() %></td> -->
					<td><%=produs.getPretUnitar() %></td>
					<%-- <td><%=produs.getPoza() %></td> --%>
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
		</tbody>
	</table>
	
	<p></p>
	<p align="right"><input action="AdaugaComanda" type="button" value="Adauga comanda"></p>
</body>
</html>
