package com.springpropagationparent.yangmk.springpropagationparent.service.impl;

import com.springpropagationparent.yangmk.springpropagationparent.dao.User1Mapper;
import com.springpropagationparent.yangmk.springpropagationparent.pojo.User1;
import com.springpropagationparent.yangmk.springpropagationparent.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yangmingkai
 * @ClassName User1ServiceImpl
 * @Description TODO
 * @date 2018/11/29 4:16 PM
 **/
@Service
public class User1ServiceImpl implements User1Service {

    @Autowired
    private User1Mapper user1Mapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void addRequired(User1 user){
        user1Mapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addRequiresNew(User1 user){
        user1Mapper.insert(user);
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void addNested(User1 user){
        user1Mapper.insert(user);
    }

}
