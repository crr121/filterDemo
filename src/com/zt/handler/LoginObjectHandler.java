package com.zt.handler;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;

import com.zt.entity.Login;

public class LoginObjectHandler implements ResultSetHandler<Login>{

	@Override
	public Login handle(ResultSet rs) throws SQLException {
		//只负责处理结果集
		Login user = null;
		while(rs.next()){
			user  =new Login(rs.getInt("log_id"), rs.getString("log_name"), rs.getString("log_pwd"), rs.getInt("log_state"));
		}
		return user;
	}
}
