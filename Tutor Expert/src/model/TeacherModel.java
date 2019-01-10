package model;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;

import java.util.LinkedList;

import javax.servlet.http.Part;

import DB.DBconnection;
import Bean.TeacherBean;
import Bean.employerBean;



public class TeacherModel {
	Connection conn=null;
	
	public TeacherModel() {
		conn=DBconnection.getconConnection();
	}
	
	public int addTeacher(TeacherBean user)
	{
		System.out.println("in addtecher of model class");
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("insert into teacherregistration(Name,Email,psw,cpsw,RegisterAs,MNO) "
					+ "values('"+user.getName()+"','"+user.getEmail()+"','"+user.getpsw()+"','"+user.getcpsw()+"'"+ ",'"+user.getRegisterAs()+"','"+user.getMNO()+"')");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
	
	public LinkedList<employerBean> getAllUsers()
	{
		LinkedList<employerBean> list =new LinkedList<>();
		try {
			PreparedStatement stmt=conn.prepareStatement("select * from employers_registration");
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				employerBean user=new employerBean();
				user.setFname(rs.getString(2));
				user.setLname(rs.getString(3));
				user.setContact(rs.getString(6));
				user.setcpsw(rs.getString(8));
				user.setdescription(rs.getString(13));
				user.setJtitle(rs.getString(10));
				user.setLocation(rs.getString(12));
				user.setWebsite(rs.getString(9));
				user.setJtype(rs.getString(11));
				user.setOname(rs.getString(4));
				
				user.setEmail(rs.getString(5));
				user.setpsw(rs.getString(7));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public int EUpdate(employerBean bean)
	{System.out.println("Update Emp Model");
	
	
	
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("update employers_registration set fname='"+bean.getFname()+"',lname='"+bean.getLname()+"'"
					+ ",psw='"+bean.getpsw()+"',Contact='"+bean.getContact()+"' ,oname='"+bean.getOname()+"',website='"+bean.getWebsite()+"'"
							+ ", cpsw='"+bean.getcpsw()+"'  where Email='"+bean.getEmail()+"'");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
	
	
	public int TeacherUpdate(TeacherBean bean)
	{System.out.println("Update teacher Profile Model");
	

	
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("update teacherregistration set Address='"+bean.getAddress()+"',Gender='"+bean.getGender()+"'"
					+ " ,Education='"+bean.getQualification()+"'"
							+ ",Boards='"+bean.getBoard()+"',ExtraInfo='"+bean.getAbout()+"', Experiance='"+bean.getExperience()+"'  where TId='"+bean.getTId()+"'");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
	
	
	
	public int deleteUser(String Email)
	{
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("delete from employers_registration where id='"+Email+"'");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
	
	public String LoginCheck(String Email,String psw)
	{
		System.out.println("Hi teacher");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		String query = "SELECT * FROM teacherregistration";
		try {
			pstmt = conn.prepareStatement(query);
			 rs = pstmt.executeQuery();
			
			 while(rs.next()){
				 String Em=rs.getString("Email");
				 System.out.println(Em);
			    
				 if ((Email.equals(rs.getString("Email"))) && psw.equals(rs.getString("psw")) ){
					 
					 flag= true;
					
				 }
				
					
				 
				}
			 
			 
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		if(flag){
			
			return "success";
			
		}else{
			
			return "fail";
			
		}
		
	}
	
	
	public LinkedList<employerBean> getLapUsers()
	{
		LinkedList<employerBean> list =new LinkedList<>();
		try {
			PreparedStatement stmt=conn.prepareStatement("select * from employers_registration");
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				employerBean user=new employerBean();
				
				user.setFname(rs.getString(2));
				user.setLname(rs.getString(3));
				user.setEmail(rs.getString(5));
				
				user.setpsw(rs.getString(7));
	
				list.add(user);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	public boolean ifEmailExists(String Email)
	{
		System.out.println("in ckeck mail id");
		PreparedStatement stmt;
		int flag=0;
		try {
			stmt = conn.prepareStatement("select Email from teacherregistration");
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				
				String s=rs.getString("Email");
				System.out.println("ee"+s+"em"+Email);
				if(Email.equals(s))
				
				{
					flag=1;
				System.out.println("Here Chacked");
				break;
				}
				else {
					flag=0;
				}
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag==1)
			
			return true;
		else
			return false;
	}
	public int AddSubject(TeacherBean user)
	{
		System.out.println("in addjob of model class");
	Date today=new Date();SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("dd/MM/yyyy");String dat=DATE_FORMAT.format(today);
	
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("insert into tsubjects(TId,Subject,Class) "
					+ "values('"+user.getTId()+"','"+user.getSub()+"','"+user.getstd()+"')");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
	
	public int AddArea(TeacherBean user)
	{
		System.out.println("in addArea of model class");
	Date today=new Date();
	SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("dd/MM/yyyy");
	String dat=DATE_FORMAT.format(today);
	
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("insert into tareas(TId,Aname,City,Pincode) "
					+ "values('"+user.getTId()+"','"+user.getAnmae()+"','"+user.getCity()+"','"+user.getpin()+"')");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
	
	
	
}
