package com.lexiaoyao.mybatisdemo.enums;

import java.util.Arrays;

public enum Gender implements BaseEnum<Gender, String> {
    Male("1", "男"),
    Female("0", "女"),
    Unknown("3", "保密");

    private String code;
    private String info;


    Gender(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public static Gender getGender(String code) {
        return Arrays.stream(Gender.values()).filter(i -> i.getCode().equals(code)).findAny().orElse(null);

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }


    public void setInfo(String info) {
        this.info = info;
    }
}
