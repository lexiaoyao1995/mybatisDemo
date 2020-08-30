package com.lexiaoyao.mybatisdemo.utils;

import com.lexiaoyao.mybatisdemo.enums.BaseEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


public class NormalEnumHandler<E extends BaseEnum> extends BaseTypeHandler<E> {

    private Class<E> enumType;
    private E[] enums;

    public NormalEnumHandler(Class<E> type) {
        if (type == null)
            throw new IllegalArgumentException("Type argument cannot be null");
        this.enumType = type;
        this.enums = type.getEnumConstants();//获取所有枚举数组
        if (this.enums == null)
            throw new IllegalArgumentException(type.getSimpleName()
                    + " does not represent an enum type.");
    }

    public NormalEnumHandler() {
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, E e, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            preparedStatement.setString(i, (String) e.getCode());
        } else {
            preparedStatement.setObject(i, e.getCode(), jdbcType.TYPE_CODE);
        }

    }

    @Override
    public E getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return resultSet.wasNull() ? null : locateEnumStatus(resultSet.getString(s));
    }

    @Override
    public E getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.wasNull() ? null : locateEnumStatus(resultSet.getString(i));
    }

    @Override
    public E getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.wasNull() ? null : locateEnumStatus(callableStatement.getString(i));
    }

    private E locateEnumStatus(String value) {
        return Arrays.stream(enums)
                .filter(i -> i.getCode().equals(value))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("未知的枚举类型：" + value + ",请核对" + enumType.getSimpleName()));
    }

}
