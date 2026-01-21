package com.dm.assign1.controller;

import com.dm.assign1.model.RegisterationForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerservlet")

public class RegisterServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RegisterationForm form = new RegisterationForm();

        form.setUserId(request.getParameter("userid"));
        form.setPassword(request.getParameter("password"));
        form.setName(request.getParameter("name"));
        form.setAddress(request.getParameter("address"));
        form.setCountry(request.getParameter("country"));
        form.setZip(request.getParameter("zip"));
        form.setEmail(request.getParameter("email"));
        form.setSex(request.getParameter("sex"));
        form.setLanguage(request.getParameter("language"));
        form.setAbout(request.getParameter("about"));

        boolean error = false;

        if (form.getUserId().length() < 5 || form.getUserId().length() > 12)
            error = true;

        if (form.getPassword().length() < 7 || form.getPassword().length() > 12)
            error = true;

        if (!form.getName().matches("[A-Za-z ]+"))
            error = true;

        if (!form.getZip().matches("\\d+"))
            error = true;

        if (!form.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"))
            error = true;

        if (form.getCountry().equals("select"))
            error = true;

        if (form.getSex() == null)
            error = true;

        if (form.getLanguage() == null)
            error = true;

        if (error) {
            request.setAttribute("error", "Validation Failed");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}