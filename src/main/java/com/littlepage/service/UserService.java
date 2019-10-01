package com.littlepage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.littlepage.entity.User;
import com.littlepage.mapper.UserMapper;
/**
 * User类Service层
 * @author 74302
 *
 */
@Service
public class UserService {
	
	/**
	 * 	数据操控实例
	 */
	@Autowired
	UserMapper userMapper;
	
	/**
	 * 	获取全部User
	 * @return
	 */
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}
	
	/**
	 * 	通过id获取单个User
	 * @param id
	 * @return
	 */
	public User getUser(int id) {
		return userMapper.getUserById(id);
	}
	
	/**
	 * 	通过名字获取User
	 * @param name
	 * @return
	 */
	public User getUser(String name) {
		return userMapper.getUserByName(name);
	}
	/**
	 * 添加User
	 * @param user
	 * @return
	 */
	public boolean addUser(User user) {
		user.setStatus(1);
		userMapper.addUser(user);
		return true;
	}
	
	/**
	 * 	更新user，除了status和id属性
	 * @param user
	 * @return 用户名和密码正确，返回true 否则返回false
	 */
	public boolean updateUser(User user) {
		User search=getUser(user.getName());
		if(search.getName().equals(user.getName())&&search.getPassword().equals(user.getPassword())) {
			userMapper.updateUser(user);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 通过名字删除
	 * @param name
	 * @param password
	 * @return
	 */
	public boolean deleteByName(String name, String password) {
		User search=getUser(name);
		if(search==null) return false;
		if(search.getPassword().equals(password)) {
			userMapper.deleteUserById(search.getId());
			return true;
		}else
			return false;
	}
}
