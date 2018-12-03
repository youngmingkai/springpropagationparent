package com.springpropagationparent.yangmk.springpropagationparent.service;

import com.springpropagationparent.yangmk.springpropagationparent.pojo.User1;

public interface User1Service {
    void addRequired(User1 user);

    void addRequiresNew(User1 user);

    void addNested(User1 user);
}
