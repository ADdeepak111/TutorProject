<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en-US">
<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
<style type="text/css">
html {
  scroll-behavior: smooth;
}</style>

<script async src="https://www.googletagmanager.com/gtag/js?id=UA-120289275-7"></script>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
<title>TutorExpert</title>
<meta name="author" content="Tutors in Pune, Mumbai, Bangalore" />
<meta property="og:title" content="Tutors in Pune, Mumbai, Bangalore" />
<meta name="description" content="TutorExpert - Service provider of private tuitions, find tutors, home tuitions, home tutors, pune, India">
<meta name="keywords" content="Private Tuitions, Find Tutors, Home Tuitions, Home Tutors, Local Tutor, CBSE , ICSE, IGCSE , IB, STATE, Medical, Engineering, Bangalore, Pune, India">

<meta property="og:url" content="http://TutorExpert.com/" />
<meta property="og:description" content="Eazytutors provides best home tutors, trainers, which we personally handpick and give you the best">
<meta property="og:image" content="assets/images/favicon.png">
<meta property="og:type" content="Home Tutors in Pune, Mumbai, Bangalore" />
<meta property="og:locale" content="en_GB" />
<meta property="og:locale:alternate" content="fr_FR" />
<meta property="og:locale:alternate" content="es_ES" />
<meta name='robots' content='index,follow'/>
<link rel="shortcut icon" href="assets/images/favicon.png" type="image/x-icon" />		
<link rel='stylesheet' id='dsidxpress-icons-css'  href='assets/plugins/dsidxpress/css/dsidx-icons2cb62cb6.css?ver=4.5.5' type='text/css' media='all' />
<link rel='stylesheet' id='dsidxpress-unconditional-css'  href='assets/plugins/dsidxpress/css/client2cb62cb6.css?ver=4.5.5' type='text/css' media='all' />
<link rel='stylesheet' id='dsidxwidgets-unconditional-css'  href='assets/plugins/dsidxpress/dsidxwidgets/css/client2cb62cb6.css?ver=4.5.5' type='text/css' media='all' />
<link rel='stylesheet' id='reales_plugin_style-css'  href='assets/plugins/short-tax-post/css/style51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='datepicker_style-css'  href='assets/plugins/short-tax-post/css/datepicker51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='font_awesome-css'  href='assets/css/font-awesome51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='simple_line_icons-css'  href='assets/css/simple-line-icons51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='jquery_ui-css'  href='assets/css/jquery-ui51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='file_input-css'  href='assets/css/fileinput.min51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap_style-css'  href='assets/css/bootstrap51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='datepicker-css'  href='assets/css/datepicker51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='fancybox-css'  href='assets/css/jquery.fancybox51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='fancybox_buttons-css'  href='assets/css/jquery.fancybox-buttons51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='reales_style-css'  href='assets/style51525152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='idx_style-css'  href='assets/css/idx51525152.css?ver=1.0' type='text/css' media='all' />
<script type='text/javascript' src='assets/js/GlobalScripts.js'></script>
<script type='text/javascript' src='includes/js/jquery/jqueryb8ffb8ff.js?ver=1.12.4'></script>
<script type='text/javascript' src='includes/js/jquery/jquery-migrate.min330a330a.js?ver=1.4.1'></script>
<script type='text/javascript' src='includes/js/plupload/plupload.full.mincc91cc91.js?ver=2.1.8'></script>
<script type='text/javascript' src='includes/js/plupload/handlers.min2cb62cb6.js?ver=4.5.5'></script>
<link rel='https://api.w.org/' href='wp-json/index.html' />

<script src="assets/suggestion/jquery-1.10.2.js" type="text/javascript"></script>
<link href="assets/suggestion/jquery-ui.css" rel="stylesheet" type="text/css"/>
<script src="assets/suggestion/jquery-ui.js" type="text/javascript"></script>

<link rel="EditURI" type="application/rsd+xml" title="RSD" href="xmlrpc0db00db0.html?rsd" />
<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="includes/wlwmanifest.xml" /> 
<meta name="generator" content="WordPress 4.5.5" />
<link rel="canonical" href="index-2.html" />
<link rel='shortlink' href='index-2.html' />
<link rel="alternate" type="application/json+oembed" href="wp-json/oembed/1.0/embed446e446e.html?url=http%3A%2F%2Fmariusn.com%2Fthemes%2Freales-wp%2F" />
<link rel="alternate" type="text/xml+oembed" href="wp-json/oembed/1.0/embed88888888.html?url=http%3A%2F%2Fmariusn.com%2Fthemes%2Freales-wp%2F&amp;format=xml" /><script>

  </script>
  <script type="text/javascript">
