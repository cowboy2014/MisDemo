<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <style>
		  h1 {text-align:center;font-size: 20px}
		  * {font-size:16px;font-family:Verdana,Arial;}
		  .dict{background:#333333;margin:auto;}
		  .dict th{background:#9999CC;font-weight:bold;height:25px;line-height:24px;letter-spacing:1px;color:#FFFFFF;}
		  .dict td{line-height:22px;padding-left:10px;padding-right:10px;}
		  .dict tr{background:#FFFFFF;}
		  .on td{background:#CCCCFF;}
		  a:link,a:visited,a:active{text-decoration:none;color:#136EC2}
		  a:hover{text-decoration:none;}
	  </style>
  </head>
  
  <body>
    <h1 >数据字典</h1>
	<table cellpadding="5" cellspacing="1" class="dict" width="760">
		<tr><th width="345">表名(DESTOON V5.0)</th><th width="345">注释</th><th width="70">词典</th></tr>
	</table>
  </body>
</html>
