/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author moritakenji
 */
@WebServlet(name = "CounterServlet02", urlPatterns = {"/CounterServlet02"})
public class CounterServlet02 extends HttpServlet {
    private Integer count;
    @Override
    public void init (ServletConfig config) throws ServletException {
        super.init(config);
        count = 0;
        System.out.println("init()が実行されました");
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        count++;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CounterServlet02</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CounterServlet02 at " + request.getContextPath() + "</h1>");
            out.println("<p>" + count + "</p>");
            out.println("<a href='/WebApplication1/CounterServlet02'> 更新 </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        System.out.println("doGo()が実行されました");
    }

    @Override
    public void destroy() {
        System.out.println("destory()が実行されました");
    }
}
