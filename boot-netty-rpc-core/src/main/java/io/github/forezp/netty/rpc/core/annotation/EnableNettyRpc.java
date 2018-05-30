package io.github.forezp.netty.rpc.core.annotation;

import io.github.forezp.netty.rpc.core.annotation.scan.NettyRpcRegistrar;
import io.github.forezp.netty.rpc.core.config.NettyRpcConfig;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * ${DESCRIPTION}
 *
 * @author fangzhipeng
 * create 2018-05-24
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({NettyRpcRegistrar.class, NettyRpcConfig.class})
public @interface EnableNettyRpc {


    String[] basePackages() default {};


}