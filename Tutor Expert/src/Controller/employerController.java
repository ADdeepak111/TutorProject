package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.employerBean;
import Bean.StudentBean;

import model.empModel;

public class employerController extends HttpServlet{
	

	
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
		case "/EmpSubmit":
			checkLogin(req,resp);
			break;
		case "/Empreg":
			addUser(req, resp);
			break;
	case "/UpdateEmp":
			EUpdate(req, resp);
			break;
		case "/JobSubmit":
			AddJob(req,resp);
			break;
		case "/deletelap":
			deleteUser(req, resp);
			break;
		case "/LogoutEmp":
			logOut(req, resp);
			break;
		default:
			getAllUsers(req, resp);
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                
		
	
		
	}
	
	
	
	public void addUser(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("In addUser Method");
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String fname=request.getParameter("fname");
			String lname=request.getParameter("lname");
			String psw=request.getParameter("psw");
			String Email=request.getParameter("Email");
			String cpsw=request.getParameter("cpsw");
			String Contact=request.getParameter("Contact");
			String website=request.getParameter("website");
			String Jtitle=request.getParameter("Jtitle");
			String Jtype=request.getParameter("Jtype");
			String Location=request.getParameter("Location");
			String oname=request.getParameter("oname");
			String description=request.getParameter("description");
	
			employerBean bean=new employerBean();
			bean.setFname(fname);
			bean.setLname(lname);
			bean.setEmail(Email);
			bean.setpsw(psw);
			bean.setContact(Contact);
			bean.setcpsw(cpsw);
			bean.setdescription(description);
			bean.setJtitle(Jtitle);
			bean.setJtype(Jtype);
			bean.setOname(oname);
			bean.setWebsite(website);
			bean.setLocation(Location);
			
			empModel model=new empModel();
			boolean r=model.ifEmailExists(Email);
			System.out.println("result of check mail: "+r);
			if(r)
			{
				try {
				System.out.println("exist");
			
				String Error="Email : '"+Email+"' Alrady Exist";
				
				 request.setAttribute("Exist",Error);
		RequestDispatcher dispatcher = request.getRequestDispatcher("empreg.jsp");
		dispatcher.forward(request, response);
			
	           	
			
				}
			   catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			else {
				int result=model.addUser(bean);
				if(result>0)
				{
					out.print("<script type=\"text/javascript\">");
					out.print("alert('User Added Successfully')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("index.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else
				{
					out.print("<script type=\"text/javascript\">");
					out.print("alert('User not added')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("empreg.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			 } 
			
	}
	
	public void AddJob(HttpServletRequest request,HttpServletResponse response) 
	{
		System.out.println("In Add job Method");
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			HttpSession ses=request.getSession();
			Object usr = ses.getAttribute("Em");
			String Email=(String)usr;
		
			
			String Jtitle=request.getParameter("Jtitle");
			String Jtype=request.getParameter("Jtype");
		    
			String Skill=request.getParameter("skills");
			String NoJob=request.getParameter("NoJob");
			String Msalary=request.getParameter("Msal");
			String Lsalary=request.getParameter("Lsalary");
			String Jlocation=request.getParameter("Jlocation");
			String Jprofile=request.getParameter("Jprofile");
		    String Cdate=request.getParameter("Cdate");
		
		 
		    
			String Company=request.getParameter("Company");
			String Jdescription=request.getParameter("Jdescription");
	
			employerBean bean=new employerBean();
		    bean.setEmail(Email);
			bean.setJtitle(Jtitle);
			bean.setJtype(Jtype);
			bean.setJdescription(Jdescription);
			bean.setCdate(Cdate);
			bean.setMsalary(Msalary);
			bean.setLsalary(Lsalary);
			bean.setJprofile(Jprofile);
			bean.setJlocation(Jlocation);

			bean.setCompany(Company);
			bean.setSkill(Skill);
			bean.setNoJob(NoJob);
			
			bean.setNoJob(NoJob);
			System.out.println("add job email"+Email+""+NoJob+""+Cdate);
			
		
			
			empModel model=new empModel();
					int result=model.AddJob(bean);
				if(result>0)
				{
					out.print("<script type=\"text/javascript\">");
					out.print("alert('Job Added Successfully')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("EmployerPro.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else
				{
					out.print("<script type=\"text/javascript\">");
					out.print("alert('Job not added')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("EmployerPro.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			 } 
			
	
	
	
	
	
	
	public void getAllUsers(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("In get all users");
		try {
			PrintWriter out=response.getWriter();
			empModel model=new empModel();
			LinkedList<employerBean> list=model.getAllUsers();
			if(list!=null)
			{
				out.print("<script type=\"text/javascript\">");
				out.print("alert('User retreived successfully')");
				out.print("</script>");
			}
			
			else
			{
				out.print("<script type=\"text/javascript\">");
				out.print("alert('Users not retrieved')");
				out.print("</script>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	

	
	public void EUpdate(HttpServletRequest request,HttpServletResponse response)
	{ 
System.out.println("In UpdateUser Method");
		
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String psw=request.getParameter("psw");
HttpSession ses=request.getSession();
		Object usr = ses.getAttribute("Em");
		String Email=(String)usr;
		
		
	
		String cpsw=request.getParameter("cpsw");
		String contact=request.getParameter("Contact");
		String oname=request.getParameter("oname");
		String location=request.getParameter("location");
		String website=request.getParameter("website");
	
		System.out.println("UEmail"+Email+"fbame"+contact);
			 employerBean bean=new employerBean();
		bean.setFname(fname);
		bean.setLname(lname);
		bean.setEmail(Email);
		bean.setpsw(psw);
		bean.setContact(contact);
		bean.setcpsw(cpsw);
		bean.setLocation(location);
		bean.setWebsite(website);
		bean.setOname(oname);
		empModel model=new empModel();
		
		int result=model.EUpdate(bean);
		if(result>0)
		{
			
		
				try {
					out.print("<script type=\"text/javascript\">");
					out.print("alert('User Updated Successfully')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("EmployerPro.jsp");
					
						ds.include(request, response);

			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			out.print("<script type=\"text/javascript\">");
			out.print("alert('User not added')");
			out.print("</script>");
			RequestDispatcher ds=request.getRequestDispatcher("Eupdate.jsp");
			try {
				ds.include(request, response);
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
	    System.out.println("I am in login controller");
		
		String Email = request.getParameter("Email");
		String psw = request.getParameter("psw");
		
	
	
		String result;
       	System.out.println("Login"+Email+"pass"+psw);
		empModel model=new empModel();
		result = model.LoginCheck(Email, psw);

		System.out.println("result in controller is : "+result);
		try{
		if(("success").equalsIgnoreCase(result))
			
			{

			HttpSession session = request.getSession();
			session.setAttribute("Employer", Email);
				RequestDispatcher rd=request.getRequestDispatcher("EmployerPro.jsp");
	           	rd.forward(request, response);
	    
           	  out1.print("<script type=\"text/javascript\">");
           	  out1.println("alert('Login Success');");
           	  out1.println("</script>");}
           	//response.sendRedirect("home.jsp");			
		else{
			String Error=" Login Fail: Check Username or password";
			
			 request.setAttribute("Error",Error);
	RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	dispatcher.forward(request, response);
		
           	
           
			//response.sendRedirect("demojsp.jsp");
		}
		}
		catch (Exception e)
		{
			System.out.println(e);		
		}
		
	
	}
	
	public void logOut(HttpServletRequest request,HttpServletResponse response)
	{
		try {  response.setContentType("text/jsp");
			PrintWriter pw=response.getWriter();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			request.getRequestDispatcher("index.jsp").forward(request, response);
			HttpSession hs=request.getSession();
			hs.invalidate();
			System.out.println("You are Logged Out");
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
