package com.springpropagationparent.yangmk.springpropagationparent.dao;

import com.springpropagationparent.yangmk.springpropagationparent.pojo.User1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User1Mapper {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
}
