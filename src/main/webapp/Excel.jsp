
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Excel</title>
    <script src="./js/jquery-1.12.4.min.js"></script>
</head>
<body>
<h1>导出Excel</h1>
<input type ="button" value="导出Excel" onclick="Excel()"/>
</body>
<script>
$(function () {
    function Excel(){
        location.href ="/ExcelController/exportExcel";
    }
});
</script>
</html>
