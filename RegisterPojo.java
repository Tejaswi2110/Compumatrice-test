package edu.mindscripts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="Reg")
	
public class RegisterPojo {

		@Id
		@GeneratedValue
		@Column(name="uname")
		private String uname;
		
		@Column(name="pwd")
		private String pwd;
		
		@Column(name="cpwd")
		private String cpwd;
		
		@Column(name="fname")
		private String fname;
		
		@Column(name="lname")
		private String lname;
		
		@Column(name="email")
		private String email;
		
		@Column(name="phno")
		private int phno;
		
		@Column(name="loc")
		private String loc;

		public RegisterPojo() {
			super();
		}

		public RegisterPojo(String uname, String pwd, String cpwd,
				String fname, String lname, String email, int phno, String loc) {
			super();
			this.uname = uname;
			this.pwd = pwd;
			this.cpwd = cpwd;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.phno = phno;
			this.loc = loc;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		public String getCpwd() {
			return cpwd;
		}

		public void setCpwd(String cpwd) {
			this.cpwd = cpwd;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getPhno() {
			return phno;
		}

		public void setPhno(int phno) {
			this.phno = phno;
		}

		public String getLoc() {
			return loc;
		}

		public void setLoc(String loc) {
			this.loc = loc;
		}
		
		
		
		
}
