<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TutorExpert-Find Tutor</title>
</head>
<body>


<div class="row" style="background-color:#454d59; color:white; opacity:0.9;">
				<div class="col-lg-12 row;" style="text-align:center;">
					<br />
					<form class="form-inline" id="searchForm" role="search" method="post" action="http://eazytutors.com/search.php">
					<li id="form1" style="list-style: none">
						<div class="form-group">
							<input type="text" class="form-control auto" style="min-width :300px; height: 50px; font-size: medium;" id="subject" name="subject" placeholder="Enter:Subject eg: Maths,Guitar" onblur="checkForBoard(this);" autocomplete="off">
                            <span id="txtAllowBoard" style="display:none;"></span>
						</div>
						<div class="form-group">
							<input type="text" class="form-control auto" style="min-width :300px; height: 50px; font-size: medium;" id="city" name="city" placeholder="your city pincode" autocomplete="off">
						</div>
						<div class="form-group">
							<button type="button" class="btn btn-lg btn-green" style="height: 50px; font-size: medium; width:120px;" id = "next1">
								<span class="glyphicon glyphicon-search"></span> Find Tutor
							</button>
                            
						</div>
					</li>
					<li id="form2" style="display:none;list-style: none;">
						<div class="form-group">
							<button type="button" class="btn btn-lg btn-green" style="height: 50px; font-size: medium; width:120px;" id = "previous1">
								Previous
							</button>&nbsp;&nbsp;
						</div>
						<div class="form-group text-left" style="margin-left:30px;">
							<b>WHICH LOCATION WOULD YOU PREFER FOR TUITION?</b><br /><br />
							<div class="form-group">
								<input type="checkbox" style="width:30px; height:30px;" name="location[]" value="home" />&nbsp;&nbsp;MY HOME
							</div>
							<div class="form-group">
								<input type="checkbox" style="width: 30px; height: 30px;" name="location[]" value="travel" />&nbsp;&nbsp;WILLING TO TRAVEL
							</div>
							<div class="form-group">
								<input type="checkbox" style="width: 30px; height: 30px;" name="location[]" value="online" />&nbsp;&nbsp;ATTEND ONLINE
							</div>
						</div>
						<div class="form-group">&nbsp;&nbsp;
							<button type="button" class="btn btn-lg btn-green" style="height: 50px; font-size: medium; width:120px;" id = "next2">
								Next
							</button>
						</div>
					</li>
					<li id="form3" style="display:none;list-style: none;" >
						<div class="form-group">
							<button type="button" class="btn btn-lg btn-green" style="height: 50px; font-size: medium;width:120px;" id = "previous2">
								Previous
							</button>
							&nbsp;&nbsp;
						</div>
						<div class="form-group">
							<b>WHICH BOARD OF EDUCATION ARE YOU LOOKING FOR? </b><br /><br />
							<input type="checkbox" style="width:30px; height:30px;" name="board[]" value="CBSE" />&nbsp;&nbsp;&nbsp;&nbsp;CBSE&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="checkbox" style="width: 30px; height: 30px;" name="board[]" value="ICSE" />&nbsp;&nbsp;ICSE&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="checkbox" style="width: 30px; height: 30px;" name="board[]" value="STATE">&nbsp;&nbsp;STATE&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="checkbox" style="width: 30px; height: 30px;" name="board[]" value="IB" />&nbsp;&nbsp;IB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="checkbox" style="width: 30px; height: 30px;" name="board[]" value="IGCSE" />&nbsp;&nbsp;IGCSE&nbsp;&nbsp;
						</div>
						<div class="form-group">
							&nbsp;&nbsp;	
							<button type="button" class="btn btn-lg btn-green" style="height: 50px; font-size: medium;width:120px;" id = "next3">
								Next
							</button>
						</div>
					</li>
					<li id="form4" style="display:none;list-style: none;" >
						<div class="form-group">
							<button type="button" class="btn btn-lg btn-green" style="height: 50px; font-size: medium;" id = "previous3">
								Previous
							</button>
							&nbsp;&nbsp;
						</div>
						<div class="form-group">
							<input type="text" class="form-control auto" style="min-width: 300px; height: 50px; font-size: medium;" id="name" name="name" placeholder="Enter Your Name " autocomplete="off">
						</div>
						<div class="form-group">
							<input type="number" class="form-control" style="min-width: 300px; height: 50px; font-size: medium;" id="mobile" name="mobile" placeholder="Enter your 10 digit Mobile number" autocomplete="off">
						</div>
						<div class="form-group">
							<input type="text" class="form-control auto" style="min-width: 300px; height: 50px; font-size: medium;" id="remark" name="remark" placeholder="Any other info you want to mention" autocomplete="off">
						</div>
						<div class="form-group">
							&nbsp;&nbsp;
							<button type="submit" class="btn btn-lg btn-green" style="height: 50px; font-size: medium;" id = "next4">
								<span class="glyphicon glyphicon-search"></span> Submit
							</button>
						</div>
					</li>
					</form>
					<br /><br />
				</div>
			</div>


</body>
</html>