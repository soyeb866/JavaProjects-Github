package soyeb.org;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import soyeb.org.model.Person;


//@WebServlet("/MainController")
@WebServlet("/")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Person> staff = new ArrayList<>();
		staff.add(new Person("Nasir", 18));
		staff.add(new Person("Soyeb", 28));
		staff.add(new Person("Jesmin", 38));
		
		request.setAttribute("staff", staff);
		
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}

}
