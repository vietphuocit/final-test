package com.fsoft.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.model.HoatDong;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "/views/trang-chu.jsp";
		String action = req.getParameter("action");

		if (action != null) {
			switch (action) {
			case "them-moi":

				path = "/views/them-moi.jsp";
				break;

			case "danh-sach":

				req.setAttribute("listhd", null);

				path = "/views/danh-sach.jsp";
				break;

			case "xoa":

				req.setAttribute("listhd", null);

				path = "/views/danh-sach.jsp";
				break;

			case "sua":

				path = "/views/sua.jsp";
				break;

			default:
				break;
			}
		}

		req.getRequestDispatcher(path).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = "/views/trang-chu.jsp";
		String action = req.getParameter("action");

		if (action != null) {
			switch (action) {
			case "them-moi":
				
				System.out.println(req.getParameter("tenHD"));

				path = "/views/danh-sach.jsp";
				break;

			default:
				break;
			}
		}

		req.getRequestDispatcher(path).forward(req, resp);
	}
}
