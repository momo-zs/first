<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>

    ${name}

    <#if sex==1 >
        男
    <#elseif sex==2>
        女
    <#else>
        其他
    </#if>

    <#list userList as user>
        ${user}
    </#list>

    <form role="form" action = "/testIn" method="post">
        账号：<input type="text" id="name" name = "name"> <br>
        密码：<input type="password" id = "password" name = "password"> <br>
        <input type="submit" id = "login" value = "login">
    </form>

</body>
</html>