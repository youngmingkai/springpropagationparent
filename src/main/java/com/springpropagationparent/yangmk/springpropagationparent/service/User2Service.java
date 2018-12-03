package com.springpropagationparent.yangmk.springpropagationparent.service;

import com.springpropagationparent.yangmk.springpropagationparent.dao.User2Mapper;
import com.springpropagationparent.yangmk.springpropagationparent.pojo.User2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface User2Service {

    void addRequired(User2 user);

    void addRequiredException(User2 user);

    void addRequiresNew(User2 user);

    void addRequiresNewException(User2 user);

    void addNested(User2 user);

    void addNestedException(User2 user);
}
