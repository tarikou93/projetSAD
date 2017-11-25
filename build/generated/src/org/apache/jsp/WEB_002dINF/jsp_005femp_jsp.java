package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jsp_005femp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>My web site</title>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("    <script src=\"Chart.min.js\"></script>\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"assets/css/light-bootstrap-dashboard.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"purple\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("         <div class=\"sidebar-wrapper\">\n");
      out.write("           <div class=\"logo\">\n");
      out.write("               <h2>Menu</h2>\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("           <ul class=\"nav\">\n");
      out.write("               <li class=\"active\">\n");
      out.write("                   <a href=\"template.html\">\n");
      out.write("                       <i class=\"pe-7s-graph\"></i>\n");
      out.write("                       <p>Acceuil</p>\n");
      out.write("                   </a>\n");
      out.write("               </li>\n");
      out.write("\n");
      out.write("               <li class=\"active\">\n");
      out.write("                 <a href=\"formulaire.html\">\n");
      out.write("                   <i class=\"pe-7s-user\"></i>\n");
      out.write("                   <p>Personnel</p>\n");
      out.write("                 </a>\n");
      out.write("\n");
      out.write("               </li>\n");
      out.write("\n");
      out.write("               <li class=\"active\">\n");
      out.write("                 <a href=\"template_1.html\" >\n");
      out.write("                   <i class=\"pe-7s-timer\"></i>\n");
      out.write("                   <p>Evaluation</p>\n");
      out.write("                 </a>\n");
      out.write("\n");
      out.write("               </li>\n");
      out.write("\n");
      out.write("           </ul>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   <!-- ********************************************************************************************************** -->\n");
      out.write("   <!-- menu superieur -->\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      <nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"template.html\">Dashboard</a>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                   <a href=\"\">\n");
      out.write("                       Account\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("      <!-- ****************************************************************************************************** -->\n");
      out.write("      <!-- le centre -->\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"content table-responsive table-full-width\">\n");
      out.write("                  <table class=\"table table-hover table-striped\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <th>ID</th>\n");
      out.write("                                    \t<th>Name</th>\n");
      out.write("                                    \t<th>Salary</th>\n");
      out.write("                                    \t<th>Country</th>\n");
      out.write("                                    \t<th>City</th>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>1</td>\n");
      out.write("                                        \t<td>Dakota Rice</td>\n");
      out.write("                                        \t<td>$36,738</td>\n");
      out.write("                                        \t<td>Niger</td>\n");
      out.write("                                        \t<td>Oud-Turnhout</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>2</td>\n");
      out.write("                                        \t<td>Minerva Hooper</td>\n");
      out.write("                                        \t<td>$23,789</td>\n");
      out.write("                                        \t<td>Curaçao</td>\n");
      out.write("                                        \t<td>Sinaai-Waas</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>3</td>\n");
      out.write("                                        \t<td>Sage Rodriguez</td>\n");
      out.write("                                        \t<td>$56,142</td>\n");
      out.write("                                        \t<td>Netherlands</td>\n");
      out.write("                                        \t<td>Baileux</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>4</td>\n");
      out.write("                                        \t<td>Philip Chaney</td>\n");
      out.write("                                        \t<td>$38,735</td>\n");
      out.write("                                        \t<td>Korea, South</td>\n");
      out.write("                                        \t<td>Overland Park</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>5</td>\n");
      out.write("                                        \t<td>Doris Greene</td>\n");
      out.write("                                        \t<td>$63,542</td>\n");
      out.write("                                        \t<td>Malawi</td>\n");
      out.write("                                        \t<td>Feldkirchen in Kärnten</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                        \t<td>6</td>\n");
      out.write("                                        \t<td>Mason Porter</td>\n");
      out.write("                                        \t<td>$78,615</td>\n");
      out.write("                                        \t<td>Chile</td>\n");
      out.write("                                        \t<td>Gloucester</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!-- ****************************************************************************************************** -->\n");
      out.write("      <!-- le pied de la page -->\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <nav class=\"pull-left\">\n");
      out.write("            <ul>\n");
      out.write("              <li>\n");
      out.write("                <a href=\"#\">Home</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("          </nav>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("      <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("  </body>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("      $.notify({\n");
      out.write("        icon: 'pe-7s-like2',\n");
      out.write("        message: \"Bienvenu sur votre tableau de bord\"\n");
      out.write("      },{\n");
      out.write("        type: 'info',\n");
      out.write("        timer: 4000\n");
      out.write("      });\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
