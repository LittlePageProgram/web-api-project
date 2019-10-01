package com.littlepage.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 	用户类属性
 * @author 74302
 *
 */
@ApiModel(value = "User",description = "关于用户的描述")
public class User {
	@ApiModelProperty(example = "用户id")
	private int id;
	@ApiModelProperty(example = "用户姓名")
	private String name;
	@ApiModelProperty(example = "用户密码")
	private String password;
	@ApiModelProperty(example = "创建时间")
	private Date datetime;
	@ApiModelProperty(example = "用户状态（0位删除状态，1为可使用账户）")
	private int status;
	public User() {
		super();
	}
	public User(int id, String name, String password, Date datetime, int status) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.datetime = datetime;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", datetime=" + datetime + ", status="
				+ status + "]";
	}
}
