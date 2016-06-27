<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Tp sanguhcheto</title>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/starter-template.css" rel="stylesheet">
</head>
<body>
 <%@include file="../../theme/navbar.html" %>
 <%@include file="../../theme/recursos.html" %>
    <div id="wrap">
      <div class="container">
		
		<h2>El ingrediente se agrego correctamente:</h2>
		<blockquote>
		  <p>Nombre: ${ingrediente.nombre}</p>
		  <p>Precio: ${ingrediente.precio}</p>
		  <p>Tipo: ${ingrediente.tipo}</p>
		</blockquote>

      </div><!-- /.container -->
      <div id="push"></div>
    </div><!-- /#wrap -->

<%@include file="../../theme/footer.html" %>
    <script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Inicio)").addClass("active");
      });
    </script>
</body>
</html>