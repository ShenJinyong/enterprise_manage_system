package com.pxxy.common.annotation;

import com.pxxy.common.enums.LogType;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LessLog {

    LogType type() default LogType.NONE;
}