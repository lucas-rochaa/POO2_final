package br.edu.imed.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MensagemServlet")
public class MensagemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String usuario = null;

    public MensagemServlet() {
        super();
    }
	public static void usuario(String user) {
		usuario = user;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (usuario == null) {
			response.sendRedirect("Noloading.html");	
			
		} else {
		String telefone = (String)request.getParameter("telefone");		
		String email = (String)request.getParameter("email");
		String func = (String)request.getParameter("func");
		String idade = (String)request.getParameter("idade");
		String peso = (String)request.getParameter("peso");
		String Mensagem = (String)request.getParameter("Mensagem");
		MensagemBanco.mensbanco(telefone, email, func, idade, peso, Mensagem);
		response.sendRedirect("Enviado.jsp?usuario="+ usuario +"&func="+ func);	

		}
	}	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}
}