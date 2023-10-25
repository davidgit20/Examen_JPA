/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.1
 * Generated at: 2023-10-25 01:32:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import modelos.TblProducto;

public final class RegistroProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Productos</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"cadetblue\">\r\n");
      out.write("<h1 align=\"center\">Registros de productos</h1>\r\n");
      out.write("\t<form action=\"ControladorProducto\" method=\"post\">\r\n");
      out.write("\t\t<table border=\"1\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>nombre</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"nombres\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>precio venta</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"venta\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>precio com</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"com\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>estado</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"estado\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>descripcion</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"descrip\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"Registrar\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");

		String men = (String)request.getAttribute("mensaje");
		String mensaje = "";
		if(men != null) men = mensaje;
	
      out.write("\r\n");
      out.write("\t<h1 align=\"center\">");
      out.print(mensaje );
      out.write("</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<h1 align=\"center\">Listado de productos</h1>\r\n");
      out.write("\t<table align=\"center\" class=\"table table-striped\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Codigo</th>\r\n");
      out.write("\t\t\t<th>nombre</th>\r\n");
      out.write("\t\t\t<th>precio venta</th>\r\n");
      out.write("\t\t\t<th>precio com</th>\r\n");
      out.write("\t\t\t<th>estado</th>\r\n");
      out.write("\t\t\t<th>descripción</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

		List<TblProducto> listadoProducto = (List<TblProducto>)request.getAttribute("milista");
		if(listadoProducto != null)
		{
			for(TblProducto lis:listadoProducto)
			{
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(lis.getIdproducto());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(lis.getNombre());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(lis.getPrecioVenta() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(lis.getPrecioCom() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(lis.getEstado() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(lis.getDescrip() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

			}
		}
		
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
