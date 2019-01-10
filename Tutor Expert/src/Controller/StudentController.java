package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Bean.StudentBean;
import model.AdminModel;


public class StudentController extends HttpServlet{
	

	
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
		
		case "/StudentSubmit":
			addUser(req, resp);
			break;
		case "/ApplyTutor":
			ApplyStudents(req, resp);
			break;
		
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                
		
	
		
	}
	

	
	public void addUser(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("In addUser Method");
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
			
				e1.printStackTrace();
			}
			String Name=request.getParameter("Name");
		
		
			String MNO=request.getParameter("MNO");
			String Subject=request.getParameter("Subject");
			String Location=request.getParameter("Location");
			String prefrance=request.getParameter("prefrance");
			String Remarks=request.getParameter("Remarks");
				 StudentBean bean=new StudentBean();
			bean.setName(Name);
		
			bean.setMNO(MNO);
			bean.setLocation(Location);
			bean.setRemarks(Remarks);
			bean.setprefrance(prefrance);
			bean.setSubject(Subject);
			
			
			
			AdminModel model=new AdminModel();
			
			
		
				int result=model.addStudent(bean);
				if(result>0)
				{
				
						try {
							String Sucess="Form Submiteed Sucessfully";
							
							 request.setAttribute("Sucess",Sucess);
					RequestDispatcher dispatcher = request.getRequestDispatcher("Registre.jsp");
					dispatcher.forward(request, response);
						
					} catch (ServletException | IOException e) {
						
						e.printStackTrace();
					}
				}
				
				else
				{
						try {
							String Unsucess="Form Not Added";
							
							 request.setAttribute("Unsucess",Unsucess);
					RequestDispatcher dispatcher = request.getRequestDispatcher("Registre.jsp");
					dispatcher.forward(request, response);
						
							
						} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			  
			
	}
	public void ApplyStudents(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("In Apply");
		
			PrintWriter out = null;
			try {
				out = response.getWriter();
			} catch (IOException e1) {
			
				e1.printStackTrace();
			}
			String Name=request.getParameter("Name");
			HttpSession session=request.getSession();
			Object Aid = session.getAttribute("TId");
            String AId=(String)Aid;
		
			String MNO=request.getParameter("Contact");
			String Location=request.getParameter("Address");
			
			String prefrance=request.getParameter("prefrance");
		
				 StudentBean bean=new StudentBean();
			bean.setName(Name);
		
			bean.setMNO(MNO);
			bean.setAId(AId);
	bean.setLocation(Location);
			bean.setprefrance(prefrance);
		
			
			
			
			AdminModel model=new AdminModel();
			
			
		
				int result=model.ApplyStu(bean);
				if(result>0)
				{
				
						try {
							String Sucess="Applied Sucessfully";
							
							 request.setAttribute("Sucess",Sucess);
					RequestDispatcher dispatcher = request.getRequestDispatcher("ListOfTuters.jsp");
					dispatcher.forward(request, response);
						
					} catch (ServletException | IOException e) {
						
						e.printStackTrace();
					}
				}
				
				else
				{
						try {
							String Unsucess="Not Applied";
							
							 request.setAttribute("Unsucess",Unsucess);
					RequestDispatcher dispatcher = request.getRequestDispatcher("ListOfTuters.jsp");
					dispatcher.forward(request, response);
						
							
						} catch (ServletException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			  
			
	}
	
	
	
}

