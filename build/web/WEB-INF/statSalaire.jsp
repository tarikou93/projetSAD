<%--
    Document   : stat.jsp
    Created on : 25 oct. 2017, 17:40:29
    Author     : Tarek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

                      <br>
          <jsp:useBean id="infoSalaire" scope="request" class="beans.salaire"/>


          <!-- top tiles -->
          <div class="row tile_count">
            <div class="col-lg-3 tile_stats_count text-center bg-success">
              <span class="count_top"><i class="fa fa-euro"></i> Masse salariale <br> (EN DINARS)</span>
              <div class="h3 text-success"><b><%= infoSalaire.masseSalariale %></b></div>
              <span class="count_bottom"><i class="green">de la dernière mise à jour</i> </span>
            </div>
            <div class="col-lg-3 tile_stats_count text-center bg-info">
              <span class="count_top"><i class="fa fa-euro"></i> Moyenne des salaires <br> (EN DINARS)</span>
              <div class="h3 text-info"><b><%= infoSalaire.moyenneSalaire %></b></div>
              <span class="count_bottom"><i class="green">de la dernière mise à jour</i> </span>
            </div>
            <div class="col-lg-3 tile_stats_count text-center bg-warning">
              <span class="count_top"><i class="fa fa-thumbs-up"></i>Nombres des Emp ayant un salaire superieur à la moyenne</span>
              <div class="h3 text-warning"><b><%= infoSalaire.getNbrEmpHigh() %></b></div>
              <span class="count_bottom"><i class="green">de la dernière mise à jour</i> </span>
            </div>
            <div class="col-lg-3 tile_stats_count text-center bg-danger">
              <span class="count_top"><i class="fa fa-thumbs-down"></i>Nombres des Emp ayant un salaire inferieur à la moyenne</span>
              <div class="h3 text-primary"><b><%= infoSalaire.getNbrEmpLow() %></b></div>
              <span class="count_bottom"><i class="green">de la dernière mise à jour</i> </span>
            </div>

          </div>




                      <br>

          <div class="row">
            <div class="col-lg-6">
                <jsp:useBean id="listPerson" scope="request" class="beans.persons"/>
              <div class="card text-center">
                <!-- ******************************************************************************************* -->
                <!-- top 5 des meileurs salaire -->
                <div class="header bg-danger">
                  <h4 class="title"><b>top 5 des plus haut salaires</b></h4>
                </div>
                <div class="card-body">
                  <table class="table table-bordered table-hover table-striped">
                    <thead class="thead-dark">
                      <tr class="table-danger">
                        <th>#</th>
                        <td>nom</td>
                        <td>prénom</td>
                        <td>grade</td>
                        <td>salaire</td>
                      </tr>

                    </thead>
                    <tbody>
                      <tr>
                        <th>1</th>
                        <td><%= listPerson.l.get(0).getNom() %></td>
                        <td><%= listPerson.l.get(0).getPrenom() %></td>
                        <td><%= listPerson.l.get(0).getGrade() %></td>
                        <td><%= listPerson.l.get(0).getSalaire() %></td>
                      </tr>
                      <tr>
                        <th>2</th>
                        <td><%= listPerson.l.get(1).getNom() %></td>
                        <td><%= listPerson.l.get(1).getPrenom() %></td>
                        <td><%= listPerson.l.get(1).getGrade() %></td>
                        <td><%= listPerson.l.get(1).getSalaire() %></td>
                      </tr>
                      <tr>
                        <th>3</th>
                        <td><%= listPerson.l.get(2).getNom() %></td>
                        <td><%= listPerson.l.get(2).getPrenom() %></td>
                        <td><%= listPerson.l.get(2).getGrade() %></td>
                        <td><%= listPerson.l.get(2).getSalaire() %></td>
                      </tr>
                      <tr>
                        <th>4</th>
                        <td><%= listPerson.l.get(3).getNom() %></td>
                        <td><%= listPerson.l.get(3).getPrenom() %></td>
                        <td><%= listPerson.l.get(3).getGrade() %></td>
                        <td><%= listPerson.l.get(3).getSalaire() %></td>
                      </tr>
                      <tr>
                        <th>5</th>
                        <td><%= listPerson.l.get(4).getNom() %></td>
                        <td><%= listPerson.l.get(4).getPrenom() %></td>
                        <td><%= listPerson.l.get(4).getGrade() %></td>
                        <td><%= listPerson.l.get(4).getSalaire() %></td>
                      </tr>

                    </tbody>

                  </table>


                </div>

              </div>

            </div>
            <div class="col-lg-6">

                <jsp:useBean id="listBadPerson" scope="request" class="beans.persons"/>
                <div class="card text-center">
                  <!-- ******************************************************************************************* -->
                  <!-- top 5 des plus bas salaire -->
                  <div class="header bg-success">
                    <h4 class="title"><b>top 5 des plus bas salaires</b></h4>
                  </div>
                  <div class="card-body">
                    <table class="table table-bordered table-hover table-striped">
                      <thead class="thead-dark">
                        <tr class="table-danger">
                          <th>#</th>
                          <td>nom</td>
                          <td>prénom</td>
                          <td>grade</td>
                          <td>salaire</td>
                        </tr>

                      </thead>
                      <tbody>
                        <tr>
                          <th>1</th>
                          <td><%= listBadPerson.l.get(0).getNom() %></td>
                          <td><%= listBadPerson.l.get(0).getPrenom() %></td>
                          <td><%= listBadPerson.l.get(0).getGrade() %></td>
                          <td><%= listBadPerson.l.get(0).getSalaire() %></td>
                        </tr>
                        <tr>
                          <th>2</th>
                          <td><%= listBadPerson.l.get(1).getNom() %></td>
                          <td><%= listBadPerson.l.get(1).getPrenom() %></td>
                          <td><%= listBadPerson.l.get(1).getGrade() %></td>
                          <td><%= listBadPerson.l.get(1).getSalaire() %></td>
                        </tr>
                        <tr>
                          <th>3</th>
                          <td><%= listBadPerson.l.get(2).getNom() %></td>
                          <td><%= listBadPerson.l.get(2).getPrenom() %></td>
                          <td><%= listBadPerson.l.get(2).getGrade() %></td>
                          <td><%= listBadPerson.l.get(2).getSalaire() %></td>
                        </tr>
                        <tr>
                          <th>4</th>
                          <td><%= listBadPerson.l.get(3).getNom() %></td>
                          <td><%= listBadPerson.l.get(3).getPrenom() %></td>
                          <td><%= listBadPerson.l.get(3).getGrade() %></td>
                          <td><%= listBadPerson.l.get(3).getSalaire() %></td>
                        </tr>
                        <tr>
                          <th>5</th>
                          <td><%= listBadPerson.l.get(4).getNom() %></td>
                          <td><%= listBadPerson.l.get(4).getPrenom() %></td>
                          <td><%= listBadPerson.l.get(4).getGrade() %></td>
                          <td><%= listBadPerson.l.get(4).getSalaire() %></td>
                        </tr>

                      </tbody>

                    </table>


                  </div>

                </div>

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
  <!-- ************************************************************************************** -->
  
  <!-- ************************************************************************************** -->
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
