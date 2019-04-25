package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

public class HelloServlet extends DefaultServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Request recEEved");
		try {
			resp.getWriter().write("<!DOCTYPE html><html><head></head><body><h1>Hello Interwebs!</h1></body></html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
