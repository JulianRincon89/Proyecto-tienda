package Controller;

import java.io.IOException;

import javax.swing.JOptionPane;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletlogin
 */
public class Servletlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servletlogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		/*Double art1, art2, Total;
		art1=Double.parseDouble(request.getParameter("art1"));
		art2=Double.parseDouble(request.getParameter("art2"));
		Total=art1+art2;
		if (Total>5000) {
			Total=Total*0.9;
			response.sendRedirect("vistados.jsp?dat1="+Total);
			
		}else {
			Total=Total*0.95;
			response.sendRedirect("vistados.jsp?dat1="+Total);
		}*/
		String u,c;
		u=request.getParameter("usu");
		c=request.getParameter("pass");
		if (u.equals("pepe")&& c.equals("123")) {
			JOptionPane.showMessageDialog(null, "Datos Correctos");
			response.sendRedirect("vistados.jsp?dat="+u);
		}
		else {
			JOptionPane.showMessageDialog(null, "Datos incorrectos");
			response.sendRedirect("index.jsp");
		}
	}

}
