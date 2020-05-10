package com.allen.cap10.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @author 周何圳 2020/4/19 新建
 * @description
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.allen.cap10.aop.Calculator.*(..))")
    public void pointCut(){

    }

    @Before(value = "pointCut()")
    public void logStart(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"除法运行……参数列表是：{"+ Arrays.asList(joinPoint.getArgs())+"}");
    }
    @After("pointCut()")
    public void logEnd(){
        System.out.println("除法结束……");
    }
    @AfterReturning(value = "pointCut()",returning = "result")
    public void logReturn(Object result){
        System.out.println("除法正常返回……结果是：{"+result+"}");
    }
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void logException(Exception exception){
        System.out.println("运行异常……异常信息是：{"+exception+"}");
    }

    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around执行之前");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("@Around执行之后");
        return obj;
    }
}
