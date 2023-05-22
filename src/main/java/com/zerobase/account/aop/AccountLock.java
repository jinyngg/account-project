package com.zerobase.account.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
@Documented
@Inherited
public @interface AccountLock {

    long tryLockTime() default 5000L;
}