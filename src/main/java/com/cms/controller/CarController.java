package com.cms.controller;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.bean.Car;
import com.cms.dao.CarDao;

public class CarController extends HttpServlet {
	CarDao dao = new CarDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		     String requestForm= request.getParameter("cms_button");
		     
		     
		     if(requestForm.equals("Insert Car")) {
		    	 String carNo = request.getParameter("CarNo");
		    	 String manufacture = request.getParameter("Manufacture");
		    	 String model = request.getParameter("Model");
		    	 int kmsRan = Integer.parseInt(request.getParameter("KmsRan"));
		    	 int priceExcepted = Integer.parseInt(request.getParameter("PriceExcepted"));
		    	 int noOfOwners = Integer.parseInt(request.getParameter("NoOfOwners"));
		    	 	 
		    	 Car bean = new Car(carNo,manufacture,model,kmsRan,priceExcepted,noOfOwners);
		    	 int  m = dao.insertCar(bean);
		    	 
		    	 
		    	 if(m == 1) {
		    		 response.sendRedirect("insertCarSuccess.jsp");
		    	 }else {
		    		 response.sendRedirect("insertCarFailure.jsp");
		    	 }
		     }
	}
	}
	