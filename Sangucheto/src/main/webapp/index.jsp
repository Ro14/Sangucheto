<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
 <%@include file="theme/navbar.html" %>
 <%@include file="theme/recursos.html" %>
    <div id="wrap">
      <div class="container">

        <div class="starter-template">
          <br></br><br></br><br></br>
          <h1>Bienvenido a Sangucheto</h1>
          <p class="lead">Arma el sangucheto que m&aacutes te guste, agregando los condimentos e ingredientes que m&aacutes prefieras.</p>
        	 <p class="lead">Para empezar, tenes que agregar los ingredientes que desees en Nuevo Ingrediente, colocando el nombre, precio y tipo ta sea condimento o ingrediente</p>
       		 <p class="lead">Seguido, se debe agregar stock a los productos agregados recientemente</p>
       		 <p class="lead">Ademas el sistema cuenta con la posibilidad de ver stock, y eliminar ingrediente</p>
        </div>

      </div><!-- /.container -->
      <div id="push"></div>
    </div><!-- /#wrap -->

<%@include file="theme/footer.html" %>
    <script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Inicio)").addClass("active");
      });
    </script>
</body>
</html>