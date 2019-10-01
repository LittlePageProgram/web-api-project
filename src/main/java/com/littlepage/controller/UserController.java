package com.littlepage.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.littlepage.entity.User;
import com.littlepage.service.UserService;

import io.swagger.annotations.ApiOperation;
/**
 * User的接口类
 * @author 74302
 *
 */
@RestController
@RequestMapping("user")
@ApiOperation(value="用户操作类")
public class UserController {
	/**
	 * User 服务实体
	 */
	@Autowired
	UserService userService;

	/**
	 * 	通过管理员账户密码查询所有数据，默认管理员账户root，密码root
	 * @param name
	 * @param password
	 * @return
	 */
	@ApiOperation(value="获取全部用户",httpMethod = "GET")
	@GetMapping("/getAllUser{name,password}")
	public List<User> getAllUser(String name,String password){
		if(name.equals("root")&&password.equals("root")) {
			return userService.getAllUser();
		}else {
			return null;
		}
	}
	
	/**
	 * 	过id进行查询
	 * @param id
	 * @return
	 */
	@ApiOperation(value="获取单个用户",httpMethod = "POST")
	@PostMapping("/getUser{id}")
	public User getUser(int id) {
		return userService.getUser(id);
	}
	
	/**
	 * 	增加一个User
	 * @param name
	 * @param password
	 * @param datetime
	 * @return
	 */
	@ApiOperation(value="增加单个用户",httpMethod = "POST")
	@PostMapping("/addUser{name,password,datetime}")
	public boolean addUser(String name,String password,Date datetime) {
		User user=new User(0, name, password, datetime, 1);
		return userService.addUser(user);
	}
	
	/**
	 * 	更新一个User
	 * @param name
	 * @param password
	 * @param datetime
	 * @return
	 */
	@ApiOperation(value="更新用户",httpMethod = "POST")
	@PostMapping("/updateUser{name,password,datetime}")
	public boolean updateUser(String name,String password,Date datetime) {
		User user=new User(0, name, password, datetime, 1);
		return userService.updateUser(user);
	}
	
	/**
	 * 	删除一个User
	 * @param name
	 * @param password
	 * @return
	 */
	@ApiOperation(value="删除单个用户",httpMethod = "POST")
	@PostMapping("/deleteUser{name,password}")
	public boolean deleteUser(String name,String password) {
		return userService.deleteByName(name,password);
	}
}
