package edu.usmp.dis.sit.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.systemlab.base.controller.rest.BaseRest;
import com.systemlab.base.wrap.BaseWrap;

import edu.usmp.dis.sit.dto.UserDto;
import edu.usmp.dis.sit.entity.User;
import edu.usmp.dis.sit.wrap.UserWrap;

@Controller
@RequestMapping(value="/user")
public class UserRest extends BaseRest<UserDto, User> {
	
	@Autowired UserWrap userWrap;
	
	protected BaseWrap<UserDto, User> getBaseWrap() {
		return userWrap;
	}
	

}
