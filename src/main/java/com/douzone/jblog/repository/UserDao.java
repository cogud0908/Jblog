package com.douzone.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.douzone.jblog.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;
	
	public void join(UserVo userVo) {
		int no = sqlSession.insert("user.join",userVo);
		sqlSession.insert("blog.insert",no);
	}

	public UserVo login(String id, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);
		
		UserVo userVo = sqlSession.selectOne("user.getByIdAndPassword", map);
		
		return userVo;
	}

}
