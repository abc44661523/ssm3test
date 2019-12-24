package com.mammonist.transaction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionAspect {
    public void startTransaction() {
        log.info("开始事务");
    }

    public void commit() {
        log.info("提交事务");
    }
}
