package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.LoginUserInfo;
import com.example.db.LoginUserInfoDynamicSqlSupport;
import com.example.db.LoginUserInfoMapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LoginLogic {

	@Autowired
	private LoginUserInfoMapper login_user_info_mapper;
	
	public String loginMain(String id, String pw) {
		
		String ret = "";
		
		// 暗号化したpwとidでDB検索
		try {
			List<LoginUserInfo> loginUserInfoData = login_user_info_mapper.selectByExample()
					.where(LoginUserInfoDynamicSqlSupport.userId, isEqualTo(id)).build().execute();
		}catch (Exception e) {
			// TODO: handle exception
			log.info(e.toString());
		}
		
		
		return ret;
	}

}
