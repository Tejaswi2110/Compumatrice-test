package edu.mindscripts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;

public class RegisterDAO {
	
	@SessionTarget
	Session session;
	
	@TransactionTarget
	Transaction transaction;
	
	public String save(RegisterPojo r)
	{
		session.save(r);
		transaction.commit();
		session.close();
		return "success";
	}

}
