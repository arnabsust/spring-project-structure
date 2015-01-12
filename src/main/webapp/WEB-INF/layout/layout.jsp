<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title><sitemesh:write property='title' /></title>
<jsp:include page="include/css.jsp" />
</head>
<body>
	<jsp:include page="include/navbar.jsp" />
	<div class="container">
		<sitemesh:write property='body' />
	</div>
	<jsp:include page="include/js.jsp" />
</body>
</html>