package Bean;

import java.io.InputStream;

import javax.servlet.http.Part;

public class TeacherBean {

	
	
	
	String TId,Sub,std, Name,Email,MNO,Location,psw,cpsw, RegisterAs,Qualification,Address,Gender, Experience,Board,AdharNo,About;
	String Anmae,City,pin;
	
		String Cdate,NoJob,Skill,Jdescription,Company,Salery,Jlocation,Jprofile,Msalary,Lsalary;
		

		Part ProImg,Adhar,Certi;
		InputStream Img;
		
		
		
		
		
		public String getAnmae() {
			return Anmae ;
		}
		public void setAnmae(String Anmae) {
			this.Anmae = Anmae;
			
		}	
		public String getCity() {
			return City ;
		}
		public void setCity(String City) {
			this.City = City;
			
		}	
		public String getpin() {
			return pin ;
		}
		public void setpin(String pin) {
			this.pin = pin;
			
		}
		
		
		public InputStream getImg() {
			return Img ;
		}
		public void setImg(InputStream Img) {
			this.Img = Img;
			
		}
		
		
		
		
		
		
		
		public Part getProImg() {
			return ProImg ;
		}
		public void setProImg(Part ProImg) {
			this.ProImg = ProImg;
			
		}
		
		public Part getAdhar() {
			return Adhar ;
		}
		public void setAdhar(Part Adhar) {
			this.Adhar = Adhar;
			
		}
		public Part getCerti() {
			return Certi ;
		}
		public void setCerti(Part Certi) {
			this.Certi = Certi;
			
		}
		
		public String getAddress() {
			return Address ;
		}
		public void setAddress(String Address) {
			this.Address = Address;
			
		}
		public String getQualification() {
			return Qualification ;
		}
		public void setQualification(String Qualification) {
			this.Qualification = Qualification;
			
		}
		
		
		public String getTId() {
			return TId ;
		}
		public void setTId(String TId) {
			this.TId = TId;
			
		}
			public String getSub() {
				return Sub ;
			}
			public void setSub(String Sub) {
				this.Sub = Sub;
			}
				public String getstd() {
					return std ;
				}
				public void setstd(String std) {
					this.std = std;
				}
					public String getLsalary() {
						return Lsalary ;
					}
					public void setLsalary(String Lsalary) {
						this.Lsalary = Lsalary;
					}
		
	
		public String getCdate() {
			return Cdate ;
		}
		public void setCdate(String Cdate) {
			this.Cdate = Cdate;
		}
		
		
		public String getAdharNo() {
			return AdharNo ;
		}
		public void setAdharNo(String AdharNo) {
			this.AdharNo =AdharNo;
		}
		public String getAbout() {
			return About ;
		}
		public void setAbout(String About) {
			this.About = About;
		}
		public String getGender() {
			return Gender ;
		}
		public void setGender(String Gender) {
			this.Gender =Gender;
		}
		public String getExperience() {
			return Experience ;
		}
		public void setExperience(String Experience) {
			this.Experience = Experience;
		}
		public String getBoard() {
			return Board ;
		}
		public void setBoard(String Board) {
			this.Board = Board;
		}
		
		
		
		
		
		
		
		
		
		
		public String getName() {
			return Name ;
		}
		public void setName(String Name) {
			this.Name = Name;
		}
	
	
		public String getEmail() {
			return Email;
		}
		public void setEmail(String Email) {
			this.Email = Email;
		}
		public String getMNO() {
			return MNO;
		}
		public void setMNO(String MNO) {
			this.MNO = MNO;
		}
		public String getRegisterAs() {
			return RegisterAs ;
		}
		public void setRegisterAs(String RegisterAs) {
			this.RegisterAs =RegisterAs ;
		}
		
	
	
		
		public String getLocation() {
			return Location ;
		}
		public void setLocation(String  Location) {
			this.Location=Location ;
		}
		
	
		public String getpsw() {
			return psw ;
		}
		public void setpsw(String psw) {
			this.psw= psw;
		}public String getcpsw() {
			return cpsw;
		}
		public void setcpsw(String cpsw) {
			this.cpsw = cpsw;
		}
	
	
}
