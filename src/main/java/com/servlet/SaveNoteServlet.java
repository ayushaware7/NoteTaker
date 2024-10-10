package com.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.Note;
import com.helper.FactoryProvider;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveNoteServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//title, content fetch
			String title = request.getParameter("title");
			String content =request.getParameter("content");
			 
			Note note = new Note(title , content , new Date());
			
			Session s = FactoryProvider.getFactory().openSession();
			Transaction tx = s.beginTransaction();
			s.save(note);
			tx.commit();
			s.close();
			
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>");
	        out.println("alert('Note is added successfully!');");
	        out.println("</script>");
	        out.println("<h1 style='text-aglin:center;'><a href='allNotes.jsp'>View Notes</a></h1>");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
