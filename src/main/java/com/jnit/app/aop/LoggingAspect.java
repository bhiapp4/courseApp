package com.jnit.app.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	//execution(returningAnyType allMethodsInUserService TakingAnyArgs)
	@Before("execution(* com.jnit.app.services.UserService.*(..))")
	public void executeBeforeUserServiceCall(JoinPoint jp){
		//prints the name of the method
		System.out.println("Started executing "+jp.getSignature().getName());
		Object[] args = jp.getArgs();
		Arrays.stream(args).forEach(obj ->{
			System.out.println(obj);
		});
		System.out.println("Finished executing before advice");
	}
//
//	@After("execution(* com.jnit.app.services.UserService.*(..))")
//	public void executeAfterUserServiceCall(JoinPoint jp){
//		//prints the name of the method
//		System.out.println("Finished executing "+jp.getSignature().getName());
//		System.out.println("Finished executing after advice");
//	}
//
	@AfterReturning(pointcut="execution(* com.jnit.app.services.UserService.*(..))",
			returning="retVal")
	public void executeAfterReturningUserServiceCall(JoinPoint jp, Object retVal){
		//prints the name of the method
		System.out.println("Finished execution of "+jp.getSignature().getName()+" with ret val =");
		System.out.println(retVal);
		System.out.println("Finished executing after returning advice");
	}
	
//	@Around("execution(* com.jnit.app.services.UserService.*(..))")
//	public Object executeAroundUserCalls(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("Started executing "+pjp.getSignature().getName());
//		Object[] args = pjp.getArgs();
//		Arrays.stream(args).forEach(obj ->{
//			System.out.println(obj);
//		});
//		Object retVal = pjp.proceed();
//		System.out.println("Finished execution of "+pjp.getSignature().getName()+" with ret val =");
//		System.out.println(retVal);
//		System.out.println("Finished executing around advice");
//		return retVal;
//	}
//	
//	@AfterThrowing(pointcut="execution(* com.jnit.app.services.UserService.*(..))",throwing="ex")
//	public void executeWhenException(JoinPoint jp, Exception ex){
//		System.out.println("Execption encounted when executing "+jp.getSignature().getName());
//		System.out.println(ex.getMessage());
//	}
//
}
