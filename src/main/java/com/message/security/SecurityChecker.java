package com.message.security;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class SecurityChecker {

    public static final Logger log = LoggerFactory.getLogger(SecurityChecker.class);

    @Pointcut("@annotation(com.message.security.SecurityCheck)")
    public void checkMethodSecurity() {
    }

    @Around("checkMethodSecurity()")
    public Object checkSecurity(ProceedingJoinPoint joinPoint) throws Throwable {
        log.debug("Checking method security...");

        //TODO Implement Security checks here
        Object result = joinPoint.proceed();
        return result;
    }

}
