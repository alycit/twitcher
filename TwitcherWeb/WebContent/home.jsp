<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Twitcher - Welcome</title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
<link href="css/custom.css" rel="stylesheet" media="screen">
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="#">Twitcher</a>
          <div class="nav-collapse collapse">
          	<ul class="nav">
              <li><a href="signup.html">Sign Up</a></li>
            </ul>
            <c:choose>
			    <c:when test="${loggedInUser != null}">
			       	<ul class="nav pull-right">
              			<li><a href="#">Hello ${loggedInUser.name}</a></li>
              			<li><a href="logout">Logout</a></li>
            			</ul>
			    </c:when>
			    <c:otherwise>
			    		<c:if test="${loginError != null}">
			    		  	<ul class="nav">
	              			<li><a href="#" class="alert alert-error">${loginError}</a></li>
	            			</ul>
			    		</c:if>
			        <form class="navbar-form pull-right" action="login" method="post" >
		              <input class="span2" type="text" placeholder="Email" name="username">
		              <input class="span2" type="password" placeholder="Password" name="password">
		              <button type="submit" class="btn">Sign in</button>
		            </form>
			    </c:otherwise>
			</c:choose>
          </div>
        </div>
      </div>
    </div>
	<div class="container">
		<div class="row" id="main_content">
			<div class="well">
				<form method="post" action="twitch">
					<textarea rows="3" name="twitchinput"></textarea>
					<div>
						<button type="submit" class="btn btn-primary btn-large">Twitch</button>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="well">
				<h2>The Shakes</h2>
				<c:forEach var="twitch" items="${twitchList}">
					<p>${twitch.time}: ${twitch.text}</p>
				</c:forEach>
			</div>
		</div>
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