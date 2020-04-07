package com.kind1ess.service.impl;

import com.kind1ess.service.AccountService;

public class AccountServiceImpl implements AccountService {
    public void saveAccount() {
        System.out.println("执行了保存账户");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新账户"+i);
    }

    public int deleteAccount() {

        System.out.println("执行了删除账户");
        return 0;
    }
}
