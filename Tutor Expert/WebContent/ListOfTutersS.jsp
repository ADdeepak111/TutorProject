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
       
 

<%

String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/tutorexpert";

String userId = "root";
String password = "";

String Id= null;
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
     
     
     </div>
     
        <div class="home-caption" >
        
        <h1 class="home-title" style="font-family:cursive,Impact, Charcoal, sans-serif ;font-size:55px; color:#FF6600; ">Welcome</h1>
        
        <h3 style="font-size:40px;font-family:Arial Black, Gadget, sans-serif; color: #FF9933"></h3>
            <h1 class="home-title" style="font-size:23px; margin-top: 80px;">Check here for Common Registration</h1>
            <a href="Registre.jsp" > <button		 style="padding:8px; font-size:15px; color:#fff;  background-color:#6666FF ;border-radius:8px; ">Common Registration</button></a>  <br>  <br>
         	<br />
			
        </div>
        
    <div class="spotlight" style="   background-color: #6666FF;
    padding: 30px;
    text-align: center;">
        <div class="s-title osLight">Discover Tutors, Trainers and Training Institutes near you with TutorExpert</div>
        <div class="s-text osLight">Find Tutors in Pune, Mumbai, Chennai, Delhi and Kolkata. With a database of 1000+ tutors which is 
        growing day by day, you can get your desired tutors here.<br><br>
        <label >Search City :</label>
<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search By City names.." style="width:280px; " title="Type in a City">
        </div>
    </div>	
        
     <div id="" class="page-wrapper" style="height:1000px; overflow-x: scroll;  ">
        <div class="page-content">
 
    
				
				
           		<%
try{ 
    Blob image = null;
    byte[] imgData = null;
    FileOutputStream fos; 
  
 
connection = DriverManager.getConnection(connectionUrl, userId, password);
statement=connection.createStatement();

String sql ="SELECT * FROM teacherregistration";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
Id =resultSet.getString("TId");

	System.out.println("In Teacherpro == "+Id);
 

  %>                     
<div class="post-2 page type-page status-publish hentry">
   <div class="row" style="background-color: white; box-shadow: 2px 2px 2px 2px #0EAAA6;">
                         
     
                                               
                                   <div class="col-lg-4 col-sm-12">
                                <div class="row" style="margin-left:50px;">
                      
                                </div>
                                
                                  </div>
                            <div class="col-lg-8 col-sm-12">
                                <div class="row" style="color:#000; padding:2%;">
                                  <h2 style="font-size: 25px; font-style: italic,Impact ;">   <%=resultSet.getString("Name") %></h2>
                                    <b><i class="fa fa-tachometer"></i>&nbsp;Teaching Experience :</b>
                                       	
                                                              <%=resultSet.getString("Experiance") %> ( Years )      
  <br><br>
                                      <b><i class="fa fa-tachometer"></i>&nbsp;Tutor's preffered subjects :</b>
                                
                                    <%
try{

System.out.println(" here=1=="+Id);
Statement sta = null;
ResultSet resu = null;
sta=connection.createStatement();

String sql1 ="SELECT * FROM tsubjects where TId='"+Id+"'";

resu =sta.executeQuery(sql1);
 System.out.println(" here=1=="+Id);
int count=0;
while(resu.next()){
	System.out.println(" here=2");
	count++;
	
	if (count<3){
		
	
%>
                               
   <%=resu.getString("Subject") %> , 
          <%}
	else{
		out.print(" and more..");
		break;}
}

} catch (Exception e) {
e.printStackTrace();
}
%>

	<br><br>
    <b><i class="fa fa-tachometer"></i>&nbsp;Tutor's preffered areas:</b> <%
try{

	System.out.println("hhhhh here=1");
Statement state = null;
ResultSet resp = null;
state=connection.createStatement();
String sql2 ="SELECT * FROM tareas where TId='"+Id+"'";

resp = state.executeQuery(sql2);
int count=0;
while(resp.next()){
	System.out.println("hhhh here=2");
	count++;
if (count<3){
		
		
%>
                               
   <%=resp.getString("Aname") %>,<%=resp.getString("City") %> ,
          <%
          
}
else{
	out.print(" and more..");
	break;}
}

} catch (Exception e) {
e.printStackTrace();
}
%>  <br><br>
<a class='btn btn-sm btn-info' href="Tutor Profile.jsp?Id=<%=Id%>"> View Profile </a> 
<a class='btn btn-sm btn-success'  href='#'> Contact Tutor </a>        
       <br> <br>      
                             
                                </div>
                                 
                            </div>

                        </div>
			</div>
			<br>
			
			<%}

} catch (Exception e) {
e.printStackTrace();
} %>
                    </div>	
                    
</div>

						
                    </div>	
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