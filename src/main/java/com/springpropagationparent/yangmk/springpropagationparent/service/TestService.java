package com.springpropagationparent.yangmk.springpropagationparent.service;

/**
 * @author yangmingkai
 * @ClassName TestService
 * @Description TODO
 * @date 2018/11/29 4:52 PM
 **/
public interface TestService {
    void notransaction_exception_required_required();
    void notransaction_required_required_exception();


    void transaction_exception_required_required();
    void transaction_required_required_exception();
    void transaction_required_required_exception_try();

    void notransaction_exception_requiresNew_requiresNew();
    void notransaction_requiresNew_requiresNew_exception();

    void transaction_exception_required_requiresNew_requiresNew();
    void transaction_required_requiresNew_requiresNew_exception();
    void transaction_required_requiresNew_requiresNew_exception_try();

    void notransaction_exception_nested_nested();
    void notransaction_nested_nested_exception();

    void transaction_exception_nested_nested();
    void transaction_nested_nested_exception();
    void transaction_nested_nested_exception_try();
}
