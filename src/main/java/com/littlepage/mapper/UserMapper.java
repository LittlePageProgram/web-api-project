package com.littlepage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.littlepage.entity.User;
/**
 * 持久化操作类User
 * @author 74302
 *
 */
@Mapper
public interface UserMapper {
	/**
	 * 增加User
	 * @param user
	 * @return
	 */
	void addUser(User user);
	/**
	 * 通过id删除
	 * @param id
	 * @return
	 */
	void deleteUserById(int id);
	/**
	 * 更新，除了status和id，其他属性均可更新
	 * @param user
	 * @return
	 */
	void updateUser(User user);
	/**
	 * 获取单个User
	 * @param id
	 * @return
	 */
	User getUserById(int id);
	/**
	 * 	获取单个User
	 * @param id
	 * @return
	 */
	User getUserByName(String name);
	/**
	 * 获取全部User
	 * @return
	 */
	List<User> getAllUser();
}
