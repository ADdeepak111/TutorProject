package Controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.security.auth.Subject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.mysql.jdbc.Blob;

import Bean.TeacherBean;
import Bean.employerBean;


import model.TeacherModel;
import model.empModel;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)
public class TeacherController extends HttpServlet{
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String request=req.getServletPath();
		switch(request)
		{
	
		case "/AddTeacherAccount":
			addTeacher(req, resp);
			break;
		case "/TeacherSignin":
			checkLogin(req,resp);
			break;
		case "/LogoutTeacher":
			logOut(req, resp);
			break;
	case "/TutorUpdate":
			EUpdate(req, resp);
			break;
		case "/AddSubjects":
			AddSubject(req,resp);
			break;
			
		case "/AddAreas":
	AddArea(req,resp);
	break;
		
		case "/deletelap":
			deleteUser(req, resp);
			break;
		case "/UploadProfile":
			UploadImgPro(req,resp);
			break;
			
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                
		
	
		
	}
	
	
	
	public void addTeacher(HttpServletRequest request,HttpServletResponse response)
	{
		
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String Name=request.getParameter("Name");
			
			String psw=request.getParameter("psw");
			String Email=request.getParameter("Email");
			String cpsw=request.getParameter("cpsw");
			String MNO=request.getParameter("MNO");
			
			String Location=request.getParameter("Location");
			String RegisterAs=request.getParameter("RegisterAs");
			
		
			TeacherBean bean=new TeacherBean();
			bean.setName(Name);
		
			bean.setEmail(Email);
			bean.setpsw(psw);
			bean.setMNO(MNO);
			bean.setcpsw(cpsw);
		
			bean.setRegisterAs(RegisterAs);
		
			bean.setLocation(Location);
			
			TeacherModel model=new TeacherModel();
			boolean r=model.ifEmailExists(Email);
			
			if(r)
			{
				try {
			
			
				String Error="Email '"+Email+"' Alrady Exist,check forgot password";
				
				 request.setAttribute("Exist",Error);
		RequestDispatcher dispatcher = request.getRequestDispatcher("signin.jsp");
		dispatcher.forward(request, response);
			
	           	
			
				}
			   catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else {
				int result=model.addTeacher(bean);
				if(result>0)
				{
						try {
							String SucessA="Account Created sucessfully";
							
							 request.setAttribute("SucessA",SucessA);
					RequestDispatcher dispatcher = request.getRequestDispatcher("signin.jsp");
					dispatcher.forward(request, response);
						
				           	} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else
				{
					out.print("<script type=\"text/javascript\">");
					out.print("alert('Account Not Created')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("signup.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			 } 
			
	}
	
	public void checkLogin(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("Check Login");
		response.setContentType("text/html");
		PrintWriter out1 = null;
		HttpSession hs=request.getSession();
		hs.invalidate();
		try {
			out1 = response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	
		
		String Email = request.getParameter("Email");
		String psw = request.getParameter("psw");
		
	
	
		String result;
       	System.out.println("Login"+Email+"pass"+psw);
		TeacherModel model=new TeacherModel();
		result = model.LoginCheck(Email, psw);

		try{
		if(("success").equalsIgnoreCase(result))
			
			{
			
			HttpSession session = request.getSession();
			session.setAttribute("Teacher", Email);
				RequestDispatcher rd=request.getRequestDispatcher("TeacherPro.jsp");
	           	rd.forward(request, response);
	    
           }
           	//response.sendRedirect("home.jsp");			
		else{
			String Error=" Login Fail: Check Username or password";
			
			 request.setAttribute("Error",Error);
	RequestDispatcher dispatcher = request.getRequestDispatcher("signin.jsp");
	dispatcher.forward(request, response);
		
           	
           
			//response.sendRedirect("demojsp.jsp");
		}
		}
		catch (Exception e)
		{
			System.out.println(e);		
		}
		
	
	}
	
	public void AddSubject(HttpServletRequest request,HttpServletResponse response) 
	{
		System.out.println("In Add Subjects Method");
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			HttpSession ses=request.getSession();
			Object Id = ses.getAttribute("TId");
			String TId=(String)Id;
		
			
			String Sub=request.getParameter("Subject");
			String std=request.getParameter("Standards");
		    
	

			TeacherBean bean=new TeacherBean();
		    bean.setTId(TId);
		
			bean.setSub(Sub);
	

			bean.setSub(std);
		
			System.out.println("add sub email"+TId+""+Sub+""+std);
			
		
			
			TeacherModel model=new TeacherModel();
					int result=model.AddSubject(bean);
				if(result>0)
				{
						try {
							String Error="Subject Added Sucessfully";
							
							 request.setAttribute("Sucess",Error);
					RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
					dispatcher.forward(request, response);
							} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else
				{
						try {
							String Error="Subject Not Added ";
							
							 request.setAttribute("Error",Error);
					RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
					dispatcher.forward(request, response);		} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			 } 
			
	
	public void AddArea(HttpServletRequest request,HttpServletResponse response) 
	{
		System.out.println("In Add Area Method");
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			HttpSession ses=request.getSession();
			Object Id = ses.getAttribute("TId");
			String TId=(String)Id;
		
			
			String Aname=request.getParameter("Aname");
			String City=request.getParameter("City");
			String pin=request.getParameter("Pincode");
		    
	

			TeacherBean bean=new TeacherBean();
		    bean.setTId(TId);
		bean.setAnmae(Aname);
		bean.setCity(City);
		bean.setpin(pin);
		
	
			System.out.println("add sub email"+TId);
			
		
			
			TeacherModel model=new TeacherModel();
					int result=model.AddArea(bean);
				if(result>0)
				{
						try {
							String Error="Area Added Sucessfully";
							
							 request.setAttribute("Sucess",Error);
					RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
					dispatcher.forward(request, response);
							} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else
				{
						try {
							String Error="Area Not Added ";
							
							 request.setAttribute("Error",Error);
					RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
					dispatcher.forward(request, response);		} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			 } 
			
	
	
	
	
	
	
	public void UploadImgPro(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{	 
		System.out.println("In Img");
		String dbURL = "jdbc:mysql://localhost:3306/tutorexpert";
    String dbUser = "root";
   String dbPass = "";

   
     
      InputStream inputStream1 = null; // input stream of the upload file

 
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("ProfileImg");
        HttpSession ses=request.getSession();
        Object usr = ses.getAttribute("Teacher");
        String Email=(String)usr;
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream1 = filePart.getInputStream();
            
        }
         
        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client
         
        try {
            // connects to the database
        	
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
 
            // constructs SQL statement
            String sql1="update teacherregistration set ProfileImg= ? where Email='"+Email+"'";
            String sql = "INSERT INTO  teacherregistration(ProfileImg)  values(?) ";
            PreparedStatement statement = conn.prepareStatement(sql1);
          
            if (inputStream1 != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBlob(1, inputStream1);
            }
 
 
            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
            	
            	RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
            	dispatcher.forward(request, response);
            }
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
         
     
        }
	}
	
	

	
	public void EUpdate(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{ 
System.out.println("In UpdateUser Method");
		
		PrintWriter out = null;
		
		String Gender=request.getParameter("Gender");
		
        HttpSession ses=request.getSession();
		Object usr = ses.getAttribute("TId");
		String TId=(String)usr;
		
	

	// input stream of the upload file
		
	
		String Qualification=request.getParameter("Qualification");
	String AdharNo=request.getParameter("AdharNo");
		String Experience=request.getParameter("Experience");
		String Board=request.getParameter("Board");
		String About=request.getParameter("skills");
		
		
		
		String location=request.getParameter("Location");

	
		System.out.println("UEmail"+TId+"fbame");
			 TeacherBean bean=new TeacherBean();
			 
			bean.setAdharNo(AdharNo); 
		bean.setGender(Gender);
		bean.setTId(TId);
		bean.setQualification(Qualification);
		bean.setExperience(Experience);
	bean.setAbout(About);
	bean.setBoard(Board);
		
		
		
		bean.setAddress(location);
		TeacherModel model=new TeacherModel();
		
		int result=model.TeacherUpdate(bean);
		if(result>0)
		{
			
		
				try {
					String Error="profile Updated Sucessfully";
					
					 request.setAttribute("USucess",Error);
			RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
			dispatcher.forward(request, response);
			
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			try {
				String Error="Profile Not updated";
				
				 request.setAttribute("UError",Error);
		RequestDispatcher dispatcher = request.getRequestDispatcher("TeacherPro.jsp");
		dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	
	}
	
	
	
	public void deleteUser(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("In deleteUser");
		try {
			PrintWriter out=response.getWriter();
			String Email=request.getParameter("Email");
			empModel model=new empModel();
			
			if(model.deleteUser(Email)!=0)
			{
				try {
					request.getRequestDispatcher("/viewlap").forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.print("<script type=\"text/javascript\">");
				out.print("alert('User deleted successfully')");
				out.print("</script>");
			}
			
			else
			{
				RequestDispatcher ds=request.getRequestDispatcher("Employer.jsp");
				try {
					ds.forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				out.print("<script type=\"text/javascript\">");
				out.print("alert('User not deleted')");
				out.print("</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	public void logOut(HttpServletRequest request,HttpServletResponse response)
	{
		
		System.out.println("Logout");
		try {  response.setContentType("text/jsp");
			PrintWriter pw=response.getWriter();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			HttpSession hs=request.getSession();
			hs.invalidate();
			System.out.println("You are Logged Out");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		;
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