$(function(){
	  $("#Header").load("header.jsp"); 
	  $("#Footer").load("footer.jsp"); 
	});
	</script> 
<body class="home page page-id-2 page-template page-template-fullwidth page-template-fullwidth-php no-transition" style="overflow-x:hidden;">
       
 <%Object usr1 = session.getAttribute("Teacher");
String Email1=(String)usr1;
if(Email1!=null){



%>

<%

String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/tutorexpert";

String userId = "root";
String password = "";

String Id;
try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>





    <div id="hero-container">
        <div id="slideshow">
            <div style='background-image: url(assets/img/slide6.jpg)'></div>
            <div style='background-image: url(assets/img/slide6.jpg); display:none;'></div>
            <div style='background-image: url(assets/img/slide7.jpg); display:none;'></div>
            <div style='background-image: url(assets/img/slide8.jpg); display:none;'></div>
            <div style='background-image: url(assets/img/slide9.jpg); display:none;'></div>
        </div>
        <div class="slideshowShadow"></div>
    <div  id="Header"></div>
           		<%
try{ 
    Blob image = null;
    byte[] imgData = null;
    FileOutputStream fos; 
  
 
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();
Object usr = session.getAttribute("Teacher");
String Email=(String)usr;
String sql ="SELECT * FROM teacherregistration WHERE Email='"+Email+"'";

resultSet = statement.executeQuery(sql);
if(resultSet.next()){
Id =resultSet.getString("TId");
	HttpSession ses= request.getSession();
	ses.setAttribute("TId", Id);
	System.out.println("In Teacherpro == "+Id);
 
	
	image = resultSet.getBlob("ProfileImg");
	
    imgData = image.getBytes(1,(int)image.length());
   
   
    fos=new FileOutputStream("d://apache-tomcat-8.5.34/webapps/ROOT/temp/Pro.jpg"); 
  
    fos.write(imgData); 
    fos.close();


  %>  
        </div>
        <div class="home-caption" st>
        
        <h1 class="home-title" style="font-family:cursive,Impact, Charcoal, sans-serif ;font-size:55px; color:#FF6600; ">Welcome</h1>
        
        <h3 style="font-size:40px;font-family:Arial Black, Gadget, sans-serif; color: #FF9933"><%=resultSet.getString("Name")%>  </h3>
            <h1 class="home-title" style="font-size:23px; margin-top: 80px;">Update Your Profile Here</h1>
            <a href="#" > <button style="padding:8px; font-size:15px; color:#fff;  background-color:#6666FF ;border-radius:8px; ">Payment Options</button></a>  <br>  <br>
         	<br />
			
        </div>
	
    <div class="spotlight1" style="   background-color: #6666FF;">
      <div style="border:4px solid #000066; font-size: 15px; color: #fff">
 
   <ul class="nav nav-tabs">
    <li class="nav-item">
      <a class="nav-link active" href="TeacherPro.jsp" style="background-color: #fff;color:#000;">Profile</a>
    </li>
   
    <li class="nav-item">
      <a class="nav-link" href="Tupdate.jsp" style=" color: #000">Update Profile</a>
    </li>
    <li class="nav-item">
      <a class="nav-link disabled" href="LogoutTeacher" style=" color: #000">logout</a>
    </li>
  </ul>
  
</div>



   </div>


 


     <div id="" class="page-wrapper">
        <div class="page-content">
 	
				<div class="post-2 page type-page status-publish hentry">
					<div class="row well" style="background-color: 	#b3b3ff ">
       <div class="col-lg-6" >    
       <div style="border: 1px solid blue; border-radius:8px; max-width: 150px; align-self: left; " >
   <img src="./Pro.jpg"   alt="Profile Image" width="130px" height="90px">

                      
      </div> </div>
    <div class="col-lg-6" style="text-align: right; padding-right:10px; " >
    
        <h2 style="font-size: 25px; font-style: italic,Impact ;">   <%=resultSet.getString("Name") %></h2>
        <h4 style="font-size: 18px; font-style: italic;" >( <%=resultSet.getString("Email") %> )</h4>
         <h4 style="font-size: 18px; font-style: italic;" ><%=resultSet.getString("MNO") %></h4>                
   <br> 

   </div>
     <a href='#' class='btn btn-sm btn-success pull-left' data-toggle='modal'  data-target='#AddProfile'>Add Image</a><br/><br/>
      
  
    <div class="col-lg-12" style="border-bottom:1px solid black;">
    
       
   <br>
                      
				
							</div>                            
                            <div class="col-lg-6">
                                <div class="row">
                               
                                    <div class="col-lg-12">
                                        <br />
                                                                                <p style="text-transform:capitalize;"><i class="fa fa-user"></i>&nbsp;<b>
                                             <%=resultSet.getString("RegisterAs") %>   </b></p>
 <p><i class="fa fa-user"></i>&nbsp;
                                           <%=resultSet.getString("Education") %>                                       </p>
                                                                                <p><i class="fa fa-user"></i>&nbsp;
                                           <%=resultSet.getString("Gender") %>                                       </p>
                                        <br />
                                       
                                        <b><i class="fa fa-tachometer"></i>&nbsp;Teaching Experience :</b>
                                       
                                                              <%=resultSet.getString("Experiance") %> ( Years )                   <p>
                                           
                                             <br>
                                        <b> <i class="fa fa-tachometer"></i>&nbsp;Boards Tutor Teaches Students From :<br /></b>
                                    &nbsp;&nbsp;&nbsp;  <%=resultSet.getString("Boards")  %>
                                      
                                      
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="row">
                                    <div class="col-lg-12">
                                      </p>
                                        <b><i class="fa fa-user"></i>&nbsp;About Tutor</b><br />
                                               <%=resultSet.getString("ExtraInfo") %>   <p>&nbsp;&nbsp;&nbsp;
                                           
                                        </p>
                                    </div>
                                
                                </div>
                            </div>
                        </div>
                        
                        		        <% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>	
                        
                        <br /><br />
                        <div class="row" style="background-color: white; box-shadow: 2px 2px 2px 2px #0EAAA6;">
                            <h2 class="text-center">Tutor Tutoring Preferences</h2>
                            					  <div align="center" >
                            					  <span style="color: red; align-content: center;">
<%Object error=request.getAttribute("Error");
String Error=(String)error;
if(Error!=null){
out.print(Error);
} %>
</span>
<span style="color: Green; align-content: center;">
<% 
Object Fail=request.getAttribute("Sucess");
String Fails=(String)Fail;
if(Fails!=null){
out.print(Fails);
}

%></span>
</div>
                            <hr />
                            <div class="col-lg-6">
                                <div class="row" style="margin-left:50px;">
                                    <h3><u>Tutor's preffered subjects</u></h3><br />
                                    <p>
                                    <%
try{
Object id = session.getAttribute("TId");
String TId=(String)id;
String sql1 ="SELECT * FROM tsubjects where TId='"+TId+"'";

resultSet = statement.executeQuery(sql1);
int count=0;
while(resultSet.next()){

	count++;
	out.print(count+" : ");
%>
                               
   <%=resultSet.getString("Subject") %><br>
          <%}

} catch (Exception e) {
e.printStackTrace();
}
%>
<br><br>
        <a href='#' class='btn btn-sm btn-success pull-center' align="center"  data-toggle='modal'  data-target='#addsub'>Add Subjects</a><br/><br/>
                        
                             
                                </div>
                                 
                            </div>
                            <div class="col-lg-6">
                                <div class="row" style="margin-left:50px;">
                                    <h3><u>Tutor's preffered areas</u></h3><br />
                                    <p>
                                                            <%
try{
Object id = session.getAttribute("TId");
String TId=(String)id;
String sql1 ="SELECT * FROM tareas where TId='"+TId+"'";

resultSet = statement.executeQuery(sql1);
int count=0;
while(resultSet.next()){

	count++;
	out.print(count+" : ");
%>
                               
   <%=resultSet.getString("Aname") %>,<%=resultSet.getString("City") %>-<%=resultSet.getString("Pincode") %><br>
          <%}

} catch (Exception e) {
e.printStackTrace();
}
%>           
<br><br>   
                              <a href='#' class='btn btn-sm btn-success pull-center' align="center"  data-toggle='modal'  data-target='#AddArea'>Add Subjects</a><br/><br/>
                        
     
                                </div>
                                
                                  </div>
                        </div>
						<br /><br />
            <div class="row" style="background-color: white; box-shadow: 2px 2px 2px 2px #0EAAA6;">
							<script>
	function highlightStar(id) {		
		var i = 0;
		for(i = 1; i <= 5; i++)
		{
			$('#star' + i).removeClass('selected');
		}
		for(i = 1; i <= id; i++)
		{
			$('#star' + i).addClass('selected');
		}
		$('#rating').val(id);
	}
</script>
<style>
body{width:610;}
.review-table {width: 100%;border-spacing: initial;margin: 20px 0px;word-break: break-word;table-layout: auto;line-height:1.8em;color:#333;}
.review-table th {background: #999;padding: 5px;text-align: left;color:#FFF;}
.review-table td {border-bottom: #f0f0f0 1px solid;background-color: #ffffff;padding: 5px;}
.review-table td div.feed_title{text-decoration: none;color:#00d4ff;font-weight:bold;}
.review-table ul{margin:0;padding:0;}
.review-table li{cursor:pointer;list-style-type: none;display: inline-block;color: #F0F0F0;text-shadow: 0 0 1px #666666;font-size:20px;}
.review-table .highlight, .review-table .selected {color:#F4B30A;text-shadow: 0 0 1px #F48F0A;}
</style>
<script src="../code.jquery.com/jquery-2.1.1.min.js" type="text/javascript"></script>



<div class="modal fade" id="tutorreview" role="dialog" aria-labelledby="reviewLabel" aria-hidden="true">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header text-center">
				<h4 class="modal-title" id="reviewLabel">Rate And Review </h4>
				<span id="spnReviewMessage" style="color:red;"></span>
			</div>
			<div class="modal-body">				
				<div class="form-group">					
					<table class="review-table">
						<tbody>
							<tr>
								<td>
									Your Name
									<div class="form-group">
										<input type="text" id="reviewername" name="reviewername" class="form-control" placeholder="your name" />
									</div>
								</td>
							</tr>
							<tr>
								<td>
									Your Mobile No(10 digit)
									<div class="form-group">
										<input type="text" id="reviewermobileno" name="reviewermobileno" onkeypress="return isInteger();" class="form-control" placeholder="your mobile no" />
									</div>
								</td>
							</tr>
							<tr>
								<td>
									Your Rating
									<ul>
										<li id="star1" class='selected' onclick="highlightStar(1);">&#9733;</li>  
										<li id="star2" class='' onclick="highlightStar(2);">&#9733;</li>  
										<li id="star3" class='' onclick="highlightStar(3);">&#9733;</li>  
										<li id="star4" class='' onclick="highlightStar(4);">&#9733;</li>  
										<li id="star5" class='' onclick="highlightStar(5);">&#9733;</li>  
									</ul>
									<input type="hidden" id="rating" name="rating" value="1" placeholder="rate your number" class="form-control" />
								</td>
							</tr>
							<tr>
								<td>
									Your Review
									<div class="form-group">
										<textarea id="review" name="review" placeholder="enter your review"  class="form-control"></textarea>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>				
				<div class="form-group text-center">
					<button class="btn btn-block btn-green" style="width:100%;" id="validate" onclick="sendReview();">Submit</button>
				</div>
			</div>
		</div>
	</div>
</div>

						</div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            
            
             <div class="modal fade" id="AddArea" role="dialog" aria-labelledby="signupLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
              <form action="AddAreas" method="post">
                    <div class="modal-header text-center">
                        <h4 class="modal-title" id="signupLabel">Add Preffered area</h4>
                        <span id="spnMessage" style="color:red;"></span>
                    </div>
                    <div class="modal-body">
                        <div class="form-group text-center">
                          
                            <input type="hidden" id="tutorid" value="206" />
                            <h6 id="" >
                              </h6>
                        <div class="form-group">
                            <input type="text" id="Aname" name="Aname" placeholder="Area Name" class="form-control"  required/>
                        </div>
                         <div class="form-group">
                            <input type="text" id="City" name="City" placeholder="City Name" class="form-control" style="text-transform:capitalize;" required/>
                        </div>
                         <div class="form-group">
                            <input type="text" id="Pincode" name="Pincode" placeholder="Area Pincode" class="form-control" pattern="\d{6}" required/>
                        </div>
                        
                    

                        <div class="form-group text-center">
                            <button class="btn btn-block btn-green" name="Submit" value="Submit" >
                              Submit
                            </button>
                        </div>
                    </div>
                </div>
                </form>
            </div>
        </div>
			 </div>
      
        <div class="modal fade" id="addsub" role="dialog" aria-labelledby="signupLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
              <form action="AddSubjects" method="post">
                    <div class="modal-header text-center">
                        <h4 class="modal-title" id="signupLabel">Add Subjects</h4>
                        <span id="spnMessage" style="color:red;"></span>
                    </div>
                    <div class="modal-body">
                        <div class="form-group text-center">
                          
                            <input type="hidden" id="tutorid" value="206" />
                            <h6 id="" >
                              </h6>
                        <div class="form-group">
                            <input type="text" id="Subject" name="Subject" placeholder="Enter Subject" class="form-control"  required/>
                        </div>
                        <div class="form-group">
                            <input type="text" id="Standards" name="Standards" placeholder="Class Ex. 5-10th,12th,Engineering"
                                class="form-control" required />
                        </div>

                        <div class="form-group text-center">
                            <button class="btn btn-block btn-green" name="Submit" value="Submit" >
                              Submit
                            </button>
                        </div>
                    </div>
                </div>
                </form>
            </div>
        </div>
			 </div>
			  <div class="modal fade" id="AddProfile" role="dialog" aria-labelledby="signupLabel" aria-hidden="true">
            <div class="modal-dialog modal-sm">
                <div class="modal-content">
              <form action="UploadProfile" method="post" enctype="multipart/form-data">
                    <div class="modal-header text-center">
                        <h4 class="modal-title" id="signupLabel">Add profile Picture</h4>
                        <span id="spnMessage" style="color:red;"></span>
                    </div>
                    <div class="modal-body">
                        <div class="form-group text-center">
                          
                            <input type="hidden" id="tutorid" value="206" />
                            <h6 id="" >
                              </h6>
                        <div class="form-group"> 
                            <input type="File" id="Subject" name="ProfileImg" placeholder="" class="form-control"  required/>
                        </div>
                    

                        <div class="form-group text-center">
                            <button class="btn btn-block btn-green" name="Submit" value="Submit" >
                              Submit
                            </button>
                        </div>
                    </div>
                </div>
                </form>
            </div>
        </div>
			 </div>
			
			
				

<style>
.gborder {

    margin-top:10px;
    padding-bottom:4% ;
    
   transition: transform .2s;
    
    margin: 0 auto;
}

.gborder:hover {
	z-index:1000;
    transform: scale(1.1); }
    
</style>
       

        
  
     <div  id="Footer"></div>
   	<% }else{
		String Error=" Please Login First";
		
		 request.setAttribute("Error",Error);
RequestDispatcher dispatcher = request.getRequestDispatcher("signin.jsp");
dispatcher.forward(request, response);
		
	}
	%>
   
   <script type='text/javascript' src='https://maps.googleapis.com/maps/api/js?libraries=geometry&amp;libraries=places&amp;ver=1.0'>
        </script>
        <script type='text/javascript' src='wp-content/plugins/short-tax-post/js/bootstrap-datepicker51525152.html?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/plugins/short-tax-post/js/testimonials51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/jquery.placeholder51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/bootstrap51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/jquery.touchSwipe.min51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/jquery-ui-touch-punch51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/jquery.slimscroll.min51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/markerclusterer51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/bootstrap-datepicker51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/spiderfier51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/infobox51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/fileinput.min51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/image-scale.min51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='assets/js/jquery.fancyboxd63fd63f.js?ver=2.1.5'>
        </script>
        <script type='text/javascript' src='assets/js/plans-ajax-upload51525152.js?ver=1.0'>
        </script>
        <script type='text/javascript' src='wp-includes/js/wp-embed.min2cb62cb6.html?ver=4.5.5'>
        </script>
        <script type='text/javascript' src='wp-includes/js/jquery/ui/core.mine899e899.html?ver=1.11.4'>
        </script>
        <script type='text/javascript' src='wp-includes/js/jquery/ui/widget.mine899e899.html?ver=1.11.4'>
        </script>
        <script type='text/javascript' src='wp-includes/js/jquery/ui/position.mine899e899.html?ver=1.11.4'>
        </script>
        <script type='text/javascript' src='wp-includes/js/jquery/ui/menu.mine899e899.html?ver=1.11.4'>
        </script>
        <script type='text/javascript' src='wp-includes/js/wp-a11y.min2cb62cb6.html?ver=4.5.5'>
        </script>
        <script type='text/javascript' src='wp-includes/js/jquery/ui/autocomplete.mine899e899.html?ver=1.11.4'>
        </script>
        <script type='text/javascript' src='wp-content/plugins/dsidxpress/js/autocomplete3f873f87.html?ver=2.1.32'>
        </script>	

</body>

</html>