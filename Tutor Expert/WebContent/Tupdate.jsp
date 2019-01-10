<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
	<style type="text/css">
	.container1{
    padding: 16px;
    background-color: white;
}

.registerbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px 20px;
   
    border: none;
   width:60%;
   
    opacity: 0.9;
}

.registerbtn:hover {
    opacity: 1;
}

input:focus:invalid {
  outline: none;
}

input:invalid {
  box-shadow: 0 0 5px 1px red;
}

/* Full-width input fields */
input[type=text], input[type=password],select,input[type=file],textarea {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
     border-radius: 5px;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}</style>
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
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();
Object usr = session.getAttribute("Teacher");
String Email=(String)usr;
String sql ="SELECT * FROM teacherregistration WHERE Email='"+Email+"'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
	
	String Id=resultSet.getString("TId");
	HttpSession ses= request.getSession();
	ses.setAttribute("TId", Id);
	System.out.println("In Teacherpro == "+Id);

  %>  
        </div>
        <div class="home-caption" >
        
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
</div>   </div>
     <div id="" class="page-wrapper">
        <div class="page-content">
 	
					<div class="row well" style="background-color: 	#b3b3ff ">
   
   
  
 
  <div class="row">
  
<div class="column col-md-3 col-sm-0"></div>
<div class="column col-md-6 col-sm-12" style=" background-color:#d9d9f2;border:5px solid #003399; border-radius: 10px;">
  <div style="color: red; text-align: center;margin-top: 10px; font-size:22px;  margin-bottom: 10px; ">
<%Object error=request.getAttribute("Exist");
String Error=(String)error;
if(Error!=null){
out.print(Error);
}
%>
</div>
    <h3 style=" text-align: center; padding-top: 45px;  color:#001a1a; font-size:25px; ">Profile Update</h3>
<form action="TutorUpdate" method="post"  name="form1"  >
 
 

 
    <label for="Address"><b>Address</b></label>
    <input type="text" placeholder="Enter ur Address" name="Location" required>
	
	<label for="ADNO"><b>Adhar Number</b></label>
    <input type="text" placeholder="Enter Adhar No" name="AdharNo" required pattern="\d{12}">
 
 
    <label for="Gender."><b>Gender</b></label>
    <select name="Gender" required>
       <option   value="">select</option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    
    </select>

   <label for="quli"><b>Qualification</b></label>
  <select name="Qualification" required>
      <option   value="">select</option>
    <option value="B.E./B Tech">B.E./B Tech</option>
     <option value="M.E./M Tech">M.E./M. Tech</option>
    <option value="BCA">BCA / MCA</option>
     <option value="MCA">PHD </option>
    <option value="B.Com">B.Com / M.Com</option>
     <option value="M.Com">B.Ed</option>
     <option value="Secondary/10th">Secondary/10th</option>
    <option value="Higher secondary/12th">Higher Secondary/12th</option>
    
     <option value="ITI">ITI</option>
  </select>
  <br> 
    <label for="exp"><b>Experience ( in years )< 	/b></label>
   <select name="Experience" required>
      <option   value="">select</option>
    <option value="1">1</option>
     <option value="1-2">1-2</option>
    <option value="2-5">2-5</option>
     <option value="5-10">5-10 </option>
    <option value="10+">10+</option>
  
  </select>
 <label for="ADNO"><b>Educational Boards</b></label>
    <input type="text" placeholder="Ex. CBSE, State,ICSE, IB, etc" name="Board" required>
 
    
    
    <label for="Au"><b>About You</b></label>
  
 <textarea id="description1" name="skills" class="textarea" maxlength="200" placeholder="Tell About yourself ,Education , Experiances, etc." required>
    
       
    </textarea>
    <br>
      <input type="submit" class="registerbtn" name="submit" id="Submit" style="margin-left:20%;margin-right:20%; border-radius: 10px;">
  <br><br>
	  </form>	</div><div class="column col-md-3 col-sm-0"></div> </div>
    <div class="col-lg-12" style="border-bottom:1px solid black;">
    
    
   <br>
                      
						
							
							</div>                            
                          
                        
                        </div>
                        <br /><br />
                        
                        
                        </div></div>
                         <% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>	
				

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
     

        <script type="text/javascript">

function check() {
    if(document.getElementById('psw').value ===
            document.getElementById('cpsw').value) {
    	 document.getElementById('message').style.color = 'green';
        document.getElementById('message').innerHTML = "Password Match";
    } else {
    	 document.getElementById('message').style.color = '#780000';
        document.getElementById('message').innerHTML = "Password Not Match";
    }
}
  
</script>
  
     <div  id="Footer"></div>
   	<% }else{
		String Error=" Please Login First";
		
		 request.setAttribute("Error",Error);
RequestDispatcher dispatcher = request.getRequestDispatcher("Signin.jsp");
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