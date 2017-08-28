package com.zt.dao;


import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.zt.entity.Login;
import com.zt.handler.LoginObjectHandler;
import com.zt.util.JDBCUtil;

public class LoginDAO {
	
	QueryRunner qr = new QueryRunner();
	//登陆
	public Login userLogin(Login user) throws SQLException{
		
		String sql = "select log_id,log_name,log_pwd,log_state from tbl_login where log_name =? and log_pwd=? and log_state=1 ";
		return qr.query(JDBCUtil.getConnection(), sql, new LoginObjectHandler(),user.getLogName(),user.getLogPwd());
	}
}
