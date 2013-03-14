<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Twitcher - Welcome</title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
<link href="css/custom.css" rel="stylesheet" media="screen">
</head>
<body>
	<div class="container">
		<header class="page-header">
			<h1>Welcome!!!</h1>
		</header>
		<form method="post" action="twitch">
			<textarea rows="3" name="twitchinput"></textarea>
			<div>
				<button type="submit" class="btn btn-primary btn-large">Twitch</button>
			</div>
		</form>
	</div>


	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>