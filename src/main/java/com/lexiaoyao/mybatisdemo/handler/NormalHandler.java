package com.lexiaoyao.mybatisdemo.handler;

import com.lexiaoyao.mybatisdemo.enums.BaseEnum;
import com.lexiaoyao.mybatisdemo.enums.Gender;
import com.lexiaoyao.mybatisdemo.utils.NormalEnumHandler;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(value = {Gender.class})
public class NormalHandler<E extends BaseEnum> extends NormalEnumHandler<E> {
    public NormalHandler(Class<E> type) {
        super(type);
    }
}
