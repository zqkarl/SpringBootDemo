package net.smgtech.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.smgtech.demo.dao.impl.UserDaoImpl;
import net.smgtech.demo.entity.SysUser;

@Service
public class UserService {

	@Autowired
	private UserDaoImpl userDaoImpl;
	
	public List<SysUser> selectAll() {
		return userDaoImpl.selectAll();
	}
}
