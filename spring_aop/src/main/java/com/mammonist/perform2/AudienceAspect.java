package com.mammonist.perform2;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j
public class AudienceAspect {
    public void turnOff(){
        log.info("关掉手机");
    }

    public void applaud(JoinPoint joinPoint,Object result){
        log.info("鼓掌");
    }

    public Object exec(ProceedingJoinPoint pjp) throws Throwable {
        log.info("开始事务管理....");
        Object result = pjp.proceed(pjp.getArgs());
        log.info("提交事务.....");
        return result;
    }
}
