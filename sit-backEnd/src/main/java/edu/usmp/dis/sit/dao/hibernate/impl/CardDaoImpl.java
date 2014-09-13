package edu.usmp.dis.sit.dao.hibernate.impl;

import org.springframework.stereotype.Repository;

import com.systemlab.base.dao.hibernate.impl.BaseDaoImpl;

import edu.usmp.dis.sit.dao.hibernate.CardDao;
import edu.usmp.dis.sit.dao.hibernate.UserDao;
import edu.usmp.dis.sit.entity.Card;
import edu.usmp.dis.sit.entity.User;

@Repository
public class CardDaoImpl extends BaseDaoImpl<Card> implements CardDao{

}
