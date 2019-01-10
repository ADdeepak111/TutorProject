package Controller;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.LinkedList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	import javax.websocket.Session;

import Bean.AdminBean;
import Bean.employerBean;
import Bean.StudentBean;
import model.AdminModel;

import model.empModel;

	public class AdminController extends HttpServlet {
		private static final long serialVersionUID = 1L;

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			
			String request=req.getServletPath();
			switch(request)
			{
		
			case "/ApplyJob":
				Apply(req,resp);
				break;
			case "/AdminJobSubmit":
				AddJob(req,resp);
				break;
			case "/FeedbackSubmit":
				Feedback(req,resp);
				break;
			case "/ContactSubmit":
				Contact(req,resp);
				break;
		
		
		
			case "/ForgotEmpPass":
				ForgotEmpPass(req,resp);
				break;
				
			case "/Adminlogin":
				LoginCheck(req,resp);
				break;
			case "/LogoutAdmin":
				logOut(req, resp);
				break;
		
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
			
				
			
				
				String Jtitle=request.getParameter("Jtitle");
				String Jtype=request.getParameter("Jtype");
				 String Email=request.getParameter("Eemail");
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
				
			
				
				AdminModel model=new AdminModel();
						int result=model.AddJob(bean);
					if(result>0)
					{
						out.print("<script type=\"text/javascript\">");
						out.print("alert('Job Added Successfully')");
						out.print("</script>");
						RequestDispatcher ds=request.getRequestDispatcher("AdminPro.jsp");
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
						RequestDispatcher ds=request.getRequestDispatcher("AdminPro.jsp");
						try {
							ds.include(request, response);
						} catch (ServletException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				 } 
				
		
		
		
		public void showUserForm(HttpServletRequest request,HttpServletResponse response)
		{
			RequestDispatcher rd=request.getRequestDispatcher("");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public void Feedback(HttpServletRequest request,HttpServletResponse response)
		{
			System.out.println("In feedback Method");
			
				PrintWriter out = null;
				try {
					out = response.getWriter();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String fname=request.getParameter("fname");
				String lname=request.getParameter("lname");
				
				String Email=request.getParameter("Email");
			
				String contact=request.getParameter("Contact");
				String Subject=request.getParameter("Subject");
				String City=request.getParameter("City");
			System.out.println("City Check"+City);
					 AdminBean bean=new AdminBean();
				bean.setFname(fname);
				bean.setLname(lname);
				bean.setEmail(Email);
			
				bean.setContact(contact);
	
				
				bean.setCity(City);
				bean.setSubject(Subject);
			
				
				
				AdminModel model=new AdminModel();
				boolean r=model.ifFeedEmailExists(Email);
				System.out.println("result of check mail: "+r);
				if(r)
				{
					System.out.println("exist");
					out.print("<script type=\"text/javascript\">");
					out.print("alert('Feedback Not added , Email alrady exist')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("feedback form.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					int result=model.addfeed(bean);
					if(result>0)
					{
						RequestDispatcher ds=request.getRequestDispatcher("index.jsp");
						out.print("<script type=\"text/javascript\">");
						out.print("alert('Feedback Added Successfully')");
						out.print("</script>");
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
						RequestDispatcher ds=request.getRequestDispatcher("feedback form.jsp");
						try {
							ds.include(request, response);
						} catch (ServletException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				 } 
				
		}
		
		
		
		public void Contact(HttpServletRequest request,HttpServletResponse response)
		{
			System.out.println("In Conatact Method");
			
				PrintWriter out = null;
				try {
					out = response.getWriter();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String fname=request.getParameter("fname");
				String lname=request.getParameter("lname");
				
				String Email=request.getParameter("Email");
			
				String contact=request.getParameter("Contact");
				String Subject=request.getParameter("Subject");
				String City=request.getParameter("City");
			System.out.println("City Check"+City);
					 AdminBean bean=new AdminBean();
				bean.setFname(fname);
				bean.setLname(lname);
				bean.setEmail(Email);
			
				bean.setContact(contact);
	
				
				bean.setCity(City);
				bean.setSubject(Subject);
			
				
				
				AdminModel model=new AdminModel();
		
				
					int result=model.addContact(bean);
					if(result>0)
					{
						RequestDispatcher ds=request.getRequestDispatcher("index.jsp");
						out.print("<script type=\"text/javascript\">");
						out.print("alert('Contact Added Successfully')");
						out.print("</script>");
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
						out.print("alert('Contact not added')");
						out.print("</script>");
						RequestDispatcher ds=request.getRequestDispatcher("feedback form.jsp");
						try {
							ds.include(request, response);
						} catch (ServletException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				 } 
				
		
		public void Apply(HttpServletRequest request,HttpServletResponse response)
		{
			System.out.println("In Conatact Method");
			
				PrintWriter out = null;
				try {
					out = response.getWriter();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 HttpSession session = request.getSession();
					Object JJtitle= session.getAttribute("JJtitle");
					Object Jcompany = session.getAttribute("JSecfname");
				Object Job = session.getAttribute("JobId");
				Object Em = session.getAttribute("Email");
				String JobId=(String)Job;
				String Jtitle=(String)JJtitle;
				String Jcompany1=(String)Jcompany;
				
				String Email=(String)Em;
			
				System.out.println("In Apply Method"+Job+Email);
					 AdminBean bean=new AdminBean();
				bean.setEmail(Email);
				bean.setJid(JobId);
				bean.setJcompany(Jcompany1);
				bean.setJtitle(Jtitle);
				
				
				
				AdminModel model=new AdminModel();
				boolean r=model.ApplyCheck(Email,JobId);
				System.out.println("result of check mail: "+r);
				if(r)
				{
					out.print("<script type=\"text/javascript\">");
					out.print("alert('Alrady Applied')");
					out.print("</script>");
					RequestDispatcher ds=request.getRequestDispatcher("JobseekerPro.jsp");
					try {
						ds.include(request, response);
					} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
				}
				else {
				
					int result=model.ApplyJob(bean);
					if(result>0)
					{
						RequestDispatcher ds=request.getRequestDispatcher("JobseekerPro.jsp");
						out.print("<script type=\"text/javascript\">");
						out.print("alert('Applied Successfully')");
						out.print("</script>");
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
						out.print("alert('Not Applied')");
						out.print("</script>");
						RequestDispatcher ds=request.getRequestDispatcher("JobseekerPro.jsp");
						try {
							ds.include(request, response);
						} catch (ServletException | IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}}
				 } 
				
		
		
		
		
		
		
		
		
		
	
		public void ForgotEmpPass(HttpServletRequest request,HttpServletResponse response)
		{ 
	System.out.println("In forgot Method");
			
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		String Email=request.getParameter("Email");
		String psw=request.getParameter("psw");

			String cpsw=request.getParameter("cpsw");
			String contact=request.getParameter("Contact");
		
				AdminBean bean=new AdminBean();

			bean.setEmail(Email);
			bean.setpsw(psw);
			bean.setContact(contact);
			bean.setcpsw(cpsw);
			String result1;
	       	System.out.println("Login"+Email+""+contact);
			AdminModel model1=new AdminModel();
		 result1 = model1.ForgotEmpPassCheck(Email,contact);

		 if(("success").equalsIgnoreCase(result1)){
		
		
			
			AdminModel model=new AdminModel();
			int result=model.ForgotEmpPass(bean);
			if(result>0)
			{
				try {
				String Error="Password Updated sucessfully";
			
			 request.setAttribute("Sucess",Error);
	RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
	dispatcher.forward(request, response);

			
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else
			{
				out.print("<script type=\"text/javascript\">");
				out.print("alert('Password Not updated')");
				out.print("</script>");
				RequestDispatcher ds=request.getRequestDispatcher("ForgotEmpPass.jsp");
				try {
					ds.include(request, response);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	}	
	else {
		
		out.print("<script type=\"text/javascript\">");
		out.print("alert('Enter Email and Contact details correct')");
		out.print("</script>");
		RequestDispatcher ds=request.getRequestDispatcher("ForgotEmpPass.jsp");
		try {
			ds.include(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		}
		
		
		
	
		
		public void LoginCheck(HttpServletRequest request,HttpServletResponse response)
		{
			System.out.println("Check ad Login");
			response.setContentType("text/html");
			HttpSession hs=request.getSession();
			hs.invalidate();
			PrintWriter out1 = null;
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
			AdminModel model=new AdminModel();
			result = model.LoginCheck(Email, psw);

			System.out.println("result in controller is : "+result);
			try{
			if(("success").equalsIgnoreCase(result))
				
				{

				HttpSession session = request.getSession();
				session.setAttribute("Admin", Email);
			

					RequestDispatcher rd=request.getRequestDispatcher("AdminPro.jsp");
		           	rd.forward(request, response);
		    
		           	
		           	
	           	  out1.print("<script type=\"text/javascript\">");
	           	  out1.println("alert('Login Successfully');");
	           	  out1.println("</script>");}
	           	//response.sendRedirect("home.jsp");			
			else{
				String Error=" Login Fail: Check Username or password";
				
				 request.setAttribute("ErrorA",Error);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Admin Login.jsp");
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
	

