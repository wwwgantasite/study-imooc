package com.myimooc.spring.tx.demo2;

/**
 * 账户服务
 *
 * @author zc
 * @version v1.0 2017-02-16
 */
public interface AccountService {

    /**
     * 转账
     *
     * @param out   转出账户
     * @param in    转入账户
     * @param money 金额
     */
    void transfer(String out, String in, Double money);
}
