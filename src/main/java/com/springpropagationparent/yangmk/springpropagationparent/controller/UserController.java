package com.springpropagationparent.yangmk.springpropagationparent.controller;

import com.springpropagationparent.yangmk.springpropagationparent.pojo.User1;
import com.springpropagationparent.yangmk.springpropagationparent.pojo.User2;
import com.springpropagationparent.yangmk.springpropagationparent.service.TestService;
import com.springpropagationparent.yangmk.springpropagationparent.service.User1Service;
import com.springpropagationparent.yangmk.springpropagationparent.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmingkai
 * @ClassName UserController
 * @Description TODO
 * @date 2018/11/29 4:20 PM
 **/
@RestController
public class UserController {

    @Autowired
    private TestService testService;

    /**
     * Propagation.REQUIRED  (有事务环境) 如果没有事务，则新建事务，如果存在事务则加入到当前事务中
     */
    @RequestMapping(value = "notransaction_exception_required_required")
    public void notransaction_exception_required_required(){
        testService.notransaction_exception_required_required();
    }


    @RequestMapping(value = "notransaction_required_required_exception")
    public void notransaction_required_required_exception(){
        testService.notransaction_required_required_exception();
    }

    @RequestMapping(value = "transaction_exception_required_required")
    public void transaction_exception_required_required(){
        testService.transaction_exception_required_required();
    }

    @RequestMapping(value = "transaction_required_required_exception")
    public void transaction_required_required_exception(){
        testService.transaction_required_required_exception();
    }

    @RequestMapping(value = "transaction_required_required_exception_try")
    public void transaction_required_required_exception_try(){
        testService.transaction_required_required_exception_try();
    }


    /**
     * Propagation.REQUIRES_NEW  (有事务环境)  总是开启一个新的事务。如果一个事务已经存在，则将这个存在的事务挂起
     *
     */

    @RequestMapping(value = "notransaction_exception_requiresNew_requiresNew")
    public void notransaction_exception_requiresNew_requiresNew(){
        testService.notransaction_exception_requiresNew_requiresNew();
    }

    @RequestMapping(value = "notransaction_requiresNew_requiresNew_exception")
    public void notransaction_requiresNew_requiresNew_exception(){
        testService.notransaction_requiresNew_requiresNew_exception();
    }

    @RequestMapping(value = "transaction_exception_required_requiresNew_requiresNew")
    public void transaction_exception_required_requiresNew_requiresNew(){
        testService.transaction_exception_required_requiresNew_requiresNew();
    }

    @RequestMapping(value = "transaction_required_requiresNew_requiresNew_exception")
    public void transaction_required_requiresNew_requiresNew_exception(){
        testService.transaction_required_requiresNew_requiresNew_exception();
    }

    @RequestMapping(value = "transaction_required_requiresNew_requiresNew_exception_try")
    public void transaction_required_requiresNew_requiresNew_exception_try(){
        testService.transaction_required_requiresNew_requiresNew_exception_try();
    }



    /**
     * Propagation.MANDATORY  (有事务环境)  必须在一个事务中执行，没有事务则抛出异常
     *
     */

    /**
     * Propagation.SUPPORTS  (可有可无事务环境)  如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行
     *
     */

    /**
     * Propagation.NEVER  (无事务环境)  如果有事务存在，则抛出异常
     *
     */

    /**
     * Propagation.NOT_SUPPORTED  (无事务环境)  如果有事务存在，则挂起当前事务
     *
     */

    /**
     * Propagation.NESTED  (嵌套事务环境)  表示如果当前方法正有一个事务在运行中，则该方法应该运行在一个嵌套事务中，被嵌套的事务可以独立于被封装的事务中进行提交或者回滚。如果封装事务存在，并且外层事务抛出异常回滚，那么内层事务必须回滚，反之，内层事务并不影响外层事务。如果封装事务不存在，则同PROPAGATION_REQUIRED的一样
     *
     */
    @RequestMapping(value = "notransaction_exception_nested_nested")
    public void notransaction_exception_nested_nested(){
        testService.notransaction_exception_nested_nested();
    }

    @RequestMapping(value = "notransaction_nested_nested_exception")
    public void notransaction_nested_nested_exception(){
        testService.notransaction_nested_nested_exception();
    }

    @RequestMapping(value = "transaction_exception_nested_nested")
    public void transaction_exception_nested_nested(){
        testService.transaction_exception_nested_nested();
    }

    @RequestMapping(value = "transaction_nested_nested_exception")
    public void transaction_nested_nested_exception(){
        testService.transaction_nested_nested_exception();
    }

    @RequestMapping(value = "transaction_nested_nested_exception_try")
    public void transaction_nested_nested_exception_try(){
        testService.transaction_nested_nested_exception_try();
    }




}
