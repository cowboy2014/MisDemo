/**
 * 
 */
package com.boss.demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.boss.demo.entity.User;


@Repository
public interface UserDao {
	public void addUser(User user);
	public List<User> loadAllUser(Map<String, Object> map);
	public void deleteByUserID(Integer userID);
	public User loadByUserID(Integer userID);
	public void updateUser(User user);
	public List<Map<String, Object>> loadByName_No(Map<String, Object> map);
	public User loadByAccountNo(String accountNo);
	public String loadPwdByAccountNo(String accountNo);
	public Integer loadUserCount(User user);
}
