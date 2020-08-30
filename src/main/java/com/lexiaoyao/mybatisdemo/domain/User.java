package com.lexiaoyao.mybatisdemo.domain;

import com.lexiaoyao.mybatisdemo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private Gender gender;
}
