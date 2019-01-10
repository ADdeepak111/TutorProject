package model;




	import java.sql.Connection;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import Bean.AdminBean;
import Bean.StudentBean;
import Bean.TeacherBean;
import Bean.employerBean;
import DB.DBconnection;
	

	public class AdminModel {
		Connection conn=null;
		
		public AdminModel() {
			conn=DBconnection.getconConnection();
		}
		
		public int addfeed(AdminBean user)
		{
			System.out.println("in addfeed of model class");
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into feedback_form(fname,lname,Email,Subject,Contact,City) "
						+ "values('"+user.getFname()+"','"+user.getLname()+"','"+user.getEmail()+"','"+user.getSubject()+"'"+ ",'"+user.getContact()+"','"+user.getCity()+"')");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rows;
			
		}
		
		public int addContact(AdminBean user)
		{
			System.out.println("in addfeed of model class");
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into contact_us(fname,lname,Email,Subject,Contact,City) "
						+ "values('"+user.getFname()+"','"+user.getLname()+"','"+user.getEmail()+"','"+user.getSubject()+"'"+ ",'"+user.getContact()+"','"+user.getCity()+"')");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rows;
			
		}
		public int ApplyJob(AdminBean user)
		{
			System.out.println("in appy ");
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into appliedjobs(JobId,Email,Jcompany,Jtitle) "
						+ "values('"+user.getJid()+"','"+user.getEmail()+"','"+user.getJcompany()+"','"+user.getJtitle()+"')");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rows;
			
		}
		
		public boolean ApplyCheck(String Email,String JobId)
		{
			System.out.println("Apply check"+JobId+Email);
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			int flag=0;
			String query = "SELECT * FROM appliedjobs";
			try {
				pstmt = conn.prepareStatement(query);
				 rs = pstmt.executeQuery();
				
				 while(rs.next())
					{
						
						String s=rs.getString("Email");
						String i=rs.getString("JobId");
						System.out.println("ee"+s+"em"+Email+i);
						if(Email.equals(s) && JobId.equals(i))
						{flag=1;
						System.out.println("Here Applied Chacked");
						}
						else {
							
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
		
		public int addStudent(StudentBean user)
		{
			System.out.println("in addStudent of model class");
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into studentregistration(Name,Subject,PreferedLocation,Remarks,MNO,Location) "
						+ "values('"+user.getName()+"','"+user.getSubject()+"','"+user.getprefrance()+"','"+user.getRemarks()+"'"+ ",'"+user.getMNO()+"','"+user.getLocation()+"')");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rows;
			
		}
		
		
		public int ApplyStu(StudentBean user)
		{
			System.out.println("in Apply of model class");
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into applied_students(Name,PLocation,AId,MNo,Address) "
						+ "values('"+user.getName()+"','"+user.getprefrance()+"','"+user.getAId()+"'"+ ",'"+user.getMNO()+"','"+user.getLocation()+"')");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rows;
			
		}
		
		
		public int ForgotEmpPass(AdminBean bean)
		{
			
			System.out.println("Update Forgot Model");
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("update employers_registration set psw='"+bean.getpsw()+"',Contact='"+bean.getContact()+"'"
								+ ", cpsw='"+bean.getcpsw()+"'  where Email='"+bean.getEmail()+"'");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			return rows;
			
		}
	
		
		public String ForgotJobPassCheck(String Email,String Contact)
		{
			System.out.println("Hi Job");
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			boolean flag = false;
			System.out.println(Email+Contact);
			String query = "SELECT * FROM jobseeker_registration";
			try {
				pstmt = conn.prepareStatement(query);
				 rs = pstmt.executeQuery();
				
				 while(rs.next()){
					
				    
					 if ((Email.equals(rs.getString("Email"))) && Contact.equals(rs.getString("contact")) ){
						 
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
		
		public String ForgotEmpPassCheck(String Email,String Contact)
		{
			System.out.println("Hi Emp");
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			boolean flag = false;
			System.out.println(Email+Contact);
			String query = "SELECT * FROM employers_registration";
			try {
				pstmt = conn.prepareStatement(query);
				 rs = pstmt.executeQuery();
				
				 while(rs.next()){
					
				    
					 if ((Email.equals(rs.getString("Email"))) && Contact.equals(rs.getString("contact")) ){
						 
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
		
		
		public String LoginCheck(String Email,String psw)
		{
			System.out.println("Hi Admin");
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			boolean flag = false;
			String query = "SELECT * FROM admin_registration";
			try {
				pstmt = conn.prepareStatement(query);
				 rs = pstmt.executeQuery();
				
				 while(rs.next()){
					
				    
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
		public int AddJob(employerBean user)
		{
			System.out.println("in addjob of model class");
		Date today=new Date();SimpleDateFormat DATE_FORMAT=new SimpleDateFormat("dd/MM/yyyy");String dat=DATE_FORMAT.format(today);
		
			System.out.println("Todays Date ===="+today+"\n in format"+dat);
			int rows = 0;
			try {
				PreparedStatement stmt=conn.prepareStatement("insert into ajoblists(Email,Jdescription,company,Jtitle,Jtype,Msalary,Lsalary,Jlocation,Jprofile,Skill,NoJob,Cdate,today) "
						+ "values('"+user.getEmail()+"','"+user.getJdescription()+"','"+user.getCompany()+"','"+user.getJtitle()+"','"+user.getJtype()+"'"
								+ ",'"+user.getMsalary()+"','"+user.getLsalary()+"','"+user.getJlocation()+"','"+user.getJprofile()+"','"+user.getSkill()+"','"+user.getNoJob()+"','"+user.getCdate()+"','"+dat+"')");
				rows=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rows;
			
		}
		
		public boolean ifFeedEmailExists(String Email)
		{
			System.out.println("in ckeck mail id");
			PreparedStatement stmt;
			int flag=0;
			try {
				stmt = conn.prepareStatement("select Email from feedback_form");
				ResultSet rs=stmt.executeQuery();
				while(rs.next())
				{
					
					String s=rs.getString("Email");
					System.out.println("ee"+s+"em"+Email);
					if(Email.equals(s))
					{flag=1;
					System.out.println("Here Chacked");
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
		

		

		



	}
