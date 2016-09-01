<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

	<link rel="stylesheet" type="text/css" href="<%=path%>/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="<%=path%>/js/easyui/demo.css">
	<script type="text/javascript" src="<%=path%>/js/easyui/jquery-1.7.1.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/easyui/jquery.easyui.min.js"></script>
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

	  <script>
		  function doSearch(value,name){
			  alert('You input: ' + value+'('+name+')');
		  }
	  </script>
	  <script type="javascript">
		  window.onload = function(){
			  $.ajax({async:true,url:"<%=basePath%>population_deptTablesInfoQuery.action",
				  success:function(myData){
					  if(myData.rows[0] != null){
						  reload(myData);
						  echart_reload(myData);
						  //                        bar_reload(myData);
					  }
				  },cache:false,type:"POST"
			  });
		  }
	  </script>
  </head>
  
  <body>
    <h1 >数据字典</h1>
	<p>Select a category and click search button or press enter key in input box to do searching.</p>
	<div style="margin:20px 0;"></div>
	<input class="easyui-searchbox" data-options="prompt:'Please Input Value',menu:'#mm',searcher:doSearch" style="width:300px"></input>
	<div id="mm">
		<div data-options="name:'all',iconCls:'icon-ok'">All News</div>
		<div data-options="name:'sports'">Sports News</div>
	</div>

	<table cellpadding="5" cellspacing="1" class="dict" width="760">
		<tr><th width="345">表名(DESTOON V5.0)</th><th width="345">注释</th><th width="70">词典</th></tr>
		<s:iterator value="#rows" status="tables">
			<tr><td><s:property></td>
		</s:iterator>
	</table>
  </body>
</html>
