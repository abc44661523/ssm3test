package com.mammonist.transaction;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StudentServiceImpl implements StudentService {
    @Override
    public void save() {
        log.info("保存学生");
    }

    @Override
    public void update() {
        log.info("修改学生");
    }

    @Override
    public void delete(int id) {
        log.info("删除学生");
    }
}
