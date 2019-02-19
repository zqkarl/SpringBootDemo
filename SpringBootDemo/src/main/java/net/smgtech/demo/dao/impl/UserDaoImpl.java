package net.smgtech.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.sf.jsqlparser.statement.select.Select;
import net.smgtech.demo.dao.SysUserMapper;
import net.smgtech.demo.entity.SysUser;
import net.smgtech.demo.entity.SysUserExample;

@Repository
public class UserDaoImpl {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	public List<SysUser> selectAll() {
		SysUserExample example = new SysUserExample();
		return sysUserMapper.selectByExample(example);
	}
}
