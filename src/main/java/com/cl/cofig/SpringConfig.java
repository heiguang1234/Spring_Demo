package com.cl.cofig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration//作为配置类，替代xml文件
@ComponentScan(basePackages = {"com.cl"})//定义要扫描的路径NI
public class SpringConfig {
}
