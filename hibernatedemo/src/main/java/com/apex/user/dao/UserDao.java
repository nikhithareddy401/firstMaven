package com.apex.user.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.apex.user.entity.User;
import com.apex.user.util.HibernateUtil;

public class UserDao {
	public void createUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}
	public User getUser(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		User user= (User)session.load( User.class,new Integer(id));
	
		return user;
		
	}
	public void updateUser(User user) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.update(user);
		tx.commit();
	}
	public void deleteUser(int id) {
		User user=getUser(id);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(user);
		tx.commit();
	}
}
