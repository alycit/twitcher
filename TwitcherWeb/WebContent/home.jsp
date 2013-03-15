<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<h1>Twitcher</h1>
		</header>
		<section>
			<div class="row-fluid" id="main_content">
				<div class="well span3">
					<a href="signup.html" class="title">Sign Up</a>
				</div>
				<div class="well span9">
					<form method="post" action="twitch">
						<textarea rows="3" name="twitchinput"></textarea>
						<div>
							<button type="submit" class="btn btn-primary btn-large">Twitch</button>
						</div>
					</form>
				</div>
			</div>
			<div class="row-fluid" >
			</div>
		</section>
	</div>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/equalHeights.js"></script>
	<script>
		$(document).ready(function(){
			$('#main_content').equalHeights();
		});
	</script>
</body>
</html>