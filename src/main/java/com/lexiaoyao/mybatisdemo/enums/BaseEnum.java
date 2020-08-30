package com.lexiaoyao.mybatisdemo.enums;

public interface BaseEnum<E extends Enum<?>, T> {

    T getCode();//code为存入数据库的值

    String getInfo();//info为实际意义

}
