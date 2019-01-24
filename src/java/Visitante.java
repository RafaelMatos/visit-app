/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="visit", urlPatterns = {"/visit"})
public class Visitante extends HttpServlet {
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");        
        String completo = request.getParameter("nome")+ " " + request.getParameter("sobrenome"); 
        request.setAttribute("completo", completo);
        
        String cpf = request.getParameter("cpf");
        request.setAttribute("cpf", cpf);
        
        
//            Horario de entrada do visitante
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
            
            String entrada = sdf.format(d);
            request.setAttribute("entrada", entrada);
//            Horario de saida do visitante

            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            SimpleDateFormat sdfs = new SimpleDateFormat("dd/MM/yy HH:mm");
            gc.add(Calendar.HOUR,3);
            String saida = sdfs.format(gc.getTime());
            request.setAttribute("saida", saida);
        
        
        request.getRequestDispatcher("visit.jsp").forward(request,response);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
