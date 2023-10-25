package Controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.checkerframework.common.util.report.qual.ReportUnqualified;
import org.omg.CORBA.Request;

import DAO.ClassCrudProductolmp;
import modelos.TblProducto;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos todos los campos del formulario
		String nombres = request.getParameter("nombres");
		double precioVenta = Double.parseDouble(request.getParameter("venta"));
		double precioCom = Double.parseDouble(request.getParameter("com"));
		String estado = request.getParameter("estado");
		String descrip = request.getParameter("descrip");
		
		TblProducto tbl = new TblProducto();
		ClassCrudProductolmp lmp = new ClassCrudProductolmp();
		
		tbl.setNombre(nombres);
		tbl.setPrecioVenta(precioVenta);
		tbl.setPrecioCom(precioCom);
		tbl.setEstado(estado);
		tbl.setDescrip(descrip);
		
		lmp.registrarProducto(tbl);
		String mensaje = "Datos registrado en la base de datos";
		
		List<TblProducto> milista = lmp.milista();
		request.setAttribute("milista", milista);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("/RegistroProducto.jsp").forward(request, response);
	}

}
