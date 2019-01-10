package model;


import java.sql.Connection;
import java.util.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.text.SimpleDateFormat;

import java.util.LinkedList;


import DB.DBconnection;
import Bean.employerBean;



public class empModel {
	Connection conn=null;
	
	public empModel() {
		conn=DBconnection.getconConnection();
	}
	
	public int addUser(employerBean user)
	{
		System.out.println("in adduser of model class");
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("insert into employers_registration(fname,lname,Email,psw,cpsw,oname,Contact,website) "
					+ "values('"+user.getFname()+"','"+user.getLname()+"','"+user.getEmail()+"','"+user.getpsw()+"','"+user.getcpsw()+"'"+ ",'"+user.getOname()+"','"+user.getContact()+"','"+user.getWebsite()+"')");
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
		System.out.println("Hi emp");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		String query = "SELECT * FROM employers_registration";
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
			stmt = conn.prepareStatement("select Email from employers_registration");
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
	public int AddJob(employerBean user)
	{
		System.out.println("in addjob of model class");
	Date today=new Date();SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("dd/MM/yyyy");String dat=DATE_FORMAT.format(today);
	
		System.out.println("Todays Date ===="+today+"\n in format"+dat);
		int rows = 0;
		try {
			PreparedStatement stmt=conn.prepareStatement("insert into joblists(Email,Jdescription,company,Jtitle,Jtype,Msalary,Lsalary,Jlocation,Jprofile,Skill,NoJob,Cdate,today) "
					+ "values('"+user.getEmail()+"','"+user.getJdescription()+"','"+user.getCompany()+"','"+user.getJtitle()+"','"+user.getJtype()+"'"
							+ ",'"+user.getMsalary()+"','"+user.getLsalary()+"','"+user.getJlocation()+"','"+user.getJprofile()+"','"+user.getSkill()+"','"+user.getNoJob()+"','"+user.getCdate()+"','"+dat+"')");
			rows=stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
		
	}
}
