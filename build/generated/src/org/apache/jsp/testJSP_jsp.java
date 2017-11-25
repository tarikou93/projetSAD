package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            int var1 = 10;
            int var2 = 50;
            
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        ");
      out.write("\n");
      out.write("            \n");
      out.write("         <script>\n");
      out.write("             var v1 = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${var1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("             var v2 = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${var2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("             var d = new Array();\n");
      out.write("             d.push(v1);\n");
      out.write("             d.push(v2);\n");
      out.write("                  new Chart(document.getElementById(\"pie-chart\"), {\n");
      out.write("                  type: 'pie',\n");
      out.write("                  data: {\n");
      out.write("                    labels: [\"Africa\", \"Asia\"],\n");
      out.write("                    datasets: [{\n");
      out.write("                      label: \"Population (millions)\",\n");
      out.write("                      backgroundColor: [\"#3e95cd\", \"#8e5ea2\"],\n");
      out.write("                      data: d;\n");
      out.write("                    }]\n");
      out.write("                  },\n");
      out.write("                  options: {\n");
      out.write("                    title: {\n");
      out.write("                      display: true,\n");
      out.write("                      text: 'Predicted world population (millions) in 2050'\n");
      out.write("                    }\n");
      out.write("                  }\n");
      out.write("                  });\n");
      out.write("                  </script>   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </body>\n");
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
