<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Convert Successful</title>

    <style>
        h3 {text-align: center;}
        p {text-align: center;}
        div {text-align: center;}
        body {
            background-image: url('images/wp6946084.jpg');
        }
    </style>
</head>
<body style="background-color:hotpink;">
<h3></h3>

<p><s:property value="personBean" /> </p>



<p><a href="<s:url action='index' />" >Return to home page</a>.</p>
</body>
</html>