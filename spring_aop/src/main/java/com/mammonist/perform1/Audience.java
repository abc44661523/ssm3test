package com.mammonist.perform1;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面类，提供通用服务
@Slf4j
@Aspect
@Component
public class Audience {
    long start;

    //切点
    @Pointcut("execution(* com.mammonist.perform1.*.*(..))")
    public void perf(){}

    //说明：该方法在com.mammonist.perform1.PerformImpl.perform()
//    @Before("perf()")
//    public void turnOff(){
//        start = System.currentTimeMillis();
//        log.info("关掉手机");
//    }

    @AfterReturning(pointcut = "perf()",returning = "result")
    public void applaud(JoinPoint joinPoint,Object result){
        log.info("鼓,方法签名" + joinPoint.getSignature().toLongString());
        Object[] arr = joinPoint.getArgs();
        log.info("参数：" + joinPoint.getArgs().length);
        for (Object o : arr) {
            log.info("参数值" + o);
        }

        log.info("方法的返回值" + result);
        long end = System.currentTimeMillis();
        log.info("时间：" + (end - start));
    }

    @Around(value = "perf()")
    public Object exec(ProceedingJoinPoint pjp) throws Throwable {
        log.info("in around....");
        Object result = pjp.proceed(pjp.getArgs());
        return result;
    }
}
