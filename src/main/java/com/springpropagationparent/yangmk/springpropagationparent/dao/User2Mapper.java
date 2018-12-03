package com.springpropagationparent.yangmk.springpropagationparent.dao;

import com.springpropagationparent.yangmk.springpropagationparent.pojo.User2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User2Mapper {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
}
