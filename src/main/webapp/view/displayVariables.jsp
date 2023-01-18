
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Display Variables</title>
</head>
<body>
<h1>Display Variables</h1>
Variable in the request scope: ${message}
<br/>
<br/>
Variable in session scope:
<br/>
Rectangle:
Base: ${rectangle.base}
Height: ${rectangle.height}
Area: ${rectangle.area}
<br/>
<br/>
<a href="${pageContext.request.contextPath}/index.jsp">Home</a>
</body>
</html>
