package br.edu.imed.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String usuario = null;
       
    public ServletAgenda() {
        super();
    }
	public static void usuario(String user) {
		usuario = user;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (usuario == null) {
			response.sendRedirect("Noloading.html");	
			
		} else {
			String modalidades = request.getParameter("modalidades");
			String data = request.getParameter("data");
			String horario = request.getParameter("horario");
			String personal = request.getParameter("personal");
			Conagenda.agendar(modalidades, data, horario, personal);
			response.sendRedirect("perfildeusuario.jsp?usuario="+ usuario +"&modalidades="+ modalidades + "&data="+ data + "&horario=" + horario + "&personal="+ personal);
		}
	}

}
	
	
	