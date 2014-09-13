package edu.usmp.dis.sit.service.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemlab.base.dao.hibernate.BaseDao;
import com.systemlab.base.service.business.impl.BaseServiceImpl;

import edu.usmp.dis.sit.dao.hibernate.CardDao;
import edu.usmp.dis.sit.dao.hibernate.UserDao;
import edu.usmp.dis.sit.dto.CardDto;
import edu.usmp.dis.sit.dto.UserDto;
import edu.usmp.dis.sit.entity.Card;
import edu.usmp.dis.sit.entity.User;
import edu.usmp.dis.sit.service.business.CardService;
import edu.usmp.dis.sit.service.business.UserService;

@Service
public class CardServiceImpl extends BaseServiceImpl<CardDto, Card> implements CardService{
	
	@Autowired CardDao cardDao;
	
	protected BaseDao<Card> getBaseDao() {
		return cardDao;
	}

}
