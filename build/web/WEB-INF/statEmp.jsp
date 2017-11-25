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
          <div class="row">
              <div class="col-lg-6">
                <jsp:useBean id="val" scope="request" class="beans.beanTest" />
                <!-- ******************************************************************************************* -->
                <!-- répartition des salairiés -->
                <div class="text-center">
                  <canvas id="pie-chart" width="850" height="350"></canvas>
                </div>

                    <script>
                        var v1 = '<%= val.getX() %>';
                        var v2 = '<%= val.getY() %>';
                        var v3 = '<%= val.getZ() %>';
                        var d = new Array();
                        d.push(v1);
                        d.push(v2);
                        d.push(v3);
                    new Chart(document.getElementById("pie-chart"), {
                    type: 'pie',
                    data: {
                      labels: ["CDI", "CDD" , "stagiaire"],
                      datasets: [{
                        label: "Population (millions)",
                        backgroundColor: ["#3e95cd", "#8e5ea2", 'rgba(255, 99, 132, 0.6)'],
                        data: d
                      }]
                    },
                    options: {
                      title: {
                        display: true,
                        text: 'nombre des employés'
                      }
                    }
                    });
                    </script>
              </div>
              <div class="col-lg-6">
                <div>
                    <jsp:useBean id="abs" scope="request" class="beans.absence"/>
                <div class="text-center">
                  <!-- ******************************************************************************************* -->
                  <!-- évolution des absences -->
                  <canvas id="line-chart" width="850" height="400"></canvas>
                </div>

                <script>
                    var liste = new Array();


                    <% for(int i=0; i<abs.listeAbsence.size(); i++) {%>
                        liste[<%= i %>] = "<%= abs.listeAbsence.get(i) %>";
                        <% } %>


                new Chart(document.getElementById("line-chart"), {
    type: 'line',
    data: {
      labels: ['janvier','février','mars','avril','mai','juin','juillet','août','septembre','octobre','novembre','decembre'],
      datasets: [{
          data: liste,
          label: "absence",
          borderColor: "#3e95cd",
          fill: false
        }
      ]
    },
    options: {
      title: {
        display: true,
        text: 'évolution des absences durant l\'année ' + '<%= abs.getAnnee() %>'
      }
    }
  });

                </script>
                </div>

              </div>

          </div>
                      <br>
          <div class="row">

            <div class="col-lg-6">
                <jsp:useBean id="effectif" scope="request" class="beans.EffectifTotal"/>
              <div class="text-center">
                <canvas id="bar-chart-grouped" width="800" height="400"></canvas>
              </div>
              <script type="text/javascript">

                  var listeHomme = new Array();
                  var listeFemme = new Array();


                    <% for(int i=0; i<effectif.listHomme.size(); i++) {%>
                        listeHomme[<%= i %>] = "<%= effectif.listHomme.get(i) %>";
                        <% } %>

                    <% for(int i=0; i<effectif.listFemme.size(); i++) {%>
                        listeFemme[<%= i %>] = "<%= effectif.listFemme.get(i) %>";
                        <% } %>

                new Chart(document.getElementById("bar-chart-grouped"),{
                  type: 'bar',
                  data: {
                    labels: ["20-25","25-30","30-35","35-40","40-45","45-50","50-55","55-60"],
                    datasets: [
                      {
                        label: "Homme",
                        backgroundColor: "#3333FF",
                        data: listeHomme
                      },
                      {
                        label: "Femme",
                        backgroundColor: "#F633FF",
                        data: listeFemme
                      }
                    ]
                  },
                  options: {
                    title: {
                      display: true,
                      text: 'Effectifs Homme-Femme par tranche d age'
                    }
                  }
                });
              </script>


            </div>
            <div class="col-lg-6">
                <jsp:useBean id="cadre" scope="request" class="beans.Cadre"/>
              <div class="text-center">
                <canvas id="bar-chart-horizontal" width="800" height="450"></canvas>
              </div>
              <script type="text/javascript">

                  var cadre = '<%= cadre.getCadre() %>';
                  var non_cadre = '<%= cadre.getNon_cadre() %>';
                  var l = new Array();
                  l.push(cadre);
                  l.push(non_cadre);

              new Chart(document.getElementById("bar-chart-horizontal"),{
                type: 'horizontalBar',
                data: {
                  labels: ["Cadre", "Non cadre"],
                  datasets: [
                    {
                      label: "Nombre des employés",
                      backgroundColor: ["#33E6FF" , "#33FF42"],
                      data: l
                    }
                  ]
                },
                options: {
                  legend: {display: false},
                  title: {
                    display: true,
                    text: 'Nombre de cadres et de non cadre'
                  }
                }
              });
              </script>

            </div>

          </div>

          <div class="row">


          </div>



        </div>

      </div>
      <h1>${messagetest}</h1>

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
