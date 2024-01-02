package com.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cms.bean.Car;
import com.cms.util.DBUtil;


public class CarDao {
	
	   public int insertCar(Car bean) {
		   int n=0;
		   try {
			   Connection con = DBUtil.getDBConnection();
			   String sql = "insert into tbl_car values(?,?,?,?,?,?)";
			   PreparedStatement ps = con.prepareStatement(sql);
			   ps.setString(1, bean.getCarNo());
			   ps.setString(2,bean.getManufacture());
			   ps.setString(3,bean.getModel());
			   ps.setInt(4,bean.getKmsRun());
			   ps.setInt(5, bean.getPriceExpected());
			   ps.setInt(6,bean.getNoOfOwners());
			   n = ps.executeUpdate();
		   }catch(Exception e) {
			   System.out.println(e);
		   }
		   return n;
	   }

}
