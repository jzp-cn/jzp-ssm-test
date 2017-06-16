package com.jzp.manager.mapper;


import com.jzp.manager.pojo.ActiveCodeEntity;

public interface ActiveCodeMapper {
	
	public ActiveCodeEntity selectCodeById(Integer id);
	
	public void updateActiveCodePhone(String phone);
	
}
