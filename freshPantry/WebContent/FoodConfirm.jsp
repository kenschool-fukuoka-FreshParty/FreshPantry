<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="fPBean.FoodBean"%>
<%
	String no = (String)request.getAttribute("no");
	String food_name = (String)request.getAttribute("food_name");

	FoodBean fBean = (FoodBean)request.getAttribute("foodB");

	String res = (String)request.getAttribute("result");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>内容確認</title>
</head>
<body>
<div align="center">

<h1><font color="orange">内容確認</font></h1>
<br/>
<form action="FoodEntryConfirmService" method="post" />
<table border="0">
<tr>
       <th>・食材名</th><td><%=fBean.getFoodName()%></td>
     </tr>
     <tr>
       <th>・残量</th><td><%=fBean.getQuantity()%><%=fBean.getUnit()%></td>
     </tr>
     <tr>
       <th>・購入日</th><td><%=fBean.getPurchaseDate()%></td>
     </tr>
     <tr>
       <th>・賞味期限</th><td><%=fBean.getExpirationDate()%></td>
     </tr>
     <tr>
       <th>・カテゴリー</th><td><%=fBean.getCategoryName()%></td>
     </tr>
     <tr>
       <th>・栄養素</th><td><%=fBean.getNutrient()%></td>
     </tr>
</table>
</div>
</body>
</html>