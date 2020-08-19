package org.springTest.www.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
    @Pointcut("execution(* com.springSNS.biz..*Impl.*(..))")
    public void allPointcut() {

    }
}