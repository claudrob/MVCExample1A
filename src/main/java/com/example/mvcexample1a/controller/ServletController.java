package com.example.mvcexample1a.controller;

import com.example.mvcexample1a.model.Rectangle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. process parameters

        //2. Create JavaBean
        Rectangle rectangle = new Rectangle(3,6);

        //3. add JavaBean to scope
        request.setAttribute("message", "Hello from the servlet");

        HttpSession session = request.getSession();
        session.setAttribute("rectangle", rectangle);

        //4. Redirect to selected view
        RequestDispatcher rd = request.getRequestDispatcher("view/displayVariables.jsp");
        rd.forward(request, response);
    }

}
