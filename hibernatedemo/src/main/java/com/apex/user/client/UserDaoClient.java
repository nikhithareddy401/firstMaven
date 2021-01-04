package com.apex.user.client;

import com.apex.user.dao.UserDao;
import com.apex.user.entity.User;

public class UserDaoClient {
public static void main(String[] args) {
	UserDao userDao=new UserDao();
	User user =new User();
	
	user.setFirstName("nikhibernate");
	user.setLastName("hibernatenow");
	user.setMiddleName("learning");
	userDao.createUser(user);
	System.out.println(userDao.getUser(1).getFirstName());
	
}
}
