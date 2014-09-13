package edu.usmp.dis.sit.service.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemlab.base.dao.hibernate.BaseDao;
import com.systemlab.base.service.business.impl.BaseServiceImpl;

import edu.usmp.dis.sit.dao.hibernate.UserDao;
import edu.usmp.dis.sit.dto.UserDto;
import edu.usmp.dis.sit.entity.User;
import edu.usmp.dis.sit.service.business.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserDto, User> implements UserService{
	
	@Autowired UserDao userDao;
	
	protected BaseDao<User> getBaseDao() {
		return userDao;
	}

}
