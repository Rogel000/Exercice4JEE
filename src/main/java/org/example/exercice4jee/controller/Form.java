package org.example.exercice4jee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice4jee.model.Cat;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/form")
public class Form extends HttpServlet {
    @Override
    public void init() throws ServletException {

        if (getServletContext().getAttribute("catList") == null) {
            getServletContext().setAttribute("catList", new ArrayList<Cat>());
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/form.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        String favoriteFood = req.getParameter("favoriteFood");
        String birthDate = req.getParameter("birthDate");

        Cat newCat = new Cat(name, breed, favoriteFood, birthDate);

        List<Cat> catList = (List<Cat>) getServletContext().getAttribute("catList");
        catList.add(newCat);

        resp.sendRedirect(req.getContextPath() + "/form");
    }


}
