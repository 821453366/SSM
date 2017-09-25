<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
    <head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>  
       <style type="text/css"> 
*{
       margin:0;
       padding:0;
       
       }
#login{   
        position: absolute;   
        top: 45%;   
        left:50%;   
        margin: -150px 0 0 -150px;   
        width: 300px;   
        height: 300px;   
    }   
#login h1{   
        color: #fff;   
        text-shadow:0 0 10px;   
        letter-spacing: 1px;   
        text-align: center;   
    }   
h1{   
        font-size: 2em;   
        margin: 0.67em 0;   
    }   
input{   
        width: 278px;   
        height: 18px;   
        margin-bottom: 10px;   
        outline: none;   
        padding: 10px;   
        font-size: 13px;   
        border-top: 1px solid #312E3D;   
        border-left: 1px solid #312E3D;   
        border-right: 1px solid #312E3D;   
        border-bottom: 1px solid #56536A;   
        border-radius: 4px;   
    }
.but{
    width: 100px;
    height: 40px;
    float: left;
    margin-left: 30px;
    min-height: 20px;
    display: block;
    background-color: #4a77d4;
    border: 1px solid #3762bc;
    color: #fff;
    padding: 9px 14px;
    font-size: 15px;
    line-height: normal;
    border-radius: 5px;

}
.beijing{
	margin:0;
	width:100%;
	height:875px;
	 background-image: url("/img/time1.jpg");

}
    #bei2{
    margin:0;
	width:100%;
	height:875px;
	 background-image: url("/img/33331.png");
    }
    .banquan{
	width: 100%;
	min-width: 1360px;
	height: 70px;
}




       </style>
    </head>

    <body> 
    <div class="beijing">
    	 <div id="bei2">
	        <div id="login">  
	            <h1>注册账号</h1>
	            <form action="/userController/insertUser" method="post">
	                <input type="text"  placeholder="用户名" name="userName">
	                <input type="password"  placeholder="密码" name="passWord">
                    <div id="bt">
                        <input class="but" type="submit" value="注册">
                        <a href="register.jsp"><input class="but" type="button" value="返回登录"></a>
                    </div>
	            </form>  
	        </div> 
         </div>
         <div style="margin: 0 auto;width: 1010px;">
        	<h5 style="margin: 0;padding: 20px;">
        		 &nbsp;版权所有©2009-2016 （中国）[陕ICP备054862458] 内容管理：新闻宣传部       技术管理：信息管理部
        		 &nbsp;使用帮助 | 法律声明 | 反馈留言 | 网站地图
        	</h5>
         </div>
     </div> 
    </body>  
    </html>  

