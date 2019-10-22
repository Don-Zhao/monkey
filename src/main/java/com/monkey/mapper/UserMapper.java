package com.monkey.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.monkey.daoobj.UserDaoBase;

/**
 * #{}和${}都能给SQL中传值，
 * 推荐使用#{}，会预编译，然后绑定值
 * ${}使用有sql注入的漏洞
 */

@Mapper
public interface UserMapper {
	
	@Insert("INSERT INTO user(username, password, email) VALUES(#{username}, #{password}, #{email})")
	@Options(useGeneratedKeys=true, keyColumn="id", keyProperty="id")
	public int insert(UserDaoBase user);
	
	@Select("select * from user")
	@Results({
		@Result(column="XXX", property="XXX")
	})
	public List<UserDaoBase> getAll();
	
	@Select("SELECT * FROM user WHERE id=#{id}")
	public UserDaoBase findUserById(int id);
	
	@Update("UPDATE user SET username=#{username}, password=#{password}, email=#{email} WHERE id=#{id}")
	public int update(UserDaoBase user);
	
	@Delete("DELETE FROM user WHERE id = #{id}")
	public int delete(int id);
}
