<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Tp sanguhcheto</title>

<!-- Bootstrap -->
<link href="../../css/bootstrap.min.css" rel="stylesheet">
<link href="../../css/starter-template.css" rel="stylesheet">
</head>
<body>
 <%@include file="../../theme/navbar.html" %>
 <%@include file="../../theme/recursos.html" %>
    <div id="wrap">
      <div class="container">

		<form:form class="form-horizontal" action="confirmacionIngrediente" modelAttribute="miIngrediente" role="form" method="POST">
			<fieldset>
			  <legend>Complete los datos del ingrediente:</legend>
			  <div class="form-group">
			    <label for="nombre" class="col-lg-4 control-label">Nombre:</label>
			    <div class="col-lg-4">
			      <form:input type="text" class="form-control" id="nombre" placeholder="nombre del ingrediente" path="nombre"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="precio" class="col-lg-4 control-label">Precio:</label>
			    <div class="col-lg-4">
			      <form:input type="text" class="form-control" id="precio" placeholder="ingrese el precio" path="precio"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="col-lg-4 control-label">Indique el tipo: </label>
			    <div class="col-lg-4">
			      <div class="radio">
			        <label>
			          <form:radiobutton name="tipo" id="tipo" value="INGREDIENTE" checked="" path="tipo"/>
			          Ingrediente
			        </label>
			      </div>
			      <div class="radio">
			        <label>
			          <form:radiobutton name="tipo" id="tipo" value="CONDIMENTO" checked="" path="tipo"/>
			          Condimento
			        </label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-lg-10 col-lg-offset-4">
			      <button type="reset" class="btn btn-default">Cancelar</button>
			      <button type="submit" class="btn btn-primary">Enviar</button>
			    </div>
			  </div>
			</fieldset>
		</form:form>

      </div><!-- /.container -->
      <div id="push"></div>
    </div><!-- /#wrap -->

    <script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Inicio)").addClass("active");
      });
    </script>
</body>
</html>