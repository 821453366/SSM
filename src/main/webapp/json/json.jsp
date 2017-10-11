<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json交互测试</title>
    <script src="../js/jquery-1.12.4.min.js"></script>
</head>
<body>
<input type="button" onclick="requestJson()" value="请求json，输出json">
<input type="button" onclick="responseJson()" value="请求key/value，输出json">
<script type="text/javascript">
    function requestJson(){
        $.post({
            type:'post',
            url:'/json/requestJson',
            contentType:'application/json;charset=utf-8',
            data:'{"userName":"小明","passWord":"123456"}'
        },function (data) {
            console.log(data);
        });
    }
    function responseJson(){
        $.post({
            type:'post',
            url:'/json/responseJson',
            data:"userName=小明&passWord=123456"
        },function (data) {
            console.log(data);
        });
    }
</script>
</body>
</html>
