package com.mammonist.calc1;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* com.mammonist.calc1.*.*(..))")
    public void pref(){}

    @AfterReturning(pointcut = "pref()",returning = "result")
    public void log1(JoinPoint joinPoint,Object result){
        Object[] arr = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        if ("add".equals(name)){
            log.info(arr[0] + "+" + arr[1] + "=" + result);
        }else if ("sub".equals(name)){
            log.info(arr[0] + "-" + arr[1] + "=" + result);
        }
    }
    //Around
//    @Around("pref()")
//    public Object log2(ProceedingJoinPoint pjp) throws Throwable {
//        Object[] args = pjp.getArgs();
//        Object result = pjp.proceed(args);
////        log.info(pjp.getSignature().getName());//当前调用的业务逻辑方法名
//        if ("add".equals(pjp.getSignature().getName())){
//            log.info(args[0] + "+" + args[1] + "=" + result);
//        }else if ("sub".equals(pjp.getSignature().getName())){
//            log.info(args[0] + "-" + args[1] + "=" + result);
//        }
//        return result;
//    }
}
