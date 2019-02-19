package net.smgtech.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import net.smgtech.demo.entity.SysUser;
import net.smgtech.demo.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="hello")
	public String hello() {
		return "哇哈哈哈";
	}
	
	@RequestMapping(value="getUser")
	public Object getUser(@RequestParam(value="page", defaultValue="1") Integer page,
			@RequestParam(value="size", defaultValue="10") Integer size) {
		PageHelper.startPage(page, size);
		List<SysUser> sysUsers = userService.selectAll();
		PageInfo<SysUser> pageInfo = new PageInfo<>(sysUsers);
		return pageInfo;
	}

}
