package edu.usmp.dis.sit.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.systemlab.base.controller.rest.BaseRest;
import com.systemlab.base.wrap.BaseWrap;

import edu.usmp.dis.sit.dto.CardDto;
import edu.usmp.dis.sit.dto.UserDto;
import edu.usmp.dis.sit.entity.Card;
import edu.usmp.dis.sit.entity.User;
import edu.usmp.dis.sit.wrap.CardWrap;
import edu.usmp.dis.sit.wrap.UserWrap;

@Controller
@RequestMapping(value="/card")
public class CardRest extends BaseRest<CardDto, Card> {
	
	@Autowired CardWrap cardWrap;
	
	protected BaseWrap<CardDto, Card> getBaseWrap() {
		return cardWrap;
	}
	

}
