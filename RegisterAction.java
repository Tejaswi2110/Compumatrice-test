package edu.mindscripts;

import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements ModelDriven<RegisterPojo> 
{
	RegisterPojo rp=new RegisterPojo();
	RegisterDAO rd=new RegisterDAO();
	
	public RegisterPojo getRp() {
		return rp;
	}


	public void setRp(RegisterPojo rp) {
		this.rp = rp;
	}


	@Override
	public RegisterPojo getModel() {
		// TODO Auto-generated method stub
		return rp;
	}
	
	public String execute()
	{
		String s=rd.save(rp);
		return s;
	}
}

