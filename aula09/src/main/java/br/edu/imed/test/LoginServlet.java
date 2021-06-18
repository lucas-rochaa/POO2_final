package br.edu.imed.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		
		boolean x = testarcon.listuser(user, pass);
		
		if (x == true) {
			Conagenda.user(user);
			ServletAgenda.usuario(user);
			MensagemBanco.user(user);
			MensagemServlet.usuario(user);
			response.sendRedirect("index.html");

		}else {
			response.sendRedirect("CadastroUsuario.html");

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = (String)request.getParameter("username");
		String senha = (String)request.getParameter("password");		
		testarcon.cadastrar(nome, senha);
		response.sendRedirect("login.html");

	}

}