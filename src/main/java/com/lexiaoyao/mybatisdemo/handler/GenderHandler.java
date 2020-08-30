//package com.lexiaoyao.mybatisdemo.handler;
//
//import com.lexiaoyao.mybatisdemo.enums.Gender;
//import org.apache.ibatis.type.BaseTypeHandler;
//import org.apache.ibatis.type.JdbcType;
//
//import java.sql.CallableStatement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class GenderHandler extends BaseTypeHandler<Gender> {
//
//    @Override
//    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Gender gender, JdbcType jdbcType) throws SQLException {
//        preparedStatement.setString(i, gender.getCode());
//    }
//
//    @Override
//    public Gender getNullableResult(ResultSet resultSet, String s) throws SQLException {
//        return Gender.getGender(resultSet.getString(s));
//    }
//
//    @Override
//    public Gender getNullableResult(ResultSet resultSet, int i) throws SQLException {
//        return Gender.getGender(resultSet.getString(i));
//    }
//
//    @Override
//    public Gender getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
//        return Gender.getGender(callableStatement.getString(i));
//    }
//
//}
