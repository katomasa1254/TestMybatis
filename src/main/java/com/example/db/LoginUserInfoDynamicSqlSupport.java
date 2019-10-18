package com.example.db;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LoginUserInfoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final LoginUserInfo loginUserInfo = new LoginUserInfo();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userId = loginUserInfo.userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pw = loginUserInfo.pw;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class LoginUserInfo extends SqlTable {
        public final SqlColumn<String> userId = column("user_id", JDBCType.VARCHAR);

        public final SqlColumn<String> pw = column("pw", JDBCType.VARCHAR);

        public LoginUserInfo() {
            super("login_user_info");
        }
    }
}