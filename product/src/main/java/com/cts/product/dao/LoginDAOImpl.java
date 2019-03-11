package com.cts.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cts.product.bean.Login;
@Repository
public class LoginDAOImpl implements LoginDAO{
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	public String getUserStatus(String Id) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public String getUserType(String Id) {
		// TODO Auto-generated method stubx
		return null;
	}
	
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		Session session=null;
		String query="from LoginTable where userName=? and password=?";
		org.hibernate.query.Query<Login> query2=null;
		try{
			session =sessionFactory.getCurrentSession(); 
			query2=session.createQuery(query);
			query2.setParameter(0, userName);
			query2.setParameter(1, password);
			Login login =new Login();
			login=query2.getSingleResult();
			return login;

		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close();
				
			}
		}
		
		return null;
	}

}
