package com.example.db;

import static com.example.db.LoginUserInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.example.db.LoginUserInfo;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface LoginUserInfoMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LoginUserInfo> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="user_id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="pw", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    LoginUserInfo selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="user_id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="pw", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<LoginUserInfo> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Function<SelectStatementProvider, List<LoginUserInfo>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ConstructorArgs({
        @Arg(column="user_id", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="pw", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<LoginUserInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(loginUserInfo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, loginUserInfo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(String userId_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, loginUserInfo)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(LoginUserInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(loginUserInfo)
                .map(userId).toProperty("userId")
                .map(pw).toProperty("pw")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(LoginUserInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(loginUserInfo)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(pw).toPropertyWhenPresent("pw", record::getPw)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<LoginUserInfo>>> selectByExample(RowBounds rowBounds) {
        return SelectDSL.selectWithMapper(selectManyWithRowbounds(rowBounds), userId, pw)
                .from(loginUserInfo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<LoginUserInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, userId, pw)
                .from(loginUserInfo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<LoginUserInfo>>> selectDistinctByExample(RowBounds rowBounds) {
        return SelectDSL.selectDistinctWithMapper(selectManyWithRowbounds(rowBounds), userId, pw)
                .from(loginUserInfo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<LoginUserInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, userId, pw)
                .from(loginUserInfo);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default LoginUserInfo selectByPrimaryKey(String userId_) {
        return SelectDSL.selectWithMapper(this::selectOne, userId, pw)
                .from(loginUserInfo)
                .where(userId, isEqualTo(userId_))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(LoginUserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, loginUserInfo)
                .set(userId).equalTo(record::getUserId)
                .set(pw).equalTo(record::getPw);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(LoginUserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, loginUserInfo)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(pw).equalToWhenPresent(record::getPw);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(LoginUserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, loginUserInfo)
                .set(pw).equalTo(record::getPw)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(LoginUserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, loginUserInfo)
                .set(pw).equalToWhenPresent(record::getPw)
                .where(userId, isEqualTo(record::getUserId))
                .build()
                .execute();
    }
}