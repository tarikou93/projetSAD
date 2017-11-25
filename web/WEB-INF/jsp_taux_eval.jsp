<%--
    Document   : stat.jsp
    Created on : 25 oct. 2017, 17:40:29
    Author     : Tarek
--%>
<%@page import="beans.Taux_eval"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>My web site</title>
    <meta charset="utf-8" />
	<link rel="icon" type="image/png" href="assets/img/favicon.ico">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />



	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />


    <!-- Bootstrap core CSS     -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="assets/css/animate.min.css" rel="stylesheet"/>
    <script src="Chart.min.js"></script>
    <!--  Light Bootstrap Table core CSS    -->
    <link href="assets/css/light-bootstrap-dashboard.css" rel="stylesheet"/>

    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
    <script src="assets/js/jquery-1.10.2.js" type="text/javascript"></script>
    <script src="assets/js/bootstrap-notify.js"></script>

  </head>

  <body>
    <div class="wrapper">
    <div class="sidebar" data-color="purple" data-image="assets/img/sidebar-5.jpg">
         <div class="sidebar-wrapper">
           <div class="logo">
               <h2>Menu</h2>
           </div>

           <ul class="nav">
               <li class="active">
                   <a href="template.html">
                       <i class="pe-7s-graph"></i>
                       <p>Acceuil</p>
                   </a>
               </li>

               <li class="active">
                 <a href="formulaire.html">
                   <i class="pe-7s-user"></i>
                   <p>Personnel</p>
                 </a>

               </li>

               <li class="active">
                 <a href="template_1.html" >
                   <i class="pe-7s-timer"></i>
                   <p>Evaluation</p>
                 </a>

               </li>

           </ul>
     </div>
    </div>

   <!-- ********************************************************************************************************** -->
   <!-- menu superieur -->
    <div class="main-panel">
      <nav class="navbar navbar-default navbar-fixed">
        <div class="container-fluid">
          <div class="navbar-header">
            <a class="navbar-brand" href="template.html">Dashboard</a>
          </div>

          <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav navbar-right">
                <li>
                   <a href="">
                       Account
                    </a>
                </li>
            </ul>

          </div>

        </div>

      </nav>

      <!-- ****************************************************************************************************** -->
      <!-- le centre -->
      <div class="content">
        <div class="container-fluid">
          <div class="card">
            <div class="header">
              <h4 class="title text-info">Liste</h4>
            </div>
            <div class="content table-responsive table-full-width">
              <table class="table table-hover table-striped">
                <thead>
                  <th>Nom</th>
                  <th>Prénom</th>
                  <th>Service</th>
                  <th>Type</th>
                  <th>Taux</th>
                </thead>
                <c:forEach items ="${eval}" var="item">
                  <tr>
                    <td><c:out value="${item.nom}" /></td>
                    <td><c:out value="${item.prenom}" /></td>
                    <td><c:out value="${item.service}" /></td>
                    <td><c:out value="${item.type}" /></td>
                    <td><c:out value="${item.taux_ev}" /></td>
                  </tr>
                </c:forEach>
              </table>
            </div>
          </div>


        </div>






        </div>




      <!-- ****************************************************************************************************** -->
      <!-- le pied de la page -->
      <footer class="footer">
        <div class="container-fluid">
          <nav class="pull-left">
            <ul>
              <li>
                <a href="#">Home</a>
              </li>
            </ul>

          </nav>

        </div>
      </footer>

    </div>
  </div>
      <h1>${cc}</h1>
  </body>
  <script type="text/javascript">
    $(document).ready(function(){
      $.notify({
        icon: 'pe-7s-like2',
        message: "Bienvenu sur votre tableau de bord"
      },{
        type: 'info',
        timer: 4000
      });
    });
  </script>
</html>
