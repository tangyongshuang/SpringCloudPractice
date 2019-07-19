package com.anhe.springbootstarteruser.properties;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author albert.tang
 * @create 2019-07-18 16:54
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {
}
