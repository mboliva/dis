package edu.usmp.dis.sit.wrap.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.systemlab.base.service.business.BaseService;
import com.systemlab.base.wrap.impl.BaseWrapImpl;

import edu.usmp.dis.sit.dto.CardDto;
import edu.usmp.dis.sit.dto.UserDto;
import edu.usmp.dis.sit.entity.Card;
import edu.usmp.dis.sit.entity.User;
import edu.usmp.dis.sit.service.business.CardService;
import edu.usmp.dis.sit.service.business.UserService;
import edu.usmp.dis.sit.wrap.CardWrap;
import edu.usmp.dis.sit.wrap.UserWrap;

@Component
public class CardWrapImpl extends BaseWrapImpl<CardDto, Card> implements CardWrap {

	@Autowired CardService cardService;
	
	protected BaseService<CardDto, Card> getSuperService() {
		return cardService;
	}


}