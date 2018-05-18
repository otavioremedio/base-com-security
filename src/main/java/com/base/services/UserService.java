package com.base.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.base.security.UserSS;

//implementação para retornar usuario logado
public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}
